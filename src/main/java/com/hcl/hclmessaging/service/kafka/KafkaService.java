package com.hcl.hclmessaging.service.kafka;

import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.hcl.hclmessaging.utils.Constants.KAFKA_OUTPUT_BINDINGS;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaService {

    private StreamBridge streamBridge;

    public void sendMessage() {
        Message<KafkaMessageDTO> message = buildMessage();
        streamBridge.send(KAFKA_OUTPUT_BINDINGS, message);
        log.info("Message is sent");
    }

    private Message<KafkaMessageDTO> buildMessage() {
        KafkaMessageDTO dto = new KafkaMessageDTO();
        dto.setName("AAA");
        Map<String, Object> headersAsMap = new HashMap<>();
        MessageHeaders headers = new MessageHeaders(headersAsMap);
        return MessageBuilder.createMessage(dto, headers);
    }

    public void processConsumedMessage(GenericMessage<KafkaMessageDTO> message){
        log.info("Message: {}", message);
    }
}
