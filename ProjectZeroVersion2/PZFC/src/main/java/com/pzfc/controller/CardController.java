package com.pzfc.controller;

import com.pzfc.models.Card;
import com.pzfc.services.CardServices;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class CardController implements Controller{

    private CardServices cardServices = new CardServices();

    Handler getCard = (ctx) -> {
        if(ctx.req.getSession(false)!=null){
            String idString = ctx.pathParam("id");
            int id = Integer.parseInt(idString);
            Card card = cardServices.callCard(id);
            ctx.json(card);
            ctx.status(200);
        }else{
            ctx.status(401);
        }
    };

    Handler getPlayer = (ctx) -> {
        if(ctx.req.getSession(false)!=null){
            String
        }
    }

    @Override
    public void addRoutes(Javalin app) {
        
    }
}
