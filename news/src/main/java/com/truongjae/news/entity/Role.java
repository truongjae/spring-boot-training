package com.truongjae.news.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Role extends BaseEntity{
    @Column
    private String name;

    @Column
    private String code;

//    @ManyToMany(mappedBy = "roles")
//    private List<User> users = new ArrayList<>();
}
