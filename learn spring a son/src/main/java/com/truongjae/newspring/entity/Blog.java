package com.truongjae.newspring.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String thumbnail;
    @Column
    private String url;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String title;
    @Column(columnDefinition = "longtext")
    private String content;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
}
