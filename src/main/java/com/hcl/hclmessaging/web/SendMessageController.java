package com.hcl.hclmessaging.web;

import com.hcl.hclmessaging.service.sqs.SQSService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SendMessageController {

    private SQSService sqsService;

    @RequestMapping("/sendToSQS")
    public void sendMessageToSQS() {
        sqsService.sendMessage();
    }
}
