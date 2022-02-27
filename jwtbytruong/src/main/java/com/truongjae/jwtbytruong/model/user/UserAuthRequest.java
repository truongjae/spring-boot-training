package com.truongjae.jwtbytruong.model.user;

import lombok.Data;

@Data
public class UserAuthRequest {
    private String username;
    private String password;
}
