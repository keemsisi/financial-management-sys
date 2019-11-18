package com.neuralproject.financialmanagementsys.code.models.documents.admin;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import sun.security.util.Password;

import javax.persistence.Id;
import java.util.HashMap;
import java.util.UUID;

@Document(value = "admin-document")
public class AdminModel {

    @Id
    private UUID uuid;

    @Field
    private String username ;

    @Field
    private Password password ; // endcrypted password

    @Field
    private String dateOfRegistration;

    @Field
    private String adminRole ;

    @Field
    private String gender ;
    @Field
    private String email ;

    @Field
    private String recentActiviesPerformed ;
    @Field
    private HashMap<String  , String > timeLines ; // activities timelines


    public AdminModel(UUID uuid, String username, Password password, String dateOfRegistration, String adminRole) {
        this.uuid = uuid;
        this.username = username;
        this.password = password;
        this.dateOfRegistration = dateOfRegistration;
        this.adminRole = adminRole;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(String adminRole) {
        this.adminRole = adminRole;
    }
}
