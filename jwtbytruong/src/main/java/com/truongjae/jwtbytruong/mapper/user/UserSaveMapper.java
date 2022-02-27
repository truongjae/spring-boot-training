package com.truongjae.jwtbytruong.mapper.user;

import com.truongjae.jwtbytruong.entity.User;
import com.truongjae.jwtbytruong.mapper.Mapper;
import com.truongjae.jwtbytruong.model.user.UserSaveRequest;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserSaveMapper extends Mapper<User, UserSaveRequest> {
}
