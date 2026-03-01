package com.one.core.service.imp;

import com.one.core.model.Product;
import com.one.core.model.dto.ProductDTO;
import com.one.core.repository.ProductRepository;
import com.one.core.service.ProductService;
import com.one.core.util.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProductServiceI implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceI(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void create(ProductDTO productDTO) {
        Product product = ProductMapper.INSTANCE.toEntity(productDTO);
        productRepository.save(product);
        log.debug("Se guardo el producto {}", product);
    }

    @Override
    public void update() {

    }

    @Override
    public void getAll() {

    }

    @Override
    public Product getOne(Long id) {
       return productRepository.getReferenceById(id);

    }

    @Override
    public void deleted() {

    }
}
