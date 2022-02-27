package com.truongjae.newspring.mapper.user;

import com.truongjae.newspring.entity.User;
import com.truongjae.newspring.mapper.Mapper;
import com.truongjae.newspring.model.request.user.UserSaveRequest;
@org.mapstruct.Mapper(componentModel = "spring")
public interface UserSaveMapper extends Mapper<User, UserSaveRequest> {
}
