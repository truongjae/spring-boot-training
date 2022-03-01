package com.truongjae.jwtbytruong.controller;

import com.truongjae.jwtbytruong.config.GetIdUserName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

@Controller
public class HomeController {
    @Autowired
    private GetIdUserName getIdUserName;
    @GetMapping("/home")
    public ResponseEntity<?> home(){
        System.out.println(getIdUserName.getUsername());
        System.out.println(getIdUserName.getId());
        return new ResponseEntity<>("ok "+getIdUserName.getUsername(), HttpStatus.ACCEPTED);
    }
}
