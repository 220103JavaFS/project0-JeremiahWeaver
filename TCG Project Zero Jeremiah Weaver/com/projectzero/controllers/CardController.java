package com.projectzero.controllers;

import com.projectzero.servies.CardService;
import io.javalin.Javalin;
import io.javalin.http.Handler;


public class CardController implements Controller {

    private CardService cs = new CardService();

    Handler getCard = (ctx) -> {
        if ctx.req.getSesion(false)!=null){
            String idString = ctx.pathParam("id");
            int id = Interger.parseInt(idString);
            Card card = cs.callcard(id);
            ctx.json(card);
            ctx.status(200);
        }else{
            ctx.status(401);
        }

    };

    @Override
    public void addRoutes(Javalin app) { app.get("/card{id}", getCard);}

    }

    private Card
}
