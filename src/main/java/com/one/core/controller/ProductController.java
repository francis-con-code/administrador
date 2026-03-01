package com.one.core.controller;

import com.one.core.model.dto.ProductDTO;
import com.one.core.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody ProductDTO productDTO) {
        productService.create(productDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
