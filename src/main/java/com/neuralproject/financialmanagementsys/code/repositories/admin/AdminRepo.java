package com.neuralproject.financialmanagementsys.code.repositories.admin;

import com.neuralproject.financialmanagementsys.code.models.documents.admin.AdminModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;



@Repository
public interface AdminRepo extends MongoRepository<AdminModel , UUID> {
   List<AdminModel> findByUuid(String uuid);
   List<AdminModel> findByUsername(String username);
   List<AdminModel>  findByDateOfRegistration(String dateOfRegistration);
   List<AdminModel>  findByAdminRole(String adminRole);
}
