package com.truongjae.ltjavaweb.service.impl;

import com.truongjae.ltjavaweb.dto.NewsDTO;
import com.truongjae.ltjavaweb.entity.CategoryEntity;
import com.truongjae.ltjavaweb.entity.NewsEntity;
import com.truongjae.ltjavaweb.mapper.NewsMapper;
import com.truongjae.ltjavaweb.repository.CategoryRepository;
import com.truongjae.ltjavaweb.repository.NewsRepository;
import com.truongjae.ltjavaweb.service.NewsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NewsServiceImpl implements NewsService {
    private final NewsRepository newsRepository;
    private final CategoryRepository categoryRepository;
    private final NewsMapper newsMapper;
    @Override
    public NewsDTO save(NewsDTO newsDTO) {
        NewsEntity newsEntity = newsMapper.to(newsDTO);
//        CategoryEntity categoryEntity = categoryRepository.findById(newsDTO.getCategory().getId()).get();
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
        newsEntity.setCategory(categoryEntity);
        newsRepository.save(newsEntity);
        return newsDTO;
    }

    @Override
    public NewsDTO update(NewsDTO newsDTO) {
        NewsEntity newsEntity = newsMapper.to(newsDTO);
        CategoryEntity categoryEntity = categoryRepository.findOneByCode(newsDTO.getCategoryCode());
        newsEntity.setCategory(categoryEntity);
        newsRepository.save(newsEntity);
        return newsDTO;
    }

    @Override
    public void delete(long[] id) {
        for(long i : id){
            newsRepository.deleteById(i);
        }
    }
}
