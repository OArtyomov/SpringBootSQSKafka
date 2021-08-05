package com.hcl.hclmessaging.dto.order;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SQSMessageDTO {
    private Long id;

    private String name;
}
