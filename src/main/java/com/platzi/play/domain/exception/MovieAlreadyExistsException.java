package com.platzi.play.domain.exception;

public class MovieAlreadyExistsException extends RuntimeException{
    public MovieAlreadyExistsException(String movieTittle){
        super("La pelicula "+movieTittle+ " ya existe.");
    }
}
