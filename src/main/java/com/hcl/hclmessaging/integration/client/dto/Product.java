package com.hcl.hclmessaging.integration.client.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private Long id;

    private String name;

    private String description;

    private Boolean featured;
}
