package com.neuralproject.financialmanagementsys.code.repositories;

import com.neuralproject.financialmanagementsys.code.models.entities.OAuthClientDetailsModel;
import org.springframework.data.repository.CrudRepository;

public interface OAuthClientDetailsRepo extends CrudRepository<OAuthClientDetailsModel, String>{
}
