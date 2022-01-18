package com.pzfc;

import com.pzfc.controller.Controller;
import io.javalin.Javalin;

public class App{

    private static Javalin app;

    public static void main(String[] argd) {

        app = Javalin.create();
        configure();
        app.start();
    }

    private static void configure(Controller... controllers) {
        for (Controller c : controllers) {
            c.addRoutes(app);
        }
    }
}

