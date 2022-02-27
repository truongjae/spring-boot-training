package com.truongjae.helloworld.repository;

import com.truongjae.helloworld.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    @Override
    Page<User> findAll(Pageable pageable);

    @Override
    List<User> findAll();

    User findByUserNameAndPassword(String userName, String password);

    User findByUserName(String userName);
}
