package com.kruger.cardatabase.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "car")
@Data
public class Car{

    /***
     *
     */


    @Id
    @GeneratedValue(generator = "seq_car")
    @SequenceGenerator(name = "seq_car", sequenceName = "DB_SEQ_CAR",allocationSize = 1)
    private long id;
    private String brand, model, color, registerNumber;
    @Column(name="year")
    private int year;
    private int price;

    private Car(){}


    public Car(String brand, String model, String color,
            String registerNumber,int year, int price, Owner owner){
        super();
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.registerNumber = registerNumber;
        this.year = year;
        this.price = price;
        this.owner= owner;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner")
    private Owner owner;




}
