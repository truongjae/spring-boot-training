package com.truongjae.jwtbytruong.repository;

import com.truongjae.jwtbytruong.entity.User;
import com.truongjae.jwtbytruong.model.user.UserSaveRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
