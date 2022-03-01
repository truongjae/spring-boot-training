package com.truongjae.jwtbytruong.service.user;

import com.truongjae.jwtbytruong.entity.User;
import com.truongjae.jwtbytruong.mapper.user.UserSaveMapper;
import com.truongjae.jwtbytruong.model.user.UserSaveRequest;
import com.truongjae.jwtbytruong.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserSaveMapper userSaveMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserSaveRequest save(UserSaveRequest userSaveRequest) {
        User user = userSaveMapper.to(userSaveRequest);

        try{
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepository.save(user);
            return userSaveRequest;
        }
        catch (Exception e){
            return null;
        }
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                new ArrayList<>());
    }

}
