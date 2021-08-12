package com.hcl.hclmessaging.integration.client.service;

import com.hcl.hclmessaging.integration.client.dto.Product;
import com.hcl.hclmessaging.integration.client.internal.ProductClient;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
public class ProductService {

    private ProductClient productClient;

    public ResponseEntity<Product> getProductById(Long id) {
        return productClient.get(id);
    }
}
