package com.truongjae.ltjavaweb.api;

import com.truongjae.ltjavaweb.dto.CategoryDTO;
import com.truongjae.ltjavaweb.entity.CategoryEntity;
import com.truongjae.ltjavaweb.entity.UserEntity;
import com.truongjae.ltjavaweb.mapper.CategoryMapper;
import com.truongjae.ltjavaweb.service.CategoryService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class CategoryAPI {
    private final CategoryService categoryService;
    private final CategoryMapper categoryMapper;
    @GetMapping("/test4")
    public ResponseEntity<List<CategoryDTO>> test4(@RequestBody long id[]){
        List<CategoryEntity> categoryEntities = categoryService.findById(id[0]).stream().collect(Collectors.toList());
        List<CategoryDTO> categoryDTOS = categoryMapper.from(categoryEntities);
        return new ResponseEntity<>(categoryDTOS, HttpStatus.ACCEPTED);
    }
}
