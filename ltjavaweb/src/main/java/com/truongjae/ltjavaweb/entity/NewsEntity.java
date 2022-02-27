package com.truongjae.ltjavaweb.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "news")
@Data
public class NewsEntity extends BaseEntity{

    @Column
    private String title;
    @Column
    private String thumbnail;
    @Column
    private String shortDescription;
    @Column
    private String content;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity category;
}
