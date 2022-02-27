package com.truongjae.ltjavaweb.service.impl;

import com.truongjae.ltjavaweb.dto.UserDTO;
import com.truongjae.ltjavaweb.entity.UserEntity;
import com.truongjae.ltjavaweb.repository.UserRepository;
import com.truongjae.ltjavaweb.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    @Override
    public UserDTO findCustom() {
        return userRepository.findCustom();
    }

    @Override
    public Optional<UserEntity> findById(Long aLong) {
        return userRepository.findById(aLong);
    }


}
