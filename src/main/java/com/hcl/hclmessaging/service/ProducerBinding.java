package com.hcl.hclmessaging.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface ProducerBinding {

    @Output("output")
    MessageChannel outputChannel();

    @Input("input")
    MessageChannel inputChannel();
}