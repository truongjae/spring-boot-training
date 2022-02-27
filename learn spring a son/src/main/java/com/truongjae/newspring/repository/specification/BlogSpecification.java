package com.truongjae.newspring.repository.specification;

import com.truongjae.newspring.entity.Blog;
import com.truongjae.newspring.model.request.blog.BlogFilterRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

public class BlogSpecification {
    public static Specification<Blog> filterAll(BlogFilterRequest blogFilterRequest){
        return Specification.where(withUrl(blogFilterRequest.getUrl())
                .and(withCategory(blogFilterRequest.getCategoryId()))
                .and(withUserId(blogFilterRequest.getUserId()))
                .and(withName(blogFilterRequest.getName())
                .and(withKeyword(blogFilterRequest.getKeyword()))));
    }
    public static Specification<Blog> withUrl(String url){
        if(StringUtils.hasLength(url)) return null;
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("url"),url);
    }
    public static Specification<Blog> withName(String name){
        if(StringUtils.hasLength(name)) return null;
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("name"),name);
    }
    public static Specification<Blog> withCategory(Long categoryId){
        if(categoryId == null || categoryId == 0) return null;
        return ((root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("category").get("id"),categoryId));
    }
    public static Specification<Blog> withUserId(Long userId){
        if(userId==null || userId ==0) return null;
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.join("user").get("id"),userId);
    }
    public static Specification<Blog> withKeyword(String keyword){
        if(StringUtils.hasLength(keyword)) return null;
        return (root, query, criteriaBuilder) -> criteriaBuilder.like(root.get("content"),"%"+keyword+"%");

    }
}
