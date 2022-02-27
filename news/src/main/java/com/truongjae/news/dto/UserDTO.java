package com.truongjae.news.dto;

import lombok.Data;

@Data
public class UserDTO {
    private String userName;

    private String password;

    private String fullName;

    private Integer status;
}
