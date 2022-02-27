package com.truongjae.news.dto;


import lombok.Data;

@Data
public class NewsDTO {
    private String title;

    private String thumbnail;

    private String shortDescription;

    private String content;
}
