package com.hcl.hclmessaging.service.kafka;

import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class KafkaListener {

    @StreamListener(value = "input")
    public void consumeMessageFromKafka(@Payload KafkaMessageDTO dto){
        log.info("Message: {}", dto);
    }
}
