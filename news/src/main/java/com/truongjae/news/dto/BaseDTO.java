package com.truongjae.news.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BaseDTO {
    private long id;
    private Date createdDate;
    private Date modifiedDate;
    private String createdBy;
    private String modifiedBy;
}
