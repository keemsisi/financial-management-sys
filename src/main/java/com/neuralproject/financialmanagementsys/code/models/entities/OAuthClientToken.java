package com.neuralproject.financialmanagementsys.code.models.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Table(name = "oauth_client_token")
@Entity
public class OAuthClientToken {

    @Id
    @Column(name = "token_id")
    private String tokenId;

    @Column(name = "token")
    private String token;


    @Column(name = "authentication_id")
    private Integer authenticationId;

    @Column(name = "user_name")
    private Integer username;

    @Column(name = "client_id")
    private String clientId;

}
