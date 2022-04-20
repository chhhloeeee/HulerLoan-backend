package com.example.loan.service;

import com.example.loan.model.Loan;

import java.util.List;

public interface LoanService {
    Loan saveLoan(Loan loan);

    List<Loan> getAllLoan();

    Loan getLoanById(Integer loanID);

    boolean deletedLoan(Integer loanID);

    Loan updateLoan(Integer loanID, Loan loan);
    
}
