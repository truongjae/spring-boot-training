package com.truongjae.newspring.controller;

import com.truongjae.newspring.model.request.blog.BlogFilterRequest;
import com.truongjae.newspring.model.response.blog.BlogResponse;
import com.truongjae.newspring.service.BlogService;
import lombok.Data;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class BlogController {
    private final BlogService blogService;

    @GetMapping("/blogs")
    public ResponseEntity<Page<BlogResponse>> fillter(@ModelAttribute BlogFilterRequest blogFilterRequest){
        Page<BlogResponse> page = blogService.getAll(blogFilterRequest);
        return ResponseEntity.ok(page);
    }
}
