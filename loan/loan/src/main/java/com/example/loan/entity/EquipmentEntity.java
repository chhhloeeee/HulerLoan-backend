package com.example.loan.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "equipment")
public class EquipmentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer equipmentID;
    private Integer categoryID;
    private Integer specsID;
    private Integer availability;
    @OneToOne()
        @JoinColumn(name="categoryID", referencedColumnName = "categoryID", insertable = false, updatable = false)   
    private CategoryEntity category;
    @OneToOne()
        @JoinColumn(name="specsID", referencedColumnName = "specsID", insertable = false, updatable = false)
        private SpecsEntity specs;

    public CategoryEntity getCategory(){
        return this.category;
    }
    public String getCategoryName(){
        return this.category.getName();
    }
    public SpecsEntity getSpecs(){
        return this.specs;
    }
    public String getSpecsDescription(){
        return this.specs.getDescription();
    }

    public EquipmentEntity(Integer equipmentID, Integer categoryID, Integer specsID, Integer availability) {
        this.equipmentID = equipmentID;
        this.categoryID = categoryID;
        this.specsID = specsID;
        this.availability = availability;
    
    }
    public EquipmentEntity() {
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

    
}
