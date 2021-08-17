package com.hcl.hclmessaging.test.configuration;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.web.servlet.MockMvc;

import javax.annotation.PostConstruct;

@Configuration
public class RestAsuredConfiguration {

    @Autowired
    private MockMvc mockMvc;

    @PostConstruct
    public void afterConstruction(){
        RestAssuredMockMvc.mockMvc(mockMvc);
    }
}
