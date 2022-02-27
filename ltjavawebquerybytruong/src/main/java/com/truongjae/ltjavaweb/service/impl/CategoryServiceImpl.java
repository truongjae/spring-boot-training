package com.truongjae.ltjavaweb.service.impl;

import com.truongjae.ltjavaweb.entity.CategoryEntity;
import com.truongjae.ltjavaweb.repository.CategoryRepository;
import com.truongjae.ltjavaweb.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryRepository categoryRepository;
    @Override
    public Optional<CategoryEntity> findById(Long aLong) {
        return categoryRepository.findById(aLong);
    }
}
