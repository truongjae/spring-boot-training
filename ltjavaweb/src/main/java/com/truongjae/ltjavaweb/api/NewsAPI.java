package com.truongjae.ltjavaweb.api;

import com.truongjae.ltjavaweb.dto.NewsDTO;

import com.truongjae.ltjavaweb.service.NewsService;
import com.truongjae.ltjavaweb.service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;


@RestController
@AllArgsConstructor
public class NewsAPI {
    private final NewsService newsService;
    @PostMapping("/news")
    public NewsDTO save(@RequestBody NewsDTO newsDTO){
        return newsService.save(newsDTO);
    }
    @PutMapping("/news/{id}")
    public NewsDTO update(@RequestBody NewsDTO newsDTO,@PathVariable("id") Long id){
        newsDTO.setId(id);
        return newsService.update(newsDTO);
    }
    @DeleteMapping("/news")
    public void delete(@RequestBody long id[]){
        newsService.delete(id);
    }

}
