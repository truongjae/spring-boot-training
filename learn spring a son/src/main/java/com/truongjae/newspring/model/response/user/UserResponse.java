package com.truongjae.newspring.model.response.user;

import lombok.Data;

import java.util.List;

@Data
public class UserResponse {
    private long id;
    private String name;
    private String address;
    private String username;
    private transient List<String> roleName;
}
