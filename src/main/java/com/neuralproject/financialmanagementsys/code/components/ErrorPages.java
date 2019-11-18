package com.neuralproject.financialmanagementsys.code.components;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

public class ErrorPages {

    @Component
    public class CustomizationBean implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {
        @Override
        public void customize(ConfigurableServletWebServerFactory container) {
            container.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST, "/400")); //
            container.addErrorPages(new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500")); // server error
            container.addErrorPages(new ErrorPage(HttpStatus.METHOD_NOT_ALLOWED, "/403")); // method not allowed
            container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/404")); // page is not found
            container.addErrorPages(new ErrorPage(HttpStatus.UNAUTHORIZED, "/401")); // not authorised
        }
    }
}
