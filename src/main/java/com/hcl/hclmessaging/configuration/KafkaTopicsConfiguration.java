package com.hcl.hclmessaging.configuration;

import com.hcl.hclmessaging.service.ProducerBinding;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableBinding(ProducerBinding.class)
public class KafkaTopicsConfiguration {
}
