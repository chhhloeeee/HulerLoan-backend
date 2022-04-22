package com.example.loan.model;

public class Equipment {
    
    private Integer equipmentID;
    private Integer categoryID;
    private Integer specsID;
    private Integer availability;
    private String categoryName;

    public Equipment(Integer equipmentID, Integer categoryID, Integer specsID, Integer availability, String categoryName) {
        this.equipmentID = equipmentID;
        this.categoryID = categoryID;
        this.specsID = specsID;
        this.availability = availability;
        this.categoryName = categoryName;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Integer getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Integer equipmentID) {
        this.equipmentID = equipmentID;
    }

    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public Integer getSpecsID() {
        return specsID;
    }

    public void setSpecsID(Integer specsID) {
        this.specsID = specsID;
    }

    public Integer getAvailability() {
        return availability;
    }

    public void setAvailability(Integer availability) {
        this.availability = availability;
    }

    public Equipment() {
    }
    
}
