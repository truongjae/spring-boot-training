package com.truongjae.ltjavaweb.mapper;

import com.truongjae.ltjavaweb.dto.NewsDTO;
import com.truongjae.ltjavaweb.entity.NewsEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface NewsMapper extends Mapper<NewsEntity, NewsDTO> {
}
