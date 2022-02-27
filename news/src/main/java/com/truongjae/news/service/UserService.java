package com.truongjae.news.service;

import com.truongjae.news.dto.UserDTO;
import com.truongjae.news.entity.User;
import org.springframework.data.domain.Sort;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findAllById(Long id);
    User save(UserDTO userDTO);
    void deleteById(Long id);
    void update();
    User findByUserName(String userName);
    List<User> findAllUsers();
}
