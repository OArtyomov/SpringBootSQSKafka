package com.hcl.hclmessaging.service.sqs;

import com.hcl.hclmessaging.dto.order.Notification;
import com.hcl.hclmessaging.service.conversion.NotificationOrderConverter;
import com.hcl.hclmessaging.service.kafka.KafkaService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
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
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class SQSMessagesListener {

    private KafkaService kafkaService;

    private NotificationOrderConverter notificationOrderConverter;

    @SqsListener(value = "${sqs.queue}", deletionPolicy = ON_SUCCESS)
    public void processMessage(@Payload Notification dto, @Headers Map<String, String> headers) {
        log.info("Receive message from SQS: {}", dto);
        log.info("Headers: {}", headers);
        kafkaService.sendMessage(notificationOrderConverter.convert(dto));
    }
}
