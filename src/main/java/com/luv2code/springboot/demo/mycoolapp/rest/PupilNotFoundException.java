package com.luv2code.springboot.demo.mycoolapp.rest;

public class PupilNotFoundException extends RuntimeException {
    public PupilNotFoundException(String message) {
        super(message);
    }

    public PupilNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PupilNotFoundException(Throwable cause) {
        super(cause);
    }
}
