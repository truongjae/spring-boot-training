package com.truongjae.ltjavaweb.dto;

import com.truongjae.ltjavaweb.entity.RoleEntity;
import lombok.Data;

import javax.persistence.Column;
import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO2 {
    private String userName;
    private String password;
    private List<RoleDTO> roles = new ArrayList<>();
}
