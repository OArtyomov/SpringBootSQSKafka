package com.hcl.test.wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ClasspathFileSource;
import com.github.tomakehurst.wiremock.common.FileSource;
import com.github.tomakehurst.wiremock.common.SingleRootFileSource;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.standalone.JsonFileMappingsSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.StandardEnvironment;

import java.util.Map;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;
import static com.google.common.collect.ImmutableMap.of;
import static com.hcl.hclmessaging.test.AbstractBaseTest.MAPPING_PATH_PROPERTY_NAME;
import static com.hcl.hclmessaging.test.AbstractBaseTest.WIRE_MOCK_PORT_PROPERTY_NAME;
import static org.springframework.util.ResourceUtils.CLASSPATH_URL_PREFIX;
import static org.springframework.util.SocketUtils.findAvailableTcpPort;

@Configuration
public class MockServerConfiguration {

    @Bean
    public WireMockServer wireMockBean(StandardEnvironment environment) {
        int availableTcpPort = findAvailableTcpPort();
        Map<String, Object> source = of(WIRE_MOCK_PORT_PROPERTY_NAME, availableTcpPort);
        environment.getPropertySources().addLast(new MapPropertySource("wireMock", source));

        WireMockConfiguration wireMockConfiguration =
                wireMockConfig()
                        .port(availableTcpPort)
                        .mappingSource(new JsonFileMappingsSource(buildFileSource(environment)));
        WireMockServer wireMockServer = new WireMockServer(wireMockConfiguration);
        wireMockServer.start();
        return wireMockServer;
    }

    private FileSource buildFileSource(StandardEnvironment environment) {
        String value = environment.getRequiredProperty(MAPPING_PATH_PROPERTY_NAME, String.class);
        if (value.startsWith(CLASSPATH_URL_PREFIX)) {
            return new ClasspathFileSource(value.replaceAll(CLASSPATH_URL_PREFIX, ""));
        }
        return new SingleRootFileSource(value);
    }
}
