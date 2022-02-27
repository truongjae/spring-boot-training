package com.truongjae.jwtbytruong.mapper.user;

import com.truongjae.jwtbytruong.entity.User;
import com.truongjae.jwtbytruong.mapper.Mapper;
import com.truongjae.jwtbytruong.model.user.UserAuthRequest;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserAuthMapper extends Mapper<User, UserAuthRequest> {
}
