package com.truongjae.news.service.impl;

import com.truongjae.news.dto.UserDTO;
import com.truongjae.news.entity.User;
import com.truongjae.news.mapper.user.UserSaveMapper;
import com.truongjae.news.repository.UserRepository;
import com.truongjae.news.service.UserService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserSaveMapper userSaveMapper;

    public UserServiceImpl(UserRepository userRepository, UserSaveMapper userSaveMapper) {
        this.userRepository = userRepository;
        this.userSaveMapper = userSaveMapper;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<User> findAllById(Long id) {
        return userRepository.findAllById(id);
    }

    @Override
    public User save(UserDTO userDTO) {
        User user =userSaveMapper.to(userDTO);
        userRepository.save(user);
        return user;
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void update(){
        User user = new User();
        user.setId(27L);
        user.setFullName("nguyen truong");
        user.setUserName("truongjae");
        user.setStatus(1);
        user.setPassword("123");
        userRepository.save(user);
   }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAllUsers();
    }


}
