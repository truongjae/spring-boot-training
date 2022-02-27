package com.truongjae.newspring.service.Impl;

import com.truongjae.newspring.entity.Blog;
import com.truongjae.newspring.mapper.blog.BlogMapper;
import com.truongjae.newspring.model.request.blog.BlogFilterRequest;
import com.truongjae.newspring.model.response.blog.BlogResponse;
import com.truongjae.newspring.repository.BlogRepository;
import com.truongjae.newspring.repository.specification.BlogSpecification;
import com.truongjae.newspring.service.BlogService;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@Data
public class BlogServiceImpl implements BlogService {

    private final BlogRepository blogRepository;
    private final BlogMapper blogMapper;
    @Override
    public Page<BlogResponse> getAll(BlogFilterRequest filterRequest) {
        PageRequest pageRequest = PageRequest.of(filterRequest.getPageIndex(),filterRequest.getPageSize());
        Page<Blog> page = blogRepository.findAll(BlogSpecification.filterAll(filterRequest),pageRequest.previousOrFirst());
        return page.map(blogMapper::to);
    }
}
