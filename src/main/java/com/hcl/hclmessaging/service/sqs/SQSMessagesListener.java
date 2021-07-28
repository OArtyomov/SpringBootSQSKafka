package com.hcl.hclmessaging.service.sqs;

import com.hcl.hclmessaging.dto.KafkaMessageDTO;
import com.hcl.hclmessaging.dto.SQSMessageDTO;
import com.hcl.hclmessaging.service.kafka.KafkaService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.util.Map;

import static org.springframework.cloud.aws.messaging.listener.SqsMessageDeletionPolicy.ON_SUCCESS;

@Service
@AllArgsConstructor
@Slf4j
public class SQSMessagesListener {

    private KafkaService kafkaService;

    @SqsListener(value = "${sqs.queue}", deletionPolicy = ON_SUCCESS)
    public void processMessage(@Payload SQSMessageDTO dto, @Headers Map<String, String> headers) {
        log.info("Receive message from SQS: {}", dto);
        log.info("Headers: {}", headers);
        kafkaService.sendMessage(convert(dto));
    }

    private KafkaMessageDTO convert(SQSMessageDTO input) {
        KafkaMessageDTO dto = new KafkaMessageDTO();
        dto.setName(input.getName());
        return dto;
    }
}
