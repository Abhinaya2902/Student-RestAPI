package com.example.Studentrest.exception;


@SuppressWarnings("serial")
public class ResponseNotFoundException extends RuntimeException {
    public ResponseNotFoundException(String message) {
        super(message);
    }
}
