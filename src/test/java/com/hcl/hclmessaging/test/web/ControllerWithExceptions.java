package com.hcl.hclmessaging.test.web;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ControllerWithExceptions {

    @RequestMapping(value = "/raiseMethodArgumentNotValid", method = RequestMethod.POST)
    public void checkMethodArgumentNotValid(@Valid RequestDTO requestDTO) {

    }
}
