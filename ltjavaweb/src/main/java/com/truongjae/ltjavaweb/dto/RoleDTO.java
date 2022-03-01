package com.truongjae.ltjavaweb.dto;

import com.truongjae.ltjavaweb.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class RoleDTO {
    private Long id;
    private String name;
//    private List<UserEntity> users= new ArrayList<>();

    public RoleDTO(Object[] columns){
        this.id = ((BigInteger) columns[0]).longValue();
        this.name = (String) columns[1];
    }

}
