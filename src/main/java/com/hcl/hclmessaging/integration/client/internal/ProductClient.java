package com.hcl.hclmessaging.integration.client.internal;

import com.hcl.hclmessaging.integration.client.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(name = "products", url = "${products.url}/products")
public interface ProductClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<Product> get(@PathVariable Long id);

    @RequestMapping(value = "", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<Product>> findAll();

    @RequestMapping(value = "/featured", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<Product>> findAllFeatured();
}
