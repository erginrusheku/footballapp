package com.ergin.football.entities;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "player_id")
    private Long id;
    private String name;
    private String lastName;
    private int age;
    private int numberOfShirt;
    private Position position;
    private Team team;
    private Coach coach;


}
