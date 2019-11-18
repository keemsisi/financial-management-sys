package com.neuralproject.financialmanagementsys.code.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.math.BigInteger;
import java.util.Arrays;

@RestController
@CrossOrigin(methods = {RequestMethod.GET})
public class ArrayLeadController {


    @CrossOrigin(methods = {RequestMethod.GET})
    @GetMapping(value = "/findleads" , params = "inputs")
    public ResponseEntity<String> findLeads( @RequestParam(value = "inputs") String param) {

//        System.out.println(param);
        String leads = "";
        String[] valuesEntered = param.split("\\s+|,");
        Long[] newValues = new Long[valuesEntered.length];
//        System.out.println(Arrays.toString(valuesEntered));

        if (valuesEntered.length != 0) {

            for (int index = 0; index < valuesEntered.length; index++) {
                String element = valuesEntered[index];
                newValues[index] = Long.parseLong(element);
            }

            Long currentLead = newValues[valuesEntered.length - 1];
            leads += currentLead;
//            System.out.println(leads);

            //find all the lead arrays  here
            for (int index = newValues.length - 2; index >= 0; index--) {
//                System.out.println(newValues[index]);
                if (newValues[index] > currentLead) {
                    currentLead  = newValues[index];
                    leads += ", " + newValues[index];
                    System.out.println(leads);
                } else continue;
            }
        }
        return ResponseEntity.ok().body(leads);
    }
}
