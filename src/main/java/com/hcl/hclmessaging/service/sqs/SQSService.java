package com.hcl.hclmessaging.service.sqs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcl.hclmessaging.dto.SQSMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.messaging.support.MessageBuilder.createMessage;

@Service
@AllArgsConstructor
@Slf4j
public class SQSService {

    private QueueMessagingTemplate queueMessagingTemplate;

    private ObjectMapper objectMapper;

    public void sendMessage() {
        queueMessagingTemplate.send("HCLSQSQueue", buildMessage());
    }

    private Message<String> buildMessage() {
        SQSMessageDTO dto = new SQSMessageDTO();
        dto.setName("BB");
        dto.setId(23L);
        Map<String, Object> headersAsMap = new HashMap<>();
        MessageHeaders headers = new MessageHeaders(headersAsMap);
        try {
            return createMessage(objectMapper.writeValueAsString(dto), headers);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
