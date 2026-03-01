package com.one.core.controller;

import com.one.core.model.dto.StockDTO;
import com.one.core.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService) {
        this.stockService = stockService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody StockDTO stockDTO) {
        stockService.create(stockDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
