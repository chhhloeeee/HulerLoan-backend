package com.example.loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "specs")
public class SpecsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer specsID;
    private String description;

    public SpecsEntity(Integer specsID, String description) {
        this.specsID = specsID;
        this.description = description;
    }

    public SpecsEntity() {
    }

    public Integer getSpecsID() {
        return specsID;
    }

    public void setSpecsID(Integer specsID) {
        this.specsID = specsID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
