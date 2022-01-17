package com.projectzero.User;

public class User {

    private String passwordProtection;

    private String gameBoard;

    private int subtract;

    private int addition;

    private String cards;

    private String gameRules;

    public User() {

    }

    public static void passwordProtection() {

        System.out.println("My audience users will need to have logins passwords to view fights.");

    }

    public static void gameBoard(){

        System.out.println("My players will need a the game board to play their cards Mainly fighter or Animal cards.");

    }

    public static void subtract() {

        System.out.println("Each player plays a card and the attack numbers are subtracted from the defence numbers");

    }

    public static void addition() {

        System.out.println("Less often than subtract which will happen each play addition can happen depending on some cards");

    }

    public static void cards() {

        System.out.println("The cards are what the player use to make the fight take place.");

    }

    public static void gameRules() {

        System.out.println("The Game Master is in charge of enforcing the rules which are found in each common card sayings.");

    }

}
