package com.pzfc.controller;

import com.pzfc.services.RookieServices;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class RookieController implements Controller{

    private RookieServices rookieServices = new RookieServices();

    Handler getRookie = ctx->{
        if(ctx.req.getSession(false)!=null) {
            ctx.json(rookieServices.findAll());
            ctx.status(200);
        }else{
            ctx.status(400);
        }
    };

    @Override
    public void addRoutes(Javalin app) {

    }
}
