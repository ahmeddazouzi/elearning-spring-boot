package com.enicarthage.elearningbackend.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
 class RessourseNotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public RessourseNotFoundException(String message){
        super(message);
    }
}
