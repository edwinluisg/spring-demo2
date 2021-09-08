package com.luis.demo3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name = "cards")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "number", nullable = false)
    private Integer number;
    @Column(name = "expiry", nullable = false)
    private Date expiry;
    @Column(name = "type")
    private Integer type;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
