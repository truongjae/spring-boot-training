package com.truongjae.newspring.service;

import com.truongjae.newspring.model.request.user.UserAuthRequest;
import com.truongjae.newspring.model.request.user.UserSaveRequest;
import com.truongjae.newspring.model.response.user.UserResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    void save(UserSaveRequest userSaveRequest);
    UserResponse auth(UserAuthRequest userAuthRequest);
    UserResponse findById(long id);
    Page<UserResponse> getAll(Pageable pageable);
}
