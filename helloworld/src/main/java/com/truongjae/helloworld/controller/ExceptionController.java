package com.truongjae.helloworld.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(Exception.class)
    public String nullPointerException(Exception e){
        e.printStackTrace();
        return "null";
    }
}
