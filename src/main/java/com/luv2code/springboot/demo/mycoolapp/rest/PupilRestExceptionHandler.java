package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class PupilRestExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<PupilErrorResponse> handleException(PupilNotFoundException exc) {
        PupilErrorResponse error = new PupilErrorResponse();
        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    // add another exception handler ... to catch any exceptions
    @ExceptionHandler
    public ResponseEntity<PupilErrorResponse> handleException(Exception exc) {
        PupilErrorResponse error = new PupilErrorResponse();
        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

}
