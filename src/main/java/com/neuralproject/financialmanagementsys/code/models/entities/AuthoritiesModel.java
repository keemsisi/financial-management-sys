package com.neuralproject.financialmanagementsys.code.models.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "authorities" )
public class AuthoritiesModel {
    @Id
    @Column(name = "username")
    @NotNull
    private String username;

    @Column(name = "authority")
    @NotNull(message = "This should not be null")
    private String authority;
}
