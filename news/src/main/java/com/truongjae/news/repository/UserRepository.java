package com.truongjae.news.repository;

import com.truongjae.news.entity.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByUserNameAndPasswordAndStatus(String userName,String password,int status);
    User findByUserName(String userName);
    List<User> findAll();
    Optional<User> findAllById(Long id);
    @Query(value = "SELECT u FROM User u order by u.id desc")
    List<User> findAllUsers();
}
