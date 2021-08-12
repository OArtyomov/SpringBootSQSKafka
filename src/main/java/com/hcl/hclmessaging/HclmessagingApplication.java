package com.hcl.hclmessaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HclmessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HclmessagingApplication.class, args);
	}

}
