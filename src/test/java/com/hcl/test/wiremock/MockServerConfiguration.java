package com.hcl.test.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.StandardEnvironment;

import java.util.Map;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static com.google.common.collect.ImmutableMap.of;
import static com.hcl.hclmessaging.test.AbstractBaseTest.WIRE_MOCK_PORT_PROPERTY_NAME;
import static org.springframework.util.SocketUtils.findAvailableTcpPort;

@Configuration
public class MockServerConfiguration {

    @Bean
    public WireMockServer wireMockBean(StandardEnvironment environment) {
        int availableTcpPort = findAvailableTcpPort();
        Map<String, Object> source = of(WIRE_MOCK_PORT_PROPERTY_NAME, availableTcpPort);
        environment.getPropertySources().addLast(new MapPropertySource("wireMock", source));

        WireMockConfiguration wireMockConfiguration = wireMockConfig().port(availableTcpPort);
        WireMockServer wireMockServer = new WireMockServer(wireMockConfiguration);
        wireMockServer.start();
        return wireMockServer;
    }

}
