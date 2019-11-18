package com.neuralproject.financialmanagementsys.code.models.documents.user;


//import io.swagger.annotations.ApiModelProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Document
public class ExpenditureModel {
    @Id
//    @ApiModelProperty(value = "The Id for the expenditure model")
    private UUID uuid;
    private String description;
    private String dateDocumented;
    private Long costAmount ;
//    @ApiModelProperty(value = "The ")
    private String dateSpent ;

    public ExpenditureModel(UUID uuid, String description, String dateDocumented, Long costAmount, String dateSpent) {
        this.uuid = uuid;
        this.description = description;
        this.dateDocumented = dateDocumented;
        this.costAmount = costAmount;
        this.dateSpent = dateSpent;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateDocumented() {
        return dateDocumented;
    }

    public void setDateDocumented(String dateDocumented) {
        this.dateDocumented = dateDocumented;
    }

    public Long getCostAmount() {
        return costAmount;
    }

    public void setCostAmount(Long costAmount) {
        this.costAmount = costAmount;
    }

    public String getDateSpent() {
        return dateSpent;
    }

    public void setDateSpent(String dateSpent) {
        this.dateSpent = dateSpent;
    }
}
