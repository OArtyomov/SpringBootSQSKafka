package com.hcl.hclmessaging.service.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Getter
public class ApplicationConfiguration {

    @Value("${sqs.queue}")
    private String sqsQueueName;
}
