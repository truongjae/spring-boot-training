package com.truongjae.helloworld.controller;

import com.truongjae.helloworld.dto.UserDTO;
import com.truongjae.helloworld.entity.User;
import com.truongjae.helloworld.mapper.user.UserMapper;
import com.truongjae.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller
public class UserController {
//    @Autowired
//    private UserService userService;
//    @Autowired
//    private UserMapper userMapper;
//    @PostMapping("/adduser")
//    public void addUser(@RequestBody UserDTO userDTO){
//        User user = userMapper.to(userDTO);
//        userService.save(user);
//    }
}
