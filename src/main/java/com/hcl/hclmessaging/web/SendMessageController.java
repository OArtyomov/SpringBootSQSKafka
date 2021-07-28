package com.hcl.hclmessaging.web;

import com.hcl.hclmessaging.service.kafka.KafkaService;
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

    private KafkaService kafkaService;

    private SQSService sqsService;

    @RequestMapping("/sendToKafka")
    public void sendMessageToKafka() {
        kafkaService.sendMessage();
    }

    @RequestMapping("/sendToSQS")
    public void sendMessageToSQS() {
        sqsService.sendMessage();
    }
}
