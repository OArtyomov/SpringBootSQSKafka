package com.hcl.client.integration.internal;

import com.hcl.client.integration.dto.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@FeignClient(name = "products", url = "${products.url}/products")
public interface ProductClient {

    @RequestMapping(value = "/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<Product> get(@PathVariable Long id);

    @RequestMapping(value = "", method = GET, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<Product>> findAll();

    @RequestMapping(value = "/featured", method = GET, produces = APPLICATION_JSON_VALUE)
    ResponseEntity<List<Product>> findAllFeatured();
}
