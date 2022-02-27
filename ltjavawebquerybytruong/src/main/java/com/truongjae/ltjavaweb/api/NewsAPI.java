package com.truongjae.ltjavaweb.api;

import com.truongjae.ltjavaweb.dto.NewsDTO;
import com.truongjae.ltjavaweb.dto.UserDTO;
import com.truongjae.ltjavaweb.entity.UserEntity;
import com.truongjae.ltjavaweb.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
public class NewsAPI {
    private final UserService userService;
    @GetMapping("/test")
    public NewsDTO test(@RequestBody NewsDTO newsDTO){
        return newsDTO;
    }
    @GetMapping("/test2")
    public UserDTO test2(){
        return userService.findCustom();
    }

//    @GetMapping("/test3")
//    public Optional<UserEntity> test3(@RequestBody long id[]){
//        return userService.findById(id[0]);
//    }

    @GetMapping("/test3")
    public ResponseEntity<List<UserEntity>> test3(@RequestBody long id[]){
        List<UserEntity> userEntities = userService.findById(id[0]).stream().collect(Collectors.toList());
        return new ResponseEntity<>(userEntities, HttpStatus.ACCEPTED);
    }
}
