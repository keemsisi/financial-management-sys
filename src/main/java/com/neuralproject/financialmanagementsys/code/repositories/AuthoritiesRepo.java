package com.neuralproject.financialmanagementsys.code.repositories;

import com.neuralproject.financialmanagementsys.code.models.entities.AuthoritiesModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AuthoritiesRepo extends CrudRepository<AuthoritiesModel, String> {
}
