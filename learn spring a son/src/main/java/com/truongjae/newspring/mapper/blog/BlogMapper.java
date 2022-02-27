package com.truongjae.newspring.mapper.blog;

import com.truongjae.newspring.entity.Blog;
import com.truongjae.newspring.model.response.blog.BlogResponse;
import com.truongjae.newspring.utils.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class BlogMapper {
    public BlogResponse to(Blog blog){
        BlogResponse blogResponse = new BlogResponse();
        BeanUtils.refine(blog,blogResponse,BeanUtils::copyNonNull);
        if(blog.getCategory() != null) {
            blogResponse.setCategoryName(blog.getCategory().getName());
        }
        if(blog.getUser() != null){
            blogResponse.setAuthor(blog.getUser().getName());
        }
        return blogResponse;

    }
}
