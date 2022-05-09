package com.example.loan.service;

import com.example.loan.entity.EquipmentEntity;
import com.example.loan.entity.LoanEntity;

import com.example.loan.model.Loan;
import com.example.loan.repository.EquipmentRepository;
import com.example.loan.repository.LoanRepository;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LoanServiceImpl implements LoanService {

    private LoanRepository loanRepository;
    private EquipmentRepository er;
    
    public LoanServiceImpl(LoanRepository loanRepository, EquipmentRepository er) {
        this.loanRepository = loanRepository;
        this.er = er;
    }

    @Override
    public Loan saveLoan(Loan loan) throws Exception {
        LoanEntity loanEntity = new LoanEntity();
        BeanUtils.copyProperties(loan, loanEntity);
        
        int eid = loan.getEquipmentID();
        

        EquipmentEntity equipment = er.getById(eid);
        // 
        if (equipment.getAvailability() <= equipment.getOnloan()){
            // Cant lend
            // Need to work out what to do here
            System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEp");
            throw new Exception("Invalid Request");

          

        

        }else{
            equipment.setOnloan(equipment.getOnloan() +1);
            er.save(equipment);
                    //Equipment e = new Equipment;
        // Check to see if equipment is available
        // Update Equipment avaiability 
        
        loanRepository.save(loanEntity);
        return loan;
    
        }



    }

    @Override
    public List<Loan> getAllLoan() {
        List<LoanEntity> loanEntities = loanRepository.findAll();

        List<Loan> loan = loanEntities
                .stream()
                .map(loanEntity -> new Loan(
                        loanEntity.getLoanID(),
                        loanEntity.getUserID(),
                        loanEntity.getEquipmentID(),
                        loanEntity.getIssuedate(),
                        loanEntity.getReturndate(),
                        loanEntity.getDayselapsed(),
                        loanEntity.getActive(),
                        loanEntity.getEquipmentAvailable()))
                .collect(Collectors.toList());
        return loan;
    }

    @Override
    public Loan getLoanById(Integer loanID) {
        LoanEntity loanEntity = loanRepository.findById(loanID).get();
        Loan loan = new Loan();
        BeanUtils.copyProperties(loanEntity, loan);
        return loan;
    }

    @Override
    public boolean deletedLoan(Integer loanID) {

        
        LoanEntity loan = loanRepository.findById(loanID).get();
        if (loan.getEquipmentID() != null && loan.getEquipmentID() != 0){
            EquipmentEntity equipment = er.getById(loan.getEquipmentID());
            equipment.setOnloan(equipment.getOnloan()-1);
            er.save(equipment);
    
        }


        loanRepository.delete(loan);
        return true;
    }

    @Override
    public Loan updateLoan(Integer loanID, Loan loan) {
        LoanEntity loanEntity = loanRepository.findById(loanID).get();
        loanEntity.setUserID(loan.getUserID());
        loanEntity.setEquipmentID(loan.getEquipmentID());
        loanEntity.setActive(loan.getActive());
        loanEntity.setDayselapsed(loan.getDayselapsed());
        loanEntity.setIssuedate(loan.getIssuedate());
        loanEntity.setReturndate(loan.getReturndate());

        loanRepository.save(loanEntity);
        return loan;
    }

}
