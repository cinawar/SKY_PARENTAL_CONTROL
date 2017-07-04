package com.sky.exception;

public class TechnicalFailureException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TechnicalFailureException() {
		System.out.println(" Sorry! Can not watch this movie");
	}

	public TechnicalFailureException(String message) {
		super(message);
	}

	public TechnicalFailureException(Throwable cause) {
		super(cause);
	}

	public TechnicalFailureException(String message, Throwable cause) {
		super(message, cause);
	}

}
