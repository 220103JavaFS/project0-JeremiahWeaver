package com.pzfc.controller;


import com.pzfc.models.UserDTO;
import com.pzfc.services.UserLoginService;
import io.javalin.Javalin;
import io.javalin.http.Handler;

public class UserLoginController implements Controller{

    UserLoginService loginService = new UserLoginService();

    private Handler loginAttempt = ctx -> {
        UserDTO user = ctx.bodyAsClass(UserDTO.class);

        if(loginService.login(user.username, user.password)){
            ctx.req.getSession();
            ctx.status(200);
        }else{
            ctx.req.getSession().invalidate();
            ctx.status(401);
        }

    };

    @Override
    public void addRoutes(Javalin app){app.post("/login", this.loginAttempt);}

    }

