package com.hcl.hclmessaging.service.sqs;

import com.hcl.hclmessaging.dto.SQSMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

import static org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy.ON_SUCCESS;

@Service
@AllArgsConstructor
@Slf4j
public class SQSMessagesListener {

    @SqsListener(value = "${sqs.queue}", deletionPolicy = ON_SUCCESS)
    public void processMessage(SQSMessageDTO dto) {
        log.info("Message is here: {}", dto);
    }
}
