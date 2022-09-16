package com.devsuperior.dscatalog.resources.exceptions;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.devsuperior.dscatalog.services.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ExceptionHandlerController {
    
    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<StandardError> resourceNotfoundException(ResourceNotFoundException e, HttpServletRequest r) {
        StandardError err = new StandardError();
        err.setTimestamp(Instant.now());
        err.setError("Entity not found");
        err.setStatus(HttpStatus.NOT_FOUND.value());
        err.setMessage(e.getMessage());
        err.setPath(r.getRequestURI());

        return ResponseEntity.status(err.getStatus()).body(err);
    }
}
