package com.truongjae.jwtbytruong.config;

import com.truongjae.jwtbytruong.service.user.UserService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class GetIdUserName {
    private String username;
    private Long id;
}
