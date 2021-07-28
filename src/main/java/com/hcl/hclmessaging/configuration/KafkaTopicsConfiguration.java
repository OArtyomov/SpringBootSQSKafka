package com.hcl.hclmessaging.configuration;

import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

import static com.hcl.hclmessaging.utils.Constants.KAFKA_INPUT_BINDINGS;

@Configuration
@Slf4j
public class KafkaTopicsConfiguration {

    @Bean(KAFKA_INPUT_BINDINGS)
    public Consumer<KafkaMessageDTO> kafkaMessageListener() {
        return kafkaMessageDTO -> log.info("Message: {}", kafkaMessageDTO);
    }
}
