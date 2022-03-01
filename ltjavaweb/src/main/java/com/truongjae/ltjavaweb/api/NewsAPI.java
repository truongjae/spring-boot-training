package com.truongjae.ltjavaweb.api;

import com.truongjae.ltjavaweb.dto.NewsDTO;

import com.truongjae.ltjavaweb.dto.NewsJoin;
import com.truongjae.ltjavaweb.service.NewsService;
import com.truongjae.ltjavaweb.service.UserService;
import lombok.AllArgsConstructor;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;


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
    @GetMapping("/news")
    public NewsOutput getByPage(@RequestParam("page")int page, @RequestParam("limit") int limit){
        NewsOutput newsOutput = new NewsOutput();
        newsOutput.setPage(page);
        Pageable  pageable = PageRequest.of(page-1,limit);
        newsOutput.setNews(newsService.findAll(pageable));
        newsOutput.setTotalPage((int) Math.ceil((double) newsService.totalItem()/ limit));
        return newsOutput;
    }

    @GetMapping("/newsjoin")
    public List<NewsJoin> newsJoinList(){
        return newsService.listNewsJoin();
    }

}
