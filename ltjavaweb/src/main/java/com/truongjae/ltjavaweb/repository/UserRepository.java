package com.truongjae.ltjavaweb.repository;

import com.truongjae.ltjavaweb.dto.UserDTO;
import com.truongjae.ltjavaweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
