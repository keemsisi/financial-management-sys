package com.neuralproject.financialmanagementsys.code.models.documents.user;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.UUID;

@Document
public class UserAccountModel {
    @Id
    private UUID uuid ;
    private UUID budgetUUID ;
    private UUID incomeUUID ;
    private UUID expendituresUUID;
    private UUID activityUUID ;
    private UUID cashAmountUUID ;



    private UUID investmentUUID;

    @Field
    private String firstname ;
    @Field
    private String lastname ;
    @Field
    private String  username ;
    @Field
    private String  password ;
    private String  emailAddress ;
    private  String phoneNumber ;
    private String  dateRegistered;

    private Long totalIncomeAmount ;
    private Long tatalBudgetAmount ;

    public Long getTotalIncomeAmount() {
        return totalIncomeAmount;
    }

    public void setTotalIncomeAmount(Long totalIncomeAmount) {
        this.totalIncomeAmount = totalIncomeAmount;
    }

    public Long getTatalBudgetAmount() {
        return tatalBudgetAmount;
    }

    public void setTatalBudgetAmount(Long tatalBudgetAmount) {

        this.tatalBudgetAmount = tatalBudgetAmount;
    }
    //create a default budeget row data for each user


    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public UUID getBudgetUUID() {
        return budgetUUID;
    }

    public void setBudgetUUID(UUID budgetUUID) {
        this.budgetUUID = budgetUUID;
    }

    public UUID getIncomeUUID() {
        return incomeUUID;
    }

    public void setIncomeUUID(UUID incomeUUID) {
        this.incomeUUID = incomeUUID;
    }

    public UUID getExpendituresUUID() {
        return expendituresUUID;
    }

    public void setExpendituresUUID(UUID expendituresUUID) {
        this.expendituresUUID = expendituresUUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public void setDateRegistered(String dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    public UUID getActivityUUID() {
        return activityUUID;
    }

    public void setActivityUUID(UUID activityUUID) {
        this.activityUUID = activityUUID;
    }

    public UUID getCashAmountUUID() {
        return cashAmountUUID;
    }

    public void setCashAmountUUID(UUID cashAmountUUID) {
        this.cashAmountUUID = cashAmountUUID;
    }

    public UUID getInvestmentUUID() {
        return investmentUUID;
    }

    public void setInvestmentUUID(UUID investmentUUID) {
        this.investmentUUID = investmentUUID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
