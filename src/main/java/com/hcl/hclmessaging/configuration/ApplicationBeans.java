package com.hcl.hclmessaging.configuration;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import com.hcl.hclmessaging.service.kafka.KafkaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.core.env.ResourceIdResolver;
import org.springframework.cloud.aws.messaging.config.QueueMessageHandlerFactory;
import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.handler.annotation.support.HeaderMethodArgumentResolver;
import org.springframework.messaging.handler.annotation.support.PayloadMethodArgumentResolver;
import org.springframework.messaging.handler.invocation.HandlerMethodArgumentResolver;
import org.springframework.messaging.support.GenericMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.hcl.hclmessaging.utils.Constants.KAFKA_INPUT_BINDINGS;

@Configuration
@Slf4j
public class ApplicationBeans {

    @Bean(KAFKA_INPUT_BINDINGS)
    public Consumer<GenericMessage<KafkaMessageDTO>> kafkaMessageListener(KafkaService kafkaService) {
        return kafkaService::processConsumedMessage;
    }

    @Bean
    public QueueMessagingTemplate queueMessagingTemplate(AmazonSQSAsync amazonSQSAsync) {

        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setStrictContentTypeMatch(false);
        messageConverter.setSerializedPayloadClass(String.class);

        return new QueueMessagingTemplate(amazonSQSAsync, (ResourceIdResolver) null, messageConverter);
    }

    @Bean
    public QueueMessageHandlerFactory queueMessageHandlerFactory() {
        QueueMessageHandlerFactory factory = new QueueMessageHandlerFactory();
        factory.setArgumentResolvers(buildArgumentResolversList());
        return factory;
    }

    private List<HandlerMethodArgumentResolver> buildArgumentResolversList() {
        MappingJackson2MessageConverter messageConverter = new MappingJackson2MessageConverter();
        messageConverter.setStrictContentTypeMatch(false);
        List<HandlerMethodArgumentResolver> result = new ArrayList<>();
        result.add(new PayloadMethodArgumentResolver(messageConverter, null, false));
        result.add(new HeaderMethodArgumentResolver(null, null));
        return result;
    }
}
