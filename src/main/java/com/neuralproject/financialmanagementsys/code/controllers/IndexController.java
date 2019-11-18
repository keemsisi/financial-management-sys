package com.neuralproject.financialmanagementsys.code.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @GetMapping( value = "/")
    @CrossOrigin(methods = RequestMethod.GET)
    public String getTotalIcome(){
        //get the total income from the db
        return "index";
    }
}
