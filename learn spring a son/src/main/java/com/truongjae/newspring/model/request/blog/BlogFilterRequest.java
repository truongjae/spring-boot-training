package com.truongjae.newspring.model.request.blog;

import com.truongjae.newspring.model.request.BaseFilter;
import lombok.Data;

@Data
public class BlogFilterRequest extends BaseFilter {
    private String name;
    private String url;
    private Long categoryId;
    private Long userId;
    private String keyword;
}
