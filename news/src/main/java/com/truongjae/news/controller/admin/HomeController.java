package com.truongjae.news.controller.admin;

import com.truongjae.news.entity.Role;
import com.truongjae.news.entity.User;
import com.truongjae.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller(value = "homeControllerOfAdmin")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "home",method = RequestMethod.GET)
    public ModelAndView home(){
        ModelAndView mav = new ModelAndView("admin/home");
        return mav;
    }

    @RequestMapping(value = "user",method = RequestMethod.GET)
    public void user(){
//        List<User> userList = userService.getAll();
//        for(User user : userList){
//            System.out.println(user.getUserName());
//        }
//        Optional<User> userOptional = userService.findAllById(2L);
//        List<User> list = userOptional.stream().collect(Collectors.toList());
//        for(User user : list){
//            System.out.println(user.getUserName());
//        }
    }
}
