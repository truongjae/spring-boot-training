package com.truongjae.newspring.service.Impl;

import com.truongjae.newspring.entity.Role;
import com.truongjae.newspring.entity.User;
import com.truongjae.newspring.exception.ObjectNotFoundException;
import com.truongjae.newspring.mapper.user.UserResponseMapper;
import com.truongjae.newspring.mapper.user.UserSaveMapper;
import com.truongjae.newspring.model.request.user.UserAuthRequest;
import com.truongjae.newspring.model.request.user.UserSaveRequest;
import com.truongjae.newspring.model.response.user.UserResponse;
import com.truongjae.newspring.repository.RoleRepository;
import com.truongjae.newspring.repository.UserRepository;
import com.truongjae.newspring.service.UserService;
import com.truongjae.newspring.utils.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserSaveMapper userSaveMapper;
    private final UserResponseMapper userResponseMapper;
    private final RoleRepository roleRepository;
    @Autowired
    public UserServiceImpl(UserRepository userRepository, UserSaveMapper userSaveMapper,
                           UserResponseMapper userResponseMapper, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.userSaveMapper = userSaveMapper;
        this.userResponseMapper = userResponseMapper;
        this.roleRepository = roleRepository;
    }

    @Override
    public void save(UserSaveRequest userSaveRequest) {
        User user = userSaveMapper.to(userSaveRequest);
        Set<Role> roles = roleRepository.findAllByIdIn(userSaveRequest.getRoleIds()).stream().collect(Collectors.toSet());
        user.setRoles(roles);
        userRepository.save(user);
    }

    @Override
    public UserResponse auth(UserAuthRequest userAuthRequest) {
        String password = PasswordUtil.getMd5(userAuthRequest.getPassword());
        User user = userRepository.findByUsernameAndPassword(userAuthRequest.getUsername(),password);
        UserResponse userResponse = userResponseMapper.to(user);
        List<String> roles = user.getRoles().stream().map(Role::getName).collect(Collectors.toList());
        userResponse.setRoleName(roles);
        return userResponse;
    }

    @Override
    public UserResponse findById(long id) {
        Optional<User> user = userRepository.findById(id);
        user.orElseThrow(()->new ObjectNotFoundException("User not found"));
        return userResponseMapper.to(user.get());
    }

    @Override
    public Page<UserResponse> getAll(Pageable pageable) {
        Page<User> users = userRepository.findAll(pageable.previousOrFirst());
        return users.map(userResponseMapper::to);
    }
}
