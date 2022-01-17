package com.projectzero.User;

public class GameMaster extends User{

    public GameMaster() {

        super();

    }

    public GameMaster(String passwordProtection, String gameBoard, int subtract, int addition, String cards, String gameRules){

    }

    public static void passwordProtection(){

        System.out.println("I am game master I do not have get paid to ensure the Rules are followed so I will need top login.");

    }

    public static void gameBoard(){

        System.out.println("The rules dictate that a game board have room for up to the types of player cards.  I must verify.");

    }

    public static void subtract(){

        System.out.println("attack - defense = card winner I do that math.");

    }

    public static void addition(){

        System.out.println("energy + card = card improved energy.");

    }

    public static void card(){

        System.out.println("I do not use this function I only observe for fair play");

    }

    public static void gameRules(){

        System.out.println("I know the rules forward and backwards I regulate that no player is cheating.");

    }

}
