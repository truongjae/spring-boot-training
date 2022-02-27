package com.truongjae.helloworld.mapper.user;

import com.truongjae.helloworld.dto.UserAuthDTO;
import com.truongjae.helloworld.entity.User;
import com.truongjae.helloworld.mapper.Mapper;

@org.mapstruct.Mapper(componentModel = "spring")
public interface UserAuthMapper extends Mapper<UserAuthDTO, User> {
}
