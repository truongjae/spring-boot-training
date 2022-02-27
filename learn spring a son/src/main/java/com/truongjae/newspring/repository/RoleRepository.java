package com.truongjae.newspring.repository;

import com.truongjae.newspring.entity.Role;
import java.util.List;

public interface RoleRepository extends BaseRepository<Role,Long> {
    List<Role> findAllByIdIn(List<Long> ids);
//    List<Role> findAllByUser
}
