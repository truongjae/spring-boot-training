package com.truongjae.ltjavaweb.repository;

import com.truongjae.ltjavaweb.dto.NewsJoin;
import com.truongjae.ltjavaweb.entity.NewsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NewsRepository extends JpaRepository<NewsEntity,Long> {
//    @Query("select new com.truongjae.ltjavaweb.dto.NewsJoin(n.id,n.content) from NewsEntity n")
    @Query("select new com.truongjae.ltjavaweb.dto.NewsJoin(n.category.id,n.category.code) from NewsEntity n")
//    @Query(value="select * from news", nativeQuery = true)
    List<NewsJoin> listNewsJoin();
}
