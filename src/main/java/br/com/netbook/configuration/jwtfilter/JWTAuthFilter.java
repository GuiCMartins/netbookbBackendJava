package br.com.netbook.configuration.jwtfilter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.filter.OncePerRequestFilter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;

import br.com.netbook.dto.exceptions.ApiErrorResponse;
import br.com.netbook.exceptions.ApiException;

@Configuration
public class JWTAuthFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		try {
			String authorization = request.getHeader("Authorization");
			System.out.println(authorization);
			if (authorization != null && authorization.startsWith("Bearer")) {
				String token = authorization.split(" ")[1];

				try {
					FirebaseAuth.getInstance().verifyIdToken(token);
				} catch (FirebaseAuthException e) {
					e.printStackTrace();
					throw new ApiException("Unauthorized", HttpStatus.UNAUTHORIZED);
				}
			} else {
				throw new ApiException("Unauthorized", HttpStatus.UNAUTHORIZED);
			}
			filterChain.doFilter(request, response);
		} catch (ApiException e) {
			e.printStackTrace();
			errorHandler(e.getStatusCode(), e.getMessage(), response);
		} catch (Exception e) {
			e.printStackTrace();
			errorHandler(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage(), response);
		}
	}

	private String convertObjectToJson(Object object) throws JsonProcessingException {
		if (object == null) {
			return null;
		}
		ObjectMapper mapper = new ObjectMapper();
		mapper.findAndRegisterModules();
		return mapper.writeValueAsString(object);
	}

	private void errorHandler(HttpStatus status, String message, HttpServletResponse response) {
		ApiErrorResponse apiError = new ApiErrorResponse(status, message);

		response.setStatus(status.value());
		try {
			response.getWriter().write(convertObjectToJson(apiError));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}