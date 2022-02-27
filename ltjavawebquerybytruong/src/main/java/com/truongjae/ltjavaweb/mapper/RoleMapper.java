package com.truongjae.ltjavaweb.mapper;

import com.truongjae.ltjavaweb.dto.RoleDTO;
import com.truongjae.ltjavaweb.entity.RoleEntity;

@org.mapstruct.Mapper(componentModel = "spring")
public interface RoleMapper extends Mapper<RoleEntity, RoleDTO> {
}
