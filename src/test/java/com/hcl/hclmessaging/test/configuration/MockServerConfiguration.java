package com.hcl.hclmessaging.test.configuration;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ClasspathFileSource;
import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.common.SingleRootFileSource;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.standalone.JsonFileMappingsSource;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.StandardEnvironment;

import java.util.Map;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static com.google.common.collect.ImmutableMap.of;
import static com.hcl.hclmessaging.test.AbstractBaseTest.MAPPING_PATH_PROPERTY_NAME;
import static com.hcl.hclmessaging.test.AbstractBaseTest.WIRE_MOCK_PORT_PROPERTY_NAME;
import static org.springframework.util.SocketUtils.findAvailableTcpPort;

@Configuration
@ConditionalOnMissingBean(WireMockServer.class)
public class MockServerConfiguration {

    @Bean
    public MapPropertySource wireMockPropertySource(StandardEnvironment environment) {
        Map<String, Object> source = of(WIRE_MOCK_PORT_PROPERTY_NAME, findAvailableTcpPort());
        MapPropertySource propertySource = new MapPropertySource("wireMock",
                source);
        environment.getPropertySources().addLast(propertySource);
        return propertySource;
    }

    @Bean
    public WireMockServer wireMockBean(ApplicationContext context) {
        int availablePort = context.getEnvironment().getProperty(WIRE_MOCK_PORT_PROPERTY_NAME, Integer.class);
        WireMockConfiguration wireMockConfiguration =
                wireMockConfig()
                        .port(availablePort)
                        .mappingSource(new JsonFileMappingsSource(buildFileSource(context)));
        WireMockServer wireMockServer = new WireMockServer(wireMockConfiguration);
        wireMockServer.start();
        return wireMockServer;
    }

    private FileSource buildFileSource(ApplicationContext context) {
        String value = context.getEnvironment().getProperty(MAPPING_PATH_PROPERTY_NAME, String.class);
        if (value.startsWith("classpath:")) {
            return new ClasspathFileSource(value.replaceAll("classpath:", ""));
        }
        return new SingleRootFileSource(value);
    }
}
