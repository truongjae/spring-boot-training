package com.truongjae.helloworld.service.impl;

import com.truongjae.helloworld.entity.User;
import com.truongjae.helloworld.repository.UserRepository;
import com.truongjae.helloworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(User user) {
//        userRepository.save(user);
    }
}
