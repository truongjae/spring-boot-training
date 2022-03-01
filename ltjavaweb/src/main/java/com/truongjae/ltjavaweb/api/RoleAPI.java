package com.truongjae.ltjavaweb.api;

import com.truongjae.ltjavaweb.dto.NewsJoin;
import com.truongjae.ltjavaweb.dto.RoleDTO;
import com.truongjae.ltjavaweb.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleAPI {
    @Autowired
    private RoleService roleService;

    @GetMapping("/role")
    public RoleDTO roleDTO(){
        return roleService.roleDTOCustom();
    }
}
