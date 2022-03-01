package com.truongjae.ltjavaweb.repository;

import com.truongjae.ltjavaweb.dto.NewsJoin;
import com.truongjae.ltjavaweb.dto.RoleDTO;
import com.truongjae.ltjavaweb.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<RoleEntity,Long> {
    @Query(value="select * from role", nativeQuery = true)
    List<RoleDTO> listRoleDTO();
}
