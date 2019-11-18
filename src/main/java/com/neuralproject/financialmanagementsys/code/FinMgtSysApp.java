package com.neuralproject.financialmanagementsys.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;

@SpringBootApplication
//@EnableGlobalAuthentication
//@EnableWebSecurity
@EnableAsync
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@CrossOrigin(value = {"http://localhost:8082"}, methods = {
		RequestMethod.GET , RequestMethod.POST, RequestMethod.PUT , RequestMethod.DELETE  , RequestMethod.OPTIONS
})
@EnableWebMvc
public class FinMgtSysApp {

	public static void main(String[] args) {
		SpringApplication.run(FinMgtSysApp.class, args);
	}

}
