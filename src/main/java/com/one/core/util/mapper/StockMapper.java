package com.one.core.util.mapper;

import com.one.core.model.Stock;
import com.one.core.model.dto.StockDTO;
import org.mapstruct.Mapper;

import org.mapstruct.factory.Mappers;

@Mapper
public interface StockMapper {

    StockMapper INSTANCE = Mappers.getMapper( StockMapper.class );

    Stock toEntity(StockDTO stockDTO);

    StockDTO toStockDTO(Stock stock);
}
