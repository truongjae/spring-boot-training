package com.truongjae.ltjavaweb.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "user")
@Data
public class UserEntity extends BaseEntity{
    @Column
    private String userName;
    @Column
    private String password;
    @Column
    private String fullName;
    @Column
    private Integer stasus;

    @ManyToMany
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<RoleEntity> roles = new ArrayList<>();
}
