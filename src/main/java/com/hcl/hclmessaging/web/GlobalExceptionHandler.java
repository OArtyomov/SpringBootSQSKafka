package com.hcl.hclmessaging.web;

import com.hcl.hclmessaging.web.dto.ErrorDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BindException.class)
    public ResponseEntity<ErrorDTO> checkMethodArgumentNotValid(BindException error) {
        ErrorDTO body = new ErrorDTO();
        body.setMessage(error.getMessage());
        return ResponseEntity.badRequest().body(body);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDTO> checkException(Exception error) {
        ErrorDTO body = new ErrorDTO();
        body.setMessage(error.getMessage());
        return ResponseEntity.internalServerError().body(body);
    }


}
