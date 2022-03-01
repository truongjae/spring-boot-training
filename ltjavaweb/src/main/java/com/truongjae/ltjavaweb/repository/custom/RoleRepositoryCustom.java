package com.truongjae.ltjavaweb.repository.custom;

import com.truongjae.ltjavaweb.dto.RoleDTO;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.EntityManager;

@Repository
public class RoleRepositoryCustom {
    public RoleDTO getRole(EntityManager entityManager) {
        String queryStr = "select r.id,r.name from role r join news n on r.id = n.id where n.title = ?1";
        try {
            Query query = entityManager.createNativeQuery(queryStr);
            query.setParameter(1, "bai 3");
            for(Object o : (Object[]) query.getSingleResult()){
                System.out.println(o.getClass());
            }
            return new RoleDTO((Object[]) query.getSingleResult());
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
