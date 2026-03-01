package com.one.core.service;

import com.one.core.model.Stock;
import com.one.core.model.dto.StockDTO;

public interface StockService {
    void create(StockDTO stockDTO);
    void update();
    void delete();
    Stock getOne(Long id);
    void getAll();
    void getForId();
}
