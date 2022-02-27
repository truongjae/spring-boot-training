package com.truongjae.helloworld.repository;

import com.truongjae.helloworld.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
