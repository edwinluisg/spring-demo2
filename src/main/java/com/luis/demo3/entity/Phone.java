package com.luis.demo3.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "phones")
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number", nullable = false)
    private Integer number;
}
