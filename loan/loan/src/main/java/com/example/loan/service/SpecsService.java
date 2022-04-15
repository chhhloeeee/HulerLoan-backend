package com.example.loan.service;

import java.util.List;

import com.example.loan.model.Specs;

public interface SpecsService {
    Specs saveSpecs(Specs specs);

    List<Specs> getAllSpecs();

    Specs getSpecsById(Integer specsID);

    boolean deletedSpecs(Integer specsID);

    Specs updateSpecs(Integer specsID, Specs specs);
}
