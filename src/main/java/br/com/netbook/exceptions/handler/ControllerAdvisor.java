package br.com.netbook.exceptions.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.netbook.dto.exceptions.ApiErrorResponse;
import br.com.netbook.exceptions.ApiException;

@ControllerAdvice
public class ControllerAdvisor extends ResponseEntityExceptionHandler {

	@ExceptionHandler(value = { ApiException.class })
	protected ResponseEntity<Object> handleApidException(ApiException ex, WebRequest request) {
		return new ResponseEntity<>(new ApiErrorResponse(ex.getStatusCode(), ex.getMessage()), ex.getStatusCode());
	}

}
