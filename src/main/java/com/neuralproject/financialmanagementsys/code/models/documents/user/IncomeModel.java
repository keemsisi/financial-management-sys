package com.neuralproject.financialmanagementsys.code.models.documents.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;


@Document
public class IncomeModel {
    @Id
    private UUID uuid;
    private Float incomeAmount;
    private String incomeSource ;
    private Date incomeDate ;
    private String cashOrCard ;
    private String username ;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Float getIncomeAmount() {
        return incomeAmount;
    }

    public void setIncomeAmount(Float incomeAmount) {
        this.incomeAmount = incomeAmount;
    }

    public String getIncomeSource() {
        return incomeSource;
    }

    public void setIncomeSource(String incomeSource) {
        this.incomeSource = incomeSource;
    }

    public Date getIncomeDate() {
        return incomeDate;
    }

    public void setIncomeDate(Date incomeDate) {
        this.incomeDate = incomeDate;
    }

    public String getCashOrCard() {
        return cashOrCard;
    }

    public void setCashOrCard(String cashOrCard) {
        this.cashOrCard = cashOrCard;
    }
}
