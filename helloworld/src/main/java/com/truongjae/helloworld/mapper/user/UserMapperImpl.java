package com.truongjae.helloworld.mapper.user;

import com.truongjae.helloworld.dto.UserDTO;
import com.truongjae.helloworld.entity.User;
import org.springframework.stereotype.Component;

//@Component
public class UserMapperImpl implements UserMapper{
    @Override
    public User to(UserDTO obj) {
        User user = new User();
        user.setId(obj.getId());
        user.setUserName(obj.getUserName());
        user.setPassword(obj.getPassword());
//        user.setCreatedDate(obj.getCreatedDate());
        return user;
    }
}
