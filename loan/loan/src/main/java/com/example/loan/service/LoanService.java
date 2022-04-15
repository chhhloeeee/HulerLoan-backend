package com.example.loan.service;

import java.util.List;

import com.example.loan.model.Loan;

public interface LoanService {
    Loan saveLoan(Loan loan);

    List<Loan> getAllLoans();

    Loan getLoanById(Integer loanID);

    boolean deleteLoan(Integer loanID);

    Loan updateLoan(Integer loanID, Loan loan);
}
