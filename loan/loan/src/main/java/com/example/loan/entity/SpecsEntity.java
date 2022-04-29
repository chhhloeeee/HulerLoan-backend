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
    private Integer categoryID;
    private String description;

    public SpecsEntity(Integer specsID, Integer categoryID, String description) {
        this.specsID = specsID;
        this.categoryID = categoryID;
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

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
