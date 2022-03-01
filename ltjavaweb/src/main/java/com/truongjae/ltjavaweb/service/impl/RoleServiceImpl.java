package com.truongjae.ltjavaweb.service.impl;

import com.truongjae.ltjavaweb.dto.RoleDTO;
import com.truongjae.ltjavaweb.repository.RoleRepository;
import com.truongjae.ltjavaweb.repository.custom.RoleRepositoryCustom;
import com.truongjae.ltjavaweb.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private RoleRepositoryCustom roleRepositoryCustom;
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<RoleDTO> listRoleDTO() {
        return roleRepository.listRoleDTO();
    }

    @Override
    public RoleDTO roleDTOCustom() {
        return roleRepositoryCustom.getRole(entityManager);
    }
}
