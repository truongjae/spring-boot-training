package com.truongjae.jwtbytruong.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="username",unique = true)
    private String username;

    @Column
    private String password;

    @Column(updatable = false)
    @CreationTimestamp
    private Date createdDate;
}
