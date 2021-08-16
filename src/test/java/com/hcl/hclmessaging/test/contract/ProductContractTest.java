package com.hcl.hclmessaging.test.contract;

import com.hcl.client.integration.dto.Product;
import com.hcl.client.integration.internal.ProductClient;
import com.hcl.hclmessaging.test.AbstractBaseTest;
import feign.FeignException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.fail;

public class ProductContractTest extends AbstractBaseTest {

    @Autowired
    private ProductClient productClient;

    @Test
    public void testGetProductByIdWhenOk() {
        ResponseEntity<Product> productResponseEntity = productClient.get(1L);
        assertThat(productResponseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(productResponseEntity.getHeaders().getContentType()).isEqualTo(MediaType.APPLICATION_JSON);
        Product product = productResponseEntity.getBody();
        assertThat(product.getId()).isEqualTo(1L);
        assertThat(product.getName()).isEqualTo("ExampleOfProduct");
        assertThat(product.getDescription()).isEqualTo("This is example of product");
    }

    @Test
    public void testGetProductByIdWhenNotFound() {
        try {
            productClient.get(2L);
            fail();
        } catch (FeignException.NotFound e) {

        }
    }

    @Test
    public void testGetAllProductsOk() {
        ResponseEntity<List<Product>> all = productClient.findAll();
        assertThat(all.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(all.getHeaders().getContentType()).isEqualTo(MediaType.APPLICATION_JSON);
        List<Product> body = all.getBody();
        assertThat(body).hasSize(3);
    }

    @Test
    public void testGetFeaturedProductsOk() {
        ResponseEntity<List<Product>> all = productClient.findAllFeatured();
        assertThat(all.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(all.getHeaders().getContentType()).isEqualTo(MediaType.APPLICATION_JSON);
        List<Product> body = all.getBody();
        assertThat(body).hasSize(2);
    }

}
