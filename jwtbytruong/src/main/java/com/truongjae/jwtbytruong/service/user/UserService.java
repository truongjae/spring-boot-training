package com.truongjae.jwtbytruong.service.user;

import com.truongjae.jwtbytruong.model.user.UserSaveRequest;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    UserSaveRequest save(UserSaveRequest userAuthRequest);
}
