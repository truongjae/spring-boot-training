package com.truongjae.helloworld.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
public class User extends BaseEntity{

    @Column(name="username")
    private String userName;

    @Column
    private String password;

}
