package com.sheryians.major.model;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "category")
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id" )
    private int id;

    private String name;
}
