package com.sky.exception;

public class TitleNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public TitleNotFoundException() {
		System.out.println(" The movie service could not find the given Movie");
	}

	public TitleNotFoundException(String message) {
		super(message);
	}

	public TitleNotFoundException(Throwable cause) {
		super(cause);
	}

	public TitleNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
