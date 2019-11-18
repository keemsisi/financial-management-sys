package com.neuralproject.financialmanagementsys.code.repositories;

//import org.springframework.data.repository.CrudRepository;

import com.neuralproject.financialmanagementsys.code.models.entities.OAuthRefreshTokenModel;
import org.springframework.data.repository.CrudRepository;

public interface OAuthRefreshToken extends CrudRepository<OAuthRefreshTokenModel, String> {
}
