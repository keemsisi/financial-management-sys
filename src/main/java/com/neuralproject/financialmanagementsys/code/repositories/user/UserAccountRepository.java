package com.neuralproject.financialmanagementsys.code.repositories.user;

import com.neuralproject.financialmanagementsys.code.models.documents.user.UserAccountModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserAccountRepository extends MongoRepository<UserAccountModel, UUID> {

    UserAccountModel findOneByUsername(String username);
    boolean deleteByUsername(String username);

    @Query(value = "{}", sort = "true" , fields = "")
    List<UserAccountModel> findByFirstname(String firstname);

    List<UserAccountModel> findAll();

}
