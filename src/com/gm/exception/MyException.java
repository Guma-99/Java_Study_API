package com.gm.exception;

public class MyException extends Exception {
	
	public MyException() {
		super("몰라요 수학 포기");
	}
	public MyException(String message) {
		super(message);
	}
}