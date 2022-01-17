package com.projectzero.User;

public class Audience extends User{

    public Audience() {

        super();

    }

    public Audience(String passwordProtection, String gameBoard, int subtract, int addition, String cards, String gameRules){

    }

    public static void passwordProtection(){

        System.out.println("I paid to get onto this website I would like my payment info password secure please.");

    }

    public static void gameBoard(){

        System.out.println("I can see the game board to be able support my favorite player.");

    }

    public static void subtract(){

        System.out.print("I don't need to subtract I just want to watch the game securely.");

    }

    public static void addition(){

        System.out.println("I don't need to add I just want to watch the game securely.");

    }

    public static void cards(){

        System.out.println("Yes I have my own set of cards.  No I am not here to play I am here to watch.");

    }

    public static void gameRules(){

        System.out.println("Yes I know the rules because I play for fun with my friends and knowing the rules helps me to enjoy watching the game even more.");

    }

}
