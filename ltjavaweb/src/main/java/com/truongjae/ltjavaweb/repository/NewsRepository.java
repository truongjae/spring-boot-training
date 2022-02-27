package com.truongjae.ltjavaweb.repository;

import com.truongjae.ltjavaweb.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<NewsEntity,Long> {
}
