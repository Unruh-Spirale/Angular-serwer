package com.rest.api.entity;

import javax.persistence.*;

@Entity
public class Watch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idWatch;
    @Column
    private String company;
    @Column
    private String country;
    @Column
    private String model;
    @Column
    private String movement;
    @Column
    private String movementModel;
    @Column
    private double price;

    public Watch() {
    }

    public Watch(String company, String country, String model, String movement, String movementModel, double price) {
        this.company = company;
        this.country = country;
        this.model = model;
        this.movement = movement;
        this.movementModel = movementModel;
        this.price = price;
    }

    public Long getIdWatch() {
        return idWatch;
    }

    public void setIdWatch(Long idWatch) {
        this.idWatch = idWatch;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public String getMovementModel() {
        return movementModel;
    }

    public void setMovementModel(String movementModel) {
        this.movementModel = movementModel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
