package com.pzfc.controller;

import com.pzfc.models.Rookie;
import com.pzfc.services.RookieServices;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class RookieController implements Controller{

    private RookieServices rookieServices = new RookieServices();

    Handler getRookie = ctx->{
        if(ctx.req.getSession(false)!=null) {
            ctx.json(rookieServices.findAllRookies());
            ctx.status(200);
        }else{
            ctx.status(401);
        }
    };

    private int id;

    Handler getRookies = ctx -> {
        if(ctx.req.getSession(false)!=null) {
            ctx.json(rookieServices.findRookieById(id));
            ctx.status(200);
        }else{
            ctx.status(403);
        }
    };

    private Rookie rookie = new Rookie();

    Handler addRookie = ctx -> {
        if(ctx.req.getSession(false)!=null) {
            ctx.json(rookieServices.insertRookie(rookie));
            ctx.status(200);
        }else{
            ctx.status(400);
        }
    };

    @Override
    public void addRoutes(Javalin app) {
        app.get("/rookie", getRookie);
        app.get("/rookies", getRookies);
        app.post("/rookie", addRookie);
    }
}
