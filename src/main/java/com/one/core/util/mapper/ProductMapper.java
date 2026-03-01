package com.one.core.util.mapper;

import com.one.core.model.Product;
import com.one.core.model.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper INSTANCE = Mappers.getMapper( ProductMapper.class );

    Product toEntity(ProductDTO productDTO);

    ProductDTO toProductDto(Product product);
}
