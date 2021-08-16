package com.hcl.client.integration.dto;

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
