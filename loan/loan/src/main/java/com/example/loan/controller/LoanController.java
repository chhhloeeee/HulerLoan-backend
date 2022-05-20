package com.example.loan.controller;

import com.example.loan.model.Loan;
import com.example.loan.service.LoanService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class LoanController {

    private LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/loan")
    public Loan saveLoan(@RequestBody Loan loan) throws Exception {
        Loan l;
        try {
            l = loanService.saveLoan(loan);
        } catch (Exception e) {

            throw new ResponseStatusException(HttpStatus.BANDWIDTH_LIMIT_EXCEEDED);
        }
        return l;
    }

    @GetMapping("/loan")
    public List<Loan> getAllLoan() {
        return loanService.getAllLoan();
    }

    @GetMapping("/loan/{loanID}")
    public ResponseEntity<Loan> getLoanById(@PathVariable("loanID") Integer loanID) {
        Loan loan = null;
        loan = loanService.getLoanById(loanID);
        return ResponseEntity.ok(loan);
    }

    @DeleteMapping("/loan/{loanID}")
    public ResponseEntity<Map<String, Boolean>> deleteLoan(@PathVariable("loanID") Integer loanID) {
        boolean deleted = false;
        Loan loan = loanService.getLoanById(loanID);
        System.out.println(loan.getEquipmentID());
        deleted = loanService.deletedLoan(loanID);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", deleted);
        return ResponseEntity.ok(response);
    }

    @PutMapping("/loan/{loanID}")
    public ResponseEntity<Loan> updateLoan(@PathVariable("loanID") Integer loanID,
            @RequestBody Loan loan) {
        loan = loanService.updateLoan(loanID, loan);
        return ResponseEntity.ok(loan);
    }
}
