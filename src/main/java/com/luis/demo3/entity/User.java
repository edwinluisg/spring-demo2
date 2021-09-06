package com.luis.demo3.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", length = 300, nullable = false)
    private String name;
    @Column(name = "email", nullable = false, unique = true)
    private String email;
}
