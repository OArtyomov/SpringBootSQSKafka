package com.hcl.hclmessaging.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class SendMessageController {


    @RequestMapping("/send")
    public void sendMessage() {
      log.info("Send");
    }
}
