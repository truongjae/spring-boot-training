package com.truongjae.newspring.service;

import com.truongjae.newspring.model.request.blog.BlogFilterRequest;
import com.truongjae.newspring.model.response.blog.BlogResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BlogService {
    Page<BlogResponse> getAll(BlogFilterRequest filterRequest);
}
