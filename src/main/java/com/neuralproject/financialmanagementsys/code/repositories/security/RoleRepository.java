package com.neuralproject.financialmanagementsys.code.repositories.security;

import com.neuralproject.financialmanagementsys.code.models.entities.security.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
