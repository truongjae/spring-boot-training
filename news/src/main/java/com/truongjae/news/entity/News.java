package com.truongjae.news.entity;


import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class News extends BaseEntity{
    @Column
    private String title;

    @Column
    private String thumbnail;

    @Column(name="shortdescription",columnDefinition = "TEXT")
    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String content;
}
