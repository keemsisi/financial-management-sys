package com.neuralproject.financialmanagementsys.code.repositories.security;

import com.neuralproject.financialmanagementsys.code.models.entities.security.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nydiarra on 06/05/17.
 */


@Repository
public interface OAuthUserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
