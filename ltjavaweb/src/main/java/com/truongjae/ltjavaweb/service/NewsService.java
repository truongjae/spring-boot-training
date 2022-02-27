package com.truongjae.ltjavaweb.service;

import com.truongjae.ltjavaweb.dto.NewsDTO;

public interface NewsService {
    NewsDTO save(NewsDTO newsDTO);
    NewsDTO update(NewsDTO newsDTO);
    void delete(long id[]);
}
