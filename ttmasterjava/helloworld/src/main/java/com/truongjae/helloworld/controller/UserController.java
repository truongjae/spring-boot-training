package com.truongjae.helloworld.controller;

import com.truongjae.helloworld.dto.UserAuthDTO;
import com.truongjae.helloworld.dto.UserDTO;
import com.truongjae.helloworld.dto.UserResponseDTO;
import com.truongjae.helloworld.entity.User;
import com.truongjae.helloworld.mapper.user.UserAuthMapper;
import com.truongjae.helloworld.mapper.user.UserMapper;
import com.truongjae.helloworld.mapper.user.UserResponseMapper;
import com.truongjae.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserResponseMapper userResponseMapper;

    @Autowired
    private UserAuthMapper userAuthMapper;
    @PostMapping("/adduser")
    public void addUser(@RequestBody UserDTO userDTO){
        User user = userMapper.to(userDTO);
        userService.save(user);
    }
    @PostMapping("/deleteall")
    @ResponseBody
    public String deleteAll(){
        userService.deleteAll();
        return "{\"thongtin\": \"ok\"}";
    }

    @GetMapping(value = "/getall")
    public ResponseEntity<Page<User>> getByIndex(@RequestBody int [] index){
        Pageable pageable = PageRequest.of(index[0],index[1]);
        Page<User> userPage = userService.findAll(pageable);
        return new ResponseEntity<>(userPage, HttpStatus.ACCEPTED);
    }
    /*@GetMapping(value = "/getallbyid")
    public ResponseEntity<List<UserResponseDTO>> getAllById(@RequestBody long[] id){
        List<User> listUser = userService.findAll();//.stream().collect(Collectors.toList());
        System.out.println(listUser.isEmpty());
        List<UserResponseDTO> listUserResponseDTOS = new ArrayList<>();
        for(User user: listUser){
            listUserResponseDTOS.add(userResponseMapper.from(user));
        }
        return new ResponseEntity<>(listUserResponseDTOS, HttpStatus.ACCEPTED);
    }*/

    @GetMapping(value = "/login")
    public ResponseEntity<UserDTO> getAllById(@RequestBody UserAuthDTO userAuthDTO){
        User user = userService.findByUserNameAndPassword(userAuthDTO.getUserName(),userAuthDTO.getPassword());
        if(user != null){
            UserDTO userDTO = userMapper.from(user);
            return new ResponseEntity<>(userDTO, HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<>(null,HttpStatus.BAD_REQUEST);
    }
}
