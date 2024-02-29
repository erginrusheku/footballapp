package com.ergin.football.entities;

import javax.persistence.*;

@Entity
public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coach_id")
    private Long id;
    private String name;
    private String lastName;
    private int age;
    private Team team;
    private Player player;

}
