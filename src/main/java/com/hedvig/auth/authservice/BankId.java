package com.hedvig.auth.authservice;

import org.springframework.stereotype.Component;

import javax.ws.rs.*;

@Component
@Path("bankid")
public class BankId {


    @POST
    @Path("start")
    public String startAuth(@FormParam("idnumber") String idnumber) {
        return idnumber + "3";
    }

    @Path("status")
    @GET
    public String test() {
        return "yes";
    }

}
