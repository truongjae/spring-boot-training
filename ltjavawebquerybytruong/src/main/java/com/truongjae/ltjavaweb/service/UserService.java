package com.truongjae.ltjavaweb.service;

import com.truongjae.ltjavaweb.dto.UserDTO;
import com.truongjae.ltjavaweb.entity.UserEntity;

import java.util.Optional;

public interface UserService {
    UserDTO findCustom();
    Optional<UserEntity> findById(Long aLong);
}
