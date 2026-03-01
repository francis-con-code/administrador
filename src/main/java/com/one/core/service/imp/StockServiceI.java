package com.one.core.service.imp;

import com.one.core.model.Stock;
import com.one.core.model.dto.StockDTO;
import com.one.core.repository.StockRepository;
import com.one.core.service.ProductService;
import com.one.core.service.StockService;
import com.one.core.util.mapper.StockMapper;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
public class StockServiceI implements StockService {


    private final StockRepository stockRepository;
    private final ProductService productService;

    public StockServiceI(StockRepository stockRepository, ProductService productService) {
        this.stockRepository = stockRepository;
        this.productService = productService;
    }

    @Override
    public void create(StockDTO stockDTO) {
        Stock stock = StockMapper.INSTANCE.toEntity(stockDTO);
        stock.setProduct(productService.getOne(stockDTO.getProductId()));
        stockRepository.save(stock);
    }
    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }

    @Override
    public Stock getOne(Long id) {
        return stockRepository.getReferenceById(id);
    }

    @Override
    public void getAll() {

    }

    @Override
    public void getForId() {

    }
}
