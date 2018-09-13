package com.mycorp;

public class ZendeskException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ZendeskException() {
	}

	public ZendeskException(String message) {
		super(message);
	}

	public ZendeskException(String message, Throwable cause) {
		super(message, cause);
	}

	public ZendeskException(Throwable cause) {
		super(cause);
	}
}
