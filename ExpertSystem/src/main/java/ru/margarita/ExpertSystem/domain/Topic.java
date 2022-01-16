package ru.margarita.ExpertSystem.domain;

import javax.persistence.*;

@Entity
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // почему в примере Integer?
    private int id;

    @Column(name = "name")
    private String name;

    // Что ему надо?
    @Column(desription = "description")
    private  String description;

   @Column (division = "division")
    private String division;

    public Topic(String name, String description, String division) {
        this.name = name;
        this.description = description;
        this.division = division;

    }

    //зачем он требовал пустой конструктор?
    public Topic() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }
}
