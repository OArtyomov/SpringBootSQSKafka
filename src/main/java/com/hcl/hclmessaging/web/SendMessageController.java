package com.hcl.hclmessaging.web;

import com.hcl.hclmessaging.web.dto.RequestDTO;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Slf4j
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SendMessageController {

    @RequestMapping(value = "/raiseMethodArgumentNotValid", method = RequestMethod.POST)
    public void checkMethodArgumentNotValid(@Valid RequestDTO requestDTO) {

    }
}
