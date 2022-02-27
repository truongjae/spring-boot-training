package com.truongjae.helloworld.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("msg","hello ne ghe vai lon");
        return "index";
    }
//    @GetMapping("/hello2")
//    public void hello2(HttpServletResponse response) throws IOException {
//        Cookie cookie = new Cookie("user2","truong2");
//        response.addCookie(cookie);
//        response.sendRedirect("hello");
//    }
}
