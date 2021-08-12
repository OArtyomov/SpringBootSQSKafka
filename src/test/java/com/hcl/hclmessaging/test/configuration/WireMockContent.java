package com.hcl.hclmessaging.test.configuration;

import com.github.tomakehurst.wiremock.stubbing.StubMapping;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WireMockContent {

    private List<StubMapping> mappings;

}
