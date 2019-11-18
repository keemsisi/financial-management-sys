package com.neuralproject.financialmanagementsys.code.models.entities;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "oauth_client_details" )
@Entity
public class OAuthClientDetailsModel  {

    @Id
    @Column(name="client_id")
    private  String clientId;
    @Column(name = "resource_ids")
    private String resoureIds ;

    @Column(name = "client_secret")
    private String clientSecret;
    @Column(name = "scope")
    private String scope;

    @Column(name = "authorized_grant_types")
    private String authorizedGrantTypes;


    @Column(name = "web_server_redirect_uri")
    private String webServerRedirectUri;


    @Column(name = "authorities")
    private String authorities;


    @Column(name = "access_token_validity")
    private Integer accessTokenValidity;

    @Column(name = "refresh_token_validity")
    private Integer refreTokenvalidity;

    @Column(name = "additional_information")
    private String additioalInformation;

    @Column(name = "autoapprove")
    private String autoApprove;

}
