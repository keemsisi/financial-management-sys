package com.neuralproject.financialmanagementsys.code.controllers;

import com.neuralproject.financialmanagementsys.code.dao.UserAccountDAO;
import com.neuralproject.financialmanagementsys.code.models.documents.user.UserAccountModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/users")
public class RegistrationController {

    @Autowired
    UserAccountDAO userAccountDAO ;
    @RequestMapping(value = "/register/new/user" , method = RequestMethod.POST)
    public boolean createNewStakeholder( @RequestBody  UserAccountModel newUser ){
        System.out.println(newUser.getEmailAddress());
        newUser.setUuid(UUID.randomUUID());
        //register new user into the system
        return userAccountDAO.createNewUserAccount(newUser);
    }

    @RequestMapping(value = "/all" , method = RequestMethod.POST)
    public ResponseEntity<List<UserAccountModel>> getAllUsers( ){
        //register new user into the system
        return userAccountDAO.findAllUserAccount(0, 10);
    }
}
