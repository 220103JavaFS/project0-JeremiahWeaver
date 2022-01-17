package com.projectzero.User;

public class Players extends User{

    public Players() {

        super();

    }

    public Players(String passwordProtection, String gameBoard, int subtract, int addition, String cards, String gameRules){

    }
    public static void passwordProtection(){

        System.out.println("I am a player I am what the whole game is built around protect my password to login.");

    }

    public static void gameBoard() {

        System.out.println("I need the board to be able to play my cards.");

    }

    public static void subtract() {

        System.out.println("I need to be able to keep track of the subtraction of my cards attack vs defense.");

    }

    public static void addition(){

        System.out.println("I need to be able to keep track if a card increases my energy how much more per turn I can do.");

    }

    public static void cards() {

        System.out.println("I have a deck of cards to use against my foe my plan is to win.");

    }

    public static void gameRules(){

        System.out.println("I must follow the game rule or there will be consequences.");

    }

}
