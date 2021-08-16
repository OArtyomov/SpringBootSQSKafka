package com.hcl.client.integration.configuration;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.hcl.client.integration")
@EnableFeignClients(basePackages = "com.hcl.client.integration")
public class ProductAutoConfiguration {
}
