package com.truongjae.newspring.model.request.user;

import lombok.Data;

@Data
public class UserAuthRequest {
    private String username;
    private String password;
}
