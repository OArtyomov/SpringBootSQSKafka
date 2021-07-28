package com.hcl.hclmessaging.service.sqs;

import com.hcl.hclmessaging.dto.SQSMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.stereotype.Service;

import java.util.Map;

import static org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy.ON_SUCCESS;

@Service
@AllArgsConstructor
@Slf4j
public class SQSMessagesListener {

    @SqsListener(value = "${sqs.queue}", deletionPolicy = ON_SUCCESS)
    public void processMessage(@Payload  SQSMessageDTO dto, @Headers Map<String, String> headers) {
        log.info("Receive message from SQS: {}", dto);
        log.info("Headers: {}", headers);
    }
}
