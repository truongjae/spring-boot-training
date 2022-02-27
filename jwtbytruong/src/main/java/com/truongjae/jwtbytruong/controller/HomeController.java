package com.truongjae.jwtbytruong.controller;

import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HomeController {
    @GetMapping("/home")
    public ResponseEntity<?> home(@RequestAttribute("username") String username ){

        return new ResponseEntity<>("ok "+username, HttpStatus.ACCEPTED);
    }
}
