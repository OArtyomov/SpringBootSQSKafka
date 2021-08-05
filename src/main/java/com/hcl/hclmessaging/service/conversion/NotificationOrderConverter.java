package com.hcl.hclmessaging.service.conversion;

import com.hcl.hclmessaging.dto.auro.KafkaMessageDTO;
import com.hcl.hclmessaging.dto.order.Notification;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class NotificationOrderConverter implements Converter<Notification, KafkaMessageDTO> {


    @Override
    public KafkaMessageDTO convert(Notification source) {
        KafkaMessageDTO result = new KafkaMessageDTO();
        result.setName("AAA");
        return result;
    }
}
