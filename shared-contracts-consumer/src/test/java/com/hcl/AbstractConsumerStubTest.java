package com.hcl;

import com.hcl.config.TestClassesConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK, classes = TestClassesConfiguration.class)
@AutoConfigureStubRunner(ids = {"com.hcl:hclmessaging:0.0.1-SNAPSHOT:stubs:8090"},
        stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public abstract class AbstractConsumerStubTest {

    @Autowired
    protected RestTemplate restTemplate;

    @Autowired
    protected MockMvc mockMvc;
}
