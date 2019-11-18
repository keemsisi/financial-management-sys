package com.neuralproject.financialmanagementsys.code.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/stakeholder")
public class PasswordResetController {

    @PostMapping(path = "/reset-link/{emailAddress}")
    public ResponseEntity<String> sendResetLink(@PathVariable(value = "username") String username){
        //send reset passsword link
        return null;
    }


    @ApiOperation(value = "The API reset the password of the user...")
    @PostMapping(path = "/reset-password/{username}")
    public Boolean resetPassword(@PathVariable(value = "username") String userName){
        return true ; // if the password was successfully reset
    }
}
