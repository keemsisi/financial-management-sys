package com.neuralproject.financialmanagementsys.code.models.documents.user;


//import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.UUID;

@Document
public class BudgetModel {

    @Id
//    @ApiModelProperty(value = "This is the UUID of user account budget, created uniquely")
    private UUID uuid ;
//    @ApiModelProperty(value = "This is the description of the budget the user created")
    private String Description;
//    @ApiModelProperty(value = "The date the budget was created by the from the user account")
    private Date dateCreated ;
//    @ApiModelProperty(value = "The date the budget will be used.")
    private Date dateTobeUsed ;

    public BudgetModel(UUID uuid, String description, Date dateCreated, Date dateTobeUsed) {
        this.uuid = uuid;
        Description = description;
        this.dateCreated = dateCreated;
        this.dateTobeUsed = dateTobeUsed;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateTobeUsed() {
        return dateTobeUsed;
    }

    public void setDateTobeUsed(Date dateTobeUsed) {
        this.dateTobeUsed = dateTobeUsed;
    }
}
