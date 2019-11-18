package com.neuralproject.financialmanagementsys.code.repositories.user;

import com.neuralproject.financialmanagementsys.code.models.documents.user.IncomeModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository
public interface IncomeRepo extends MongoRepository<IncomeModel, UUID> {
    IncomeModel findByUsername(String username);
}
