package com.neuralproject.financialmanagementsys.code.repositories;

import com.neuralproject.financialmanagementsys.code.models.documents.user.KeyStoreModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;


@Repository
public interface KeyStoreRepo extends MongoRepository<KeyStoreModel, UUID> {

    List<KeyStoreModel> findByFileOwner(String fileOwner);
    List<KeyStoreModel> findByFilename(String filename);
    List<KeyStoreModel> findByUploadDate(String uploadDate);

}
