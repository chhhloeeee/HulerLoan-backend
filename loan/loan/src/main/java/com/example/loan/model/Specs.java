package com.example.loan.model;

public class Specs {
    private Integer specsID;
    private String description;

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

    public Specs(Integer specsID, String description) {
        this.specsID = specsID;
        this.description = description;
    }

    public Specs() {
    }
}
