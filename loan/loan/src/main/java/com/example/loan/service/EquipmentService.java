package com.example.loan.service;

import com.example.loan.model.Equipment;

import java.util.List;

public interface EquipmentService {
    Equipment saveEquipment(Equipment equipment);

    List<Equipment> getAllEquipment();

    Equipment getEquipmentById(Integer equipmentID);

    boolean deletedEquipment(Integer equipmentID);

    Equipment updateEquipment(Integer equipmentID, Equipment equipment);
    
}
