package com.example.loan.repository;

import com.example.loan.entity.SpecsEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecsRepository extends JpaRepository<SpecsEntity, Integer> {
}
