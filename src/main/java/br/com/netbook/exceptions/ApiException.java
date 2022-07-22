package br.com.netbook.exceptions;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	private HttpStatus statusCode;
	
	public ApiException(String message, Throwable cause, HttpStatus statusCode) {
		super(message, cause);
		this.statusCode = statusCode;
	}
	
	public ApiException(String message, HttpStatus statusCode) {
		super(message);
		this.statusCode = statusCode;
	}
	
	public HttpStatus getStatusCode() {
		return this.statusCode;
	}
	
}
