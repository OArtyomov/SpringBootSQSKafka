package com.hcl;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class ConsumerTest extends AbstractConsumerStubTest {

    @Test
    public void testLogic() {
        ResponseEntity<Map> result = restTemplate.getForEntity("http://localhost:8090/products/1", Map.class);
        assertThat(result.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}
