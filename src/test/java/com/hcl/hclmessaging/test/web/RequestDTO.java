package com.hcl.hclmessaging.test.web;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class RequestDTO {
    @NotEmpty
    private String text;
}
