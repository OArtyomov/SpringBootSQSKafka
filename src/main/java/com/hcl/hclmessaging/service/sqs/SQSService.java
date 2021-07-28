package com.hcl.hclmessaging.service.sqs;

import com.hcl.hclmessaging.dto.SQSMessageDTO;
import com.hcl.hclmessaging.service.config.ApplicationConfiguration;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class SQSService {

    private QueueMessagingTemplate queueMessagingTemplate;

    private ApplicationConfiguration applicationConfiguration;

    public void sendMessage() {
        Map<String, Object> headers = new HashMap<>();
        queueMessagingTemplate.convertAndSend(applicationConfiguration.getSqsQueueName(),
                buildMessage(), headers);
    }

    private SQSMessageDTO buildMessage() {
        SQSMessageDTO dto = new SQSMessageDTO();
        Long currentTime = System.currentTimeMillis();
        dto.setName("Current time: " + currentTime);
        dto.setId(currentTime);
        return dto;
    }

}
