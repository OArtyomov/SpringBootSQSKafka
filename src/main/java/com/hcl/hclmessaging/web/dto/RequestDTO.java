package com.hcl.hclmessaging.web.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestDTO {
    @NotEmpty
    private String text;
}
