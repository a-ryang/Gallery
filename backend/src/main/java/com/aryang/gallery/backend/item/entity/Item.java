package com.aryang.gallery.backend.item.entity;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String name;
}