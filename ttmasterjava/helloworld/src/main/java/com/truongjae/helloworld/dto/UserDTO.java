package com.truongjae.helloworld.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class UserDTO {
    private Long id;

    private String userName;

    private String password;

    private Date createdDate;
}
