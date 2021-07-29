package com.hcl.hclmessaging.service.kafka;

import com.hcl.hclmessaging.dto.auro.KafkaMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

import static com.hcl.hclmessaging.utils.Constants.KAFKA_OUTPUT_BINDINGS;
import static org.springframework.cloud.stream.schema.avro.AvroSchemaRegistryClientMessageConverter.DEFAULT_AVRO_MIME_TYPE;
import static org.springframework.messaging.support.MessageBuilder.createMessage;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaService {

    private StreamBridge streamBridge;

    public void sendMessage(KafkaMessageDTO kafkaMessageDTO) {
        Message<KafkaMessageDTO> message = buildMessage(kafkaMessageDTO);
        streamBridge.send(KAFKA_OUTPUT_BINDINGS, message, DEFAULT_AVRO_MIME_TYPE);
        log.info("Message is sent to Kafka");
    }

    private Message<KafkaMessageDTO> buildMessage(KafkaMessageDTO kafkaMessageDTO) {
        Map<String, Object> headersAsMap = new HashMap<>();
        return createMessage(kafkaMessageDTO, new MessageHeaders(headersAsMap));
    }

    public void processConsumedMessage(GenericMessage<KafkaMessageDTO> message) {
        log.info("Receive message from Kafka: {}", message);
    }
}
