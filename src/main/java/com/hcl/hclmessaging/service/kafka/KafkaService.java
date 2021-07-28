package com.hcl.hclmessaging.service.kafka;

import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import com.hcl.hclmessaging.service.ProducerBinding;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaService {
    private ProducerBinding producerBinding;

    public void sendMessage() {
        Message<KafkaMessageDTO> message = buildMessage();
        producerBinding.outputChannel().send(message);
        log.info("Message is sent");
    }

    private Message<KafkaMessageDTO> buildMessage() {
        KafkaMessageDTO dto = new KafkaMessageDTO();
        dto.setName("AAA");
        Map<String, Object> headersAsMap = new HashMap<>();
        MessageHeaders headers = new MessageHeaders(headersAsMap);
        return MessageBuilder.createMessage(dto, headers);
    }


}
