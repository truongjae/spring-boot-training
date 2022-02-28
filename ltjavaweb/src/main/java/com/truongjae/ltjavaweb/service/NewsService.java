package com.truongjae.ltjavaweb.service;

import com.truongjae.ltjavaweb.dto.NewsDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface NewsService {
    NewsDTO save(NewsDTO newsDTO);
    NewsDTO update(NewsDTO newsDTO);
    void delete(long id[]);
    List<NewsDTO> findAll(Pageable pageable);
    int totalItem();
}
