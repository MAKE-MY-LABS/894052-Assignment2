package com.training.assignment2.exception;

// Create exception class InsufficientBalanceException
public class InsufficientBalanceException extends Exception {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message) {
        super(message);
    }
}