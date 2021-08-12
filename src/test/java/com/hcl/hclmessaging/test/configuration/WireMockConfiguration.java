package com.hcl.hclmessaging.test.configuration;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ClasspathFileSource;
import com.github.tomakehurst.wiremock.standalone.JsonFileMappingsSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.util.SocketUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

@Configuration
public class WireMockConfiguration {


    @Bean
    public MapPropertySource wireMockPropertySource(StandardEnvironment environment) {
        int availableTcpPort = SocketUtils.findAvailableTcpPort();
        Map<String, Object> map = new HashMap<>();
        map.put("wiremock.port", availableTcpPort);
        MapPropertySource propertySource = new MapPropertySource("wireMock", map);
        environment.getPropertySources().addLast(propertySource);
        return propertySource;
    }

    @Bean
    public WireMockServer wireMockBean(MapPropertySource wireMockPropertySource) {
        int availablert = (Integer) wireMockPropertySource.getProperty("wiremock.port");
        com.github.tomakehurst.wiremock.core.WireMockConfiguration wireMockConfiguration = wireMockConfig().port(availablert);
        ClasspathFileSource classpathFileSource = new ClasspathFileSource("mappings");
        wireMockConfiguration.mappingSource(new JsonFileMappingsSource(classpathFileSource));
        WireMockServer wireMockServer = new WireMockServer(wireMockConfiguration);
        wireMockServer.start();
        return wireMockServer;
    }
}
