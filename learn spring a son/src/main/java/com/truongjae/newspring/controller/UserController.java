package com.truongjae.newspring.controller;

import com.truongjae.newspring.model.request.user.UserAuthRequest;
import com.truongjae.newspring.model.request.user.UserSaveRequest;
import com.truongjae.newspring.model.response.BaseResponse;
import com.truongjae.newspring.model.response.user.UserResponse;
import com.truongjae.newspring.service.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@Data
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/user")
    public ResponseEntity<Void> save(@RequestBody UserSaveRequest userSaveRequest){
        userService.save(userSaveRequest);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @PostMapping(value = "/user/auth")
    public ResponseEntity<UserResponse> auth(@RequestBody UserAuthRequest userAuthRequest){
        UserResponse userResponse = userService.auth(userAuthRequest);
        return new ResponseEntity<>(userResponse,HttpStatus.OK);
    }
    @GetMapping("/user/{id}")
    public ResponseEntity<UserResponse> getById(@PathVariable long id){
        UserResponse userResponse = userService.findById(id);
        return new ResponseEntity<>(userResponse,HttpStatus.OK);
    }
    @GetMapping("/users")
    public ResponseEntity<Page<UserResponse>> getAll(@RequestParam int index, @RequestParam int size){
        PageRequest pageRequest = PageRequest.of(index,size);
        Page<UserResponse> userResponses = userService.getAll(pageRequest);
        return ResponseEntity.ok(userResponses);
    }
}
