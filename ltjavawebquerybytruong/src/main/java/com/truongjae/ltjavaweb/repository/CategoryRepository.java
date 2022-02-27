package com.truongjae.ltjavaweb.repository;

import com.truongjae.ltjavaweb.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CategoryRepository extends JpaRepository<CategoryEntity,Long> {
    @Override
    Optional<CategoryEntity> findById(Long aLong);
}
