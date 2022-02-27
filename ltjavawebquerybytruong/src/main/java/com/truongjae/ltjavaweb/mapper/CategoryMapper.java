package com.truongjae.ltjavaweb.mapper;

import com.truongjae.ltjavaweb.dto.CategoryDTO;
import com.truongjae.ltjavaweb.entity.CategoryEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface CategoryMapper extends Mapper<CategoryEntity, CategoryDTO> {
}
