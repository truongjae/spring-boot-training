package com.truongjae.news.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="username")
    private String userName;

    @Column
    private String password;

    @Column(name="fullname")
    private String fullName;

    @Column
    private Integer status;

//    @ManyToMany
//    @JoinTable(name="user_role", joinColumns = @JoinColumn(name="userid"),
//            inverseJoinColumns = @JoinColumn(name="roleid"))
//    private List<Role> roles = new ArrayList<>();


}
