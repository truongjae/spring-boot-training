package com.truongjae.ltjavaweb.api;

import com.truongjae.ltjavaweb.dto.NewsDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NewsOutput {
    private int page;
    private int totalPage;
    private List<NewsDTO> news = new ArrayList<>();
}
