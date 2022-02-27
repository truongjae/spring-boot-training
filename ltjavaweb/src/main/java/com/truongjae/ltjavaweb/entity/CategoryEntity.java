package com.truongjae.ltjavaweb.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category")
@Data
public class CategoryEntity extends BaseEntity {
    @Column
    private String code;
    @Column
    private String name;

    @OneToMany(mappedBy = "category")
    private List<NewsEntity> news = new ArrayList<>();
}
