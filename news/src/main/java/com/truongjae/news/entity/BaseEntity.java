package com.truongjae.news.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@Data
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="createddate")
    @CreatedDate
    private Date createdDate;

    @Column(name="modifieddate")
    @LastModifiedDate
    private Date modifiedDate;

    @Column(name="createdby")
    @CreatedBy
    private String createdBy;


    @Column(name="modifiedby")
    @LastModifiedBy
    private String modifiedBy;
}
