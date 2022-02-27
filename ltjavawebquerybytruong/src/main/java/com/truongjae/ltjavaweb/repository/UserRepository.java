package com.truongjae.ltjavaweb.repository;

import com.truongjae.ltjavaweb.dto.UserDTO;
import com.truongjae.ltjavaweb.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    @Query("select new com.truongjae.ltjavaweb.dto.UserDTO(u.userName,u.password) from UserEntity u")
    UserDTO findCustom();

    @Override
    Optional<UserEntity> findById(Long aLong);
}
