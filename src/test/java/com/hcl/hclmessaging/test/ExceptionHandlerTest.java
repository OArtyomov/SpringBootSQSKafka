package com.hcl.hclmessaging.test;

import com.hcl.hclmessaging.web.dto.RequestDTO;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.StringContains.containsString;
import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class ExceptionHandlerTest extends AbstractBaseTest {

    @Test
    public void testMethodArgumentNotValid() throws Exception {
        RequestDTO dto = new RequestDTO();
        mockMvc.perform(post("/raiseMethodArgumentNotValid")
                        .contentType(APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(dto))
                )
                .andExpect(status().isBadRequest())
                .andExpect(content().contentType(APPLICATION_JSON))
                .andExpect(jsonPath("$.message").value(containsString("must not be empty")));
    }
}
