package com.hcl.hclmessaging.service.sqs;

import com.hcl.hclmessaging.dto.SQSMessageDTO;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class SQSMessagesListener {

    @SqsListener(value = "HCLSQSQueue", deletionPolicy = SqsMessageDeletionPolicy.ON_SUCCESS)
    public void processMessage(SQSMessageDTO dto){
        log.info("Message is here: {}", dto);
   }
}
