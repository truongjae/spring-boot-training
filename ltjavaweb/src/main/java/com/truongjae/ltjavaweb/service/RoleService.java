package com.truongjae.ltjavaweb.service;

import com.truongjae.ltjavaweb.dto.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> listRoleDTO();
    RoleDTO roleDTOCustom();
}
