package com.one.core.service;

import com.one.core.model.Product;
import com.one.core.model.dto.ProductDTO;

public interface ProductService {
    void create(ProductDTO productDTO);
    void update();
    void getAll();
    Product getOne(Long id);
    void deleted();
}
