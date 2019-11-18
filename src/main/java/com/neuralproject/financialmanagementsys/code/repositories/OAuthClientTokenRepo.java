package com.neuralproject.financialmanagementsys.code.repositories;

import com.neuralproject.financialmanagementsys.code.models.entities.OAuthClientToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OAuthClientTokenRepo extends CrudRepository<OAuthClientToken, String> {
}
