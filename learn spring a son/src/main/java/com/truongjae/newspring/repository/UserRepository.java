package com.truongjae.newspring.repository;

import com.truongjae.newspring.entity.User;


public interface UserRepository extends BaseRepository<User,Long> {
    User findByUsernameAndPassword(String username, String password);
}
