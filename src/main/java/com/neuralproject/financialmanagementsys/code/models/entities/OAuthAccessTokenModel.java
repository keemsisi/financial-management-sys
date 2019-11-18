package com.neuralproject.financialmanagementsys.code.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "oauth_access_token")
@Entity
public class OAuthAccessTokenModel {
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

    @Column(name = "authentication")
    private Integer getAuthentication;

    @Column(name = "refresh_token")
    private String refreshToken;

}
