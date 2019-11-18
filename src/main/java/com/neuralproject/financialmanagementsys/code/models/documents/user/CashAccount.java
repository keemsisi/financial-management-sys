package com.neuralproject.financialmanagementsys.code.models.documents.user;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;


@Document
public class CashAccount {
    @Id
    private UUID uuid ;
    private Float cashAccount ;
    private Date dateAdded ;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Float getCashAccount() {
        return cashAccount;
    }

    public void setCashAccount(Float cashAccount) {
        this.cashAccount = cashAccount;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
