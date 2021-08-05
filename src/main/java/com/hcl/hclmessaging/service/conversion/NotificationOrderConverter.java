package com.hcl.hclmessaging.service.conversion;

import com.hcl.hclmessaging.dto.auro.Data;
import com.hcl.hclmessaging.dto.auro.KafkaOrderMessageDTO;
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
public class NotificationOrderConverter implements Converter<Notification, KafkaOrderMessageDTO> {

    @Override
    public KafkaOrderMessageDTO convert(Notification source) {
        KafkaOrderMessageDTO result = new KafkaOrderMessageDTO();
        result.setData(new Data());
        return result;
    }
}
