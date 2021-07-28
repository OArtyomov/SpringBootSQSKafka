package com.hcl.hclmessaging.configuration;

import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import com.hcl.hclmessaging.service.kafka.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.support.GenericMessage;

import java.util.function.Consumer;

import static com.hcl.hclmessaging.utils.Constants.KAFKA_INPUT_BINDINGS;

@Configuration
@Slf4j
public class ApplicationBeans {

    @Bean(KAFKA_INPUT_BINDINGS)
    public Consumer<GenericMessage<KafkaMessageDTO>> kafkaMessageListener(KafkaService kafkaService) {
         return kafkaService::processConsumedMessage;
    }
}
