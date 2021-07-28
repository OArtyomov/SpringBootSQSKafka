package com.hcl.hclmessaging.configuration;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import com.hcl.hclmessaging.service.kafka.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.config.QueueMessageHandlerFactory;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.PayloadMethodArgumentResolver;
import org.springframework.messaging.support.GenericMessage;

import java.util.function.Consumer;

import static com.hcl.hclmessaging.utils.Constants.KAFKA_INPUT_BINDINGS;
import static java.util.Collections.singletonList;

@Configuration
@Slf4j
public class ApplicationBeans {

    @Bean(KAFKA_INPUT_BINDINGS)
    public Consumer<GenericMessage<KafkaMessageDTO>> kafkaMessageListener(KafkaService kafkaService) {
        return kafkaService::processConsumedMessage;
    }

    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {
        return new QueueMessagingTemplate(amazonSQSAsync);
    }

    @Bean
    public QueueMessageHandlerFactory queueMessageHandlerFactory() {
        QueueMessageHandlerFactory factory = new QueueMessageHandlerFactory();
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setStrictContentTypeMatch(false);
        factory.setArgumentResolvers(singletonList(new PayloadMethodArgumentResolver(messageConverter)));
        return factory;
    }
}
