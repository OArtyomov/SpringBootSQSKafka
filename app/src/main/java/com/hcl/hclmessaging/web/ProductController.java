package com.hcl.hclmessaging.web;

import com.hcl.hclmessaging.web.dto.Product;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.http.ResponseEntity.notFound;
import static org.springframework.http.ResponseEntity.ok;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@Slf4j
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/products")
public class ProductController {


    @RequestMapping(value = "/{id}", method = GET, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Product> get(@PathVariable Long id) {
        if (id.equals(1L)) {
            Product product = new Product();
            product.setId(1L);
            product.setDescription("This is example of product");
            product.setFeatured(Boolean.FALSE);
            product.setName("ExampleOfProduct");
            return ok(product);
        }
        return notFound().build();
    }


}
