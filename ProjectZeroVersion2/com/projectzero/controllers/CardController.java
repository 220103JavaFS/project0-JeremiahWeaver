package com.projectzero.controllers;

import com.projectzero.service.CardService;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class CardController {

    private CardService CS = new CardService();

    Handler gerCard = (ctx) -> {
        if (ctx.req.getSession(false)!=null){
            String idString = ctx.pathParam("id");
            int id = Integer.parseInt(idString);
            Card card = CardService.callCard(id);
            ctx.json(card);
            ctx.status(200);
        }else{
            ctx.status(401);
        }
    };

    public void addRoutes(Javalin app) {app.get("/card/{id}", getcard),}
}
