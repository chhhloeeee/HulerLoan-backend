package com.example.loan.model;

public class Loan {
    private Integer loanID;
    private Integer userID;
    private Integer equipmentID;
    private String issuedate;
    private String returndate;
    private Integer dayselapsed;
    private Boolean active;
    private Integer equipmentAvaiable;

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

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public String getReturndate() {
        return returndate;
    }

    public void setReturndate(String returndate) {
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

    public Integer getEquipmentAvailable() {
        return equipmentAvaiable;
    }

    public void setEquipmentAvailable(Integer equipmentAvailable) {
        this.equipmentAvaiable = equipmentAvailable;
    }

    public Loan(Integer loanID, Integer userID, Integer equipmentID, String issuedate, String returndate,
            Integer dayselapsed, Boolean active, Integer equipmentAvailable) {
        this.loanID = loanID;
        this.userID = userID;
        this.equipmentID = equipmentID;
        this.issuedate = issuedate;
        this.returndate = returndate;
        this.dayselapsed = dayselapsed;
        this.active = active;
        this.equipmentAvaiable = equipmentAvailable;
    }

    public Loan() {
    }
}
