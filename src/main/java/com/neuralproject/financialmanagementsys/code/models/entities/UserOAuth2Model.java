package com.neuralproject.financialmanagementsys.code.models.entities;


import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Entity
@Table
public class UserOAuth2Model implements Serializable {

        @Id
        @NotNull
        private String id;
        @Field
        @NotNull
        private String username;
        @Field
        @NotNull
        private String companyId;

        @Field
        @NotNull
        private String password;
        @NotNull
        private Boolean isEnabled;
        @Field
        private Boolean isVisible;

    public UserOAuth2Model(@NotNull String id, @NotNull String username, @NotNull String companyId, @NotNull String password, @NotNull Boolean isEnabled, Boolean isVisible) {
        this.id = id;
        this.username = username;
        this.companyId = companyId;
        this.password = password;
        this.isEnabled = isEnabled;
        this.isVisible = isVisible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean enabled) {
        isEnabled = enabled;
    }

    public Boolean geIstVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean visible) {
        isVisible = visible;
    }
}
