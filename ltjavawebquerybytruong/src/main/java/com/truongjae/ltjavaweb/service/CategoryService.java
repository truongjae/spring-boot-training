package com.truongjae.ltjavaweb.service;

import com.truongjae.ltjavaweb.entity.CategoryEntity;

import java.util.Optional;

public interface CategoryService {
    Optional<CategoryEntity> findById(Long aLong);
}
