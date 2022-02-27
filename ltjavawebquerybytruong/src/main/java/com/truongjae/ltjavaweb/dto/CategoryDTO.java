package com.truongjae.ltjavaweb.dto;

import com.truongjae.ltjavaweb.entity.NewsEntity;
import com.truongjae.ltjavaweb.mapper.CategoryMapper;
import com.truongjae.ltjavaweb.mapper.NewsMapper;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class CategoryDTO {
    private String code;
    private String name;
    private List<NewsDTO> news = new ArrayList<>();
}
