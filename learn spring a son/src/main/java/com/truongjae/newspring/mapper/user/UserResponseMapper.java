package com.truongjae.newspring.mapper.user;

import com.truongjae.newspring.entity.User;
import com.truongjae.newspring.mapper.Mapper;
import com.truongjae.newspring.model.response.user.UserResponse;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserResponseMapper extends Mapper<UserResponse, User> {

}
