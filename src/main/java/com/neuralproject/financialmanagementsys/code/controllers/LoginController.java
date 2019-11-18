package com.neuralproject.financialmanagementsys.code.controllers;


import com.neuralproject.financialmanagementsys.code.dao.UserAccountDAO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user/login")
public class LoginController {

    @Autowired
    UserAccountDAO userAccountDAO ;

    @ApiOperation(value = "validate the user account details")
    @PostMapping(value = "/validate/user-account")
    public boolean validateUserAccountDetail(@RequestBody(required = true) String username , String password){
        return userAccountDAO.validateUserAccountLoginCredentials(username ,password);
    }
}



