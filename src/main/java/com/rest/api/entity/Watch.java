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
    private String toRepair;
    @Column
    private String deadline;
    @Column
    private double cost;

    public Watch() {
    }

    public Watch(String company, String country, String model, String movement, String movementModel,
                 String toRepair, String deadline, double cost) {
        this.company = company;
        this.country = country;
        this.model = model;
        this.movement = movement;
        this.movementModel = movementModel;
        this.toRepair = toRepair;
        this.deadline = deadline;
        this.cost = cost;
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

    public String getToRepair() {
        return toRepair;
    }

    public void setToRepair(String toRepair) {
        this.toRepair = toRepair;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double price) {
        this.cost = price;
    }
}
