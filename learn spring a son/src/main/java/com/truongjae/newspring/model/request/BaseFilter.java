package com.truongjae.newspring.model.request;


import lombok.Data;

@Data
public class BaseFilter {
    private int pageIndex =1;
    private int pageSize = 10;
}
