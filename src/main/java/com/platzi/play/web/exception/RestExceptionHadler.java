package com.platzi.play.web.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndViewDefiningException;

@RestControllerAdvice
public class RestExceptionHadler {
    @ExceptionHandler(ModelAndViewDefiningException.class)
    public ResponseEntity<Error> handleException(Exception e){
        Error error = new Error("movie-already-exists", e.getMessage());
        return ResponseEntity.badRequest().body(error);
    }
}
