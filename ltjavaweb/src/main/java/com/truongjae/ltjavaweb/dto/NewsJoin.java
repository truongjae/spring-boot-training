package com.truongjae.ltjavaweb.dto;

import lombok.Data;

@Data
public class NewsJoin {
    private Long id;
    private String content;

    public NewsJoin(Long id, String name) {
        this.id = id;
        this.content = name;
    }
}
