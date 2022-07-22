package br.com.netbook.dto.exceptions;

import org.springframework.http.HttpStatus;

public class ApiErrorResponse {
	private final HttpStatus status;
	private final String message;

	public ApiErrorResponse(HttpStatus status, String message) {
		this.status = status;
		this.message = message;
	}

	public HttpStatus getStatus() {
		return this.status;
	}

	public String getMessage() {
		return this.message;
	}

}
