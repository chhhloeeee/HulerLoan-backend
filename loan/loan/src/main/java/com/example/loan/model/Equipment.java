package com.example.loan.model;

public class Equipment {

    private Integer equipmentID;
    private Integer categoryID;
    private Integer specsID;
    private Integer availability;
    private String categoryName;
    private String specsDescription;
    private Integer onloan;

    public Equipment(Integer equipmentID, Integer categoryID, Integer specsID, Integer availability,
            String categoryName, String specsDescription, Integer onloan) {
        this.equipmentID = equipmentID;
        this.categoryID = categoryID;
        this.specsID = specsID;
        this.availability = availability;
        this.categoryName = categoryName;
        this.specsDescription = specsDescription;
        this.onloan = onloan;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getSpecsDescription() {
        return specsDescription;
    }

    public void setSpecsDescription(String specsDescription) {
        this.specsDescription = specsDescription;
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

    public Integer getOnloan() {
        return onloan;
    }

    public void setOnloan(Integer onloan) {
        this.onloan = onloan;
    }

    public Equipment() {
    }

}
