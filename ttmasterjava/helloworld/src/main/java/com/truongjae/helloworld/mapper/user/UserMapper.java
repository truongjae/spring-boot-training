package com.truongjae.helloworld.mapper.user;

import com.truongjae.helloworld.dto.UserDTO;
import com.truongjae.helloworld.entity.User;
import com.truongjae.helloworld.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserMapper extends Mapper<User, UserDTO> {
}
