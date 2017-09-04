package com.hedvig.auth.authservice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AuthService extends SpringBootServletInitializer {

    public static void main(String[] args){
        new AuthService()
                .configure(new SpringApplicationBuilder(AuthService.class))
                .run(args);
    }


}

