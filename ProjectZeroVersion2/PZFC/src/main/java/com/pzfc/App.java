package com.pzfc;

import com.pzfc.controller.*;
import io.javalin.Javalin;

public class App{

    private static Javalin app;

    public static void main(String[] args) {

        app = Javalin.create();
        configure(new RookieController());
        app.start();
    }

    private static void configure(Controller... controllers) {
        for (Controller c : controllers) {
            c.addRoutes(app);
        }
    }
}

