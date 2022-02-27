package com.truongjae.helloworld.mapper.user;

import com.truongjae.helloworld.dto.UserResponseDTO;
import com.truongjae.helloworld.entity.User;
import com.truongjae.helloworld.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserResponseMapper extends Mapper<User, UserResponseDTO> {
}
