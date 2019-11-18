package com.neuralproject.financialmanagementsys.code.repositories.user;

import com.neuralproject.financialmanagementsys.code.models.entities.OAuthUsersModel;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepo extends CrudRepository<OAuthUsersModel, String> {
}
