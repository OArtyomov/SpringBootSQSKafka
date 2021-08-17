package com.hcl;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;

import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class ConsumerTest extends AbstractConsumerStubTest {

    @Test
    public void testLogicWhenOk() {
        ResponseEntity<Map> result = restTemplate.getForEntity("http://localhost:8090/products/1", Map.class);
        assertThat(result.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    public void testLogicWhenNotFound() {
        try {
            restTemplate.getForEntity("http://localhost:8090/products/2", Map.class);
            fail();
        } catch (HttpClientErrorException.NotFound e) {

        }
    }
}
