package com.neuralproject.financialmanagementsys.code.repositories.admin;


import com.neuralproject.financialmanagementsys.code.models.documents.admin.AdminActivitiesModel;
import com.neuralproject.financialmanagementsys.code.models.documents.admin.AdminModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AdminActivitiesRepo extends MongoRepository<AdminActivitiesModel, UUID > {
    List<AdminModel> findByUuid(String uuid);
    List<AdminModel> findByActivityDate(String actitivies);
//    List<AdminModel> findByActionsPerformed(String actionsPerformed);
    List<AdminModel> findByLoginDate(String loginDate);
//    @Query(value =   "", fields = "{ 'password' : 0 }")
    List<AdminModel> findByLogoutDate(String logoutDate);


}
