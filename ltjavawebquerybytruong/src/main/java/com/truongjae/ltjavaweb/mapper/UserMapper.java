package com.truongjae.ltjavaweb.mapper;

import com.truongjae.ltjavaweb.dto.UserDTO2;
import com.truongjae.ltjavaweb.entity.UserEntity;
@org.mapstruct.Mapper(componentModel = "spring")
public interface UserMapper extends Mapper<UserEntity, UserDTO2> {
}
