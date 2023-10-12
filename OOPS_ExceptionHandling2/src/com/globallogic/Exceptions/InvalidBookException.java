package com.globallogic.Exceptions;

public class InvalidBookException extends RuntimeException {

	private String msg;

	public InvalidBookException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
	
	
}
