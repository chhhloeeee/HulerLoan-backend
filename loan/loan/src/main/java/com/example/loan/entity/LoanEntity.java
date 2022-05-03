package com.example.loan.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loan")
public class LoanEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer loanID;
    private Integer userID;
    private Integer equipmentID;
    private Date issuedate;
    private Date returndate;
    private Integer dayselapsed;
    private Boolean active;

    public LoanEntity(Integer loanID, Integer userID, Integer equipmentID, Date issuedate, Date returndate,
            Integer dayselapsed, Boolean active) {
        this.loanID = loanID;
        this.userID = userID;
        this.equipmentID = equipmentID;
        this.issuedate = issuedate;
        this.returndate = returndate;
        this.dayselapsed = dayselapsed;
        this.active = active;
    }

    public LoanEntity() {
    }

    public Integer getLoanID() {
        return loanID;
    }

    public void setLoanID(Integer loanID) {
        this.loanID = loanID;
    }

    public Integer getUserID() {
        return userID;
    }

    public void setUserID(Integer userID) {
        this.userID = userID;
    }

    public Integer getEquipmentID() {
        return equipmentID;
    }

    public void setEquipmentID(Integer equipmentID) {
        this.equipmentID = equipmentID;
    }

    public Date getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(Date issuedate) {
        this.issuedate = issuedate;
    }

    public Date getReturndate() {
        return returndate;
    }

    public void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    public Integer getDayselapsed() {
        return dayselapsed;
    }

    public void setDayselapsed(Integer dayselapsed) {
        this.dayselapsed = dayselapsed;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

}
