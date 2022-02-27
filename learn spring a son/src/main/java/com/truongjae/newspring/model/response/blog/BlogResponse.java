package com.truongjae.newspring.model.response.blog;

import com.truongjae.newspring.entity.Category;
import com.truongjae.newspring.entity.User;
import lombok.Data;

@Data
public class BlogResponse {
    private long id;
    private String thumbnail;
    private String url;
    private String name;
    private String description;
    private String title;
    private String content;
    private String categoryName;
    private String author;
}
