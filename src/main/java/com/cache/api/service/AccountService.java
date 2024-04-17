package com.cache.api.service;

import com.cache.api.deledgate.AccountDeledgate;
import com.cache.api.dto.AccountObj;
import com.cache.api.utils.CommonHttpResult;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/Account")
public class AccountService {
    private static final String TAG = "AccountService";

    @POST
    @Path("/register")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public CommonHttpResult<Boolean> register(AccountObj accountObj) {
        return AccountDeledgate.register(accountObj);
    }

}
