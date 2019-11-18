package com.neuralproject.financialmanagementsys.code.models.entities;

import javax.persistence.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "oauth_refresh_token")
public class OAuthRefreshTokenModel {

    @Id
    @Column(name = "token_id")
    private String tokenId;

    @Column(name = "token")
    private String token;

    @Column(name = "authentication")
    private String authentication;

}
