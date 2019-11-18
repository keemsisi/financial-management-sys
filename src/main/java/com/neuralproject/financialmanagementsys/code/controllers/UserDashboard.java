package com.neuralproject.financialmanagementsys.code.controllers;


//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserDashboard {



//    @ApiOperation(value = "This rest api displays the dashboar to the user.")
//    @ApiResponse(code = 404 , message = "This route used can not be found on the server...")
    @GetMapping(value = "/user/dashboard")
    public ResponseEntity<String> showDashboardView(){
        //send the view of the dashboard
        return ResponseEntity.ok().body("administrator");
    }
}
