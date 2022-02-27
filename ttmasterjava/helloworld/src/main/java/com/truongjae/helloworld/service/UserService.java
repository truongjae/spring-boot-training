package com.truongjae.helloworld.service;

import com.truongjae.helloworld.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface UserService {
    void save(User user);
    void deleteAll();
    Page<User> findAll(Pageable pageable);
    List<User> findAll();
    User findByUserNameAndPassword(String userName, String password);
}
