package org.gabriel.workshopmongo.resources.exceptions;

import jakarta.servlet.http.HttpServletRequest;
import org.gabriel.workshopmongo.services.exception.ObjectNotFoundExecption;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandller {

    @ExceptionHandler(ObjectNotFoundExecption.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundExecption e, HttpServletRequest request) {
        HttpStatus satus = HttpStatus.NOT_FOUND;
        StandardError error = new StandardError(System.currentTimeMillis(), satus.value(), "Não encontrado", e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(satus).body(error);
    }

}
