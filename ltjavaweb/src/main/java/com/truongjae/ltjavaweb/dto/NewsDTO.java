package com.truongjae.ltjavaweb.dto;

import com.truongjae.ltjavaweb.entity.CategoryEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
public class NewsDTO {
    private Long id;
    private String title;
    private String thumbnail;
    private String shortDescription;
    private String content;
    private String categoryCode;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;
}
