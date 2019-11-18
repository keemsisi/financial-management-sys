package com.neuralproject.financialmanagementsys.code.controllers;


import com.neuralproject.financialmanagementsys.code.dao.UserAccountDAO;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DashBoardController {


    @Autowired
    private UserAccountDAO userAccountDAO ;

    @GetMapping( value = "/userdashboard/{username}/total-icome")
    @CrossOrigin(methods = RequestMethod.POST)
    @ApiOperation(value = "Get the total income of the user")
    public Integer getTotalIcome(@PathVariable(value = "username") String username){
        //get the total income from the db
        return null;


    }
}
