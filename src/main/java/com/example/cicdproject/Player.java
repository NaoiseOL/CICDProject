package com.example.cicdproject;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Player{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String firstname;
    private String surname;
    private int age;
    private String DoB;
    private String nationality;
    private int heightinMetres;
    private String position;
    private String foot;
    private String club;
    private int marketValue;


    public Player(String id,String firstname , String surname, int age, String DoB, String nationality, int heightinMetres, String position, String foot, String club, int marketValue){
        setId(id);
        setFirstname(firstname);
        setSurname(surname);
        setAge(age);
        setDoB(DoB);
        setNationality(nationality);
        setHeightinMetres(heightinMetres);
        setPosition(position);
        setFoot(foot);
        setClub(club);
        setMarketValue(marketValue);
    }
}
