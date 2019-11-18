package com.neuralproject.financialmanagementsys.code.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "authorities" )
@Entity
public class OAuthCodeModel  {

    @Id
    @Column(name = "code")
    private Integer code;

    @Column(name = "authentication")
    private String authentication;

}
