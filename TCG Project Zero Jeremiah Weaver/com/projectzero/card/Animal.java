package com.projectzero.card;

public class Animal extends Card {

    public Animal() {

        super();

    }

    public Animal(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int energy){

    }

    public static void cardName(){

        System.out.print("Animal");

    }

    public static void commonCardSaying(){

        System.out.println("I am an Animal I do all the fighting my sayings will explain how to use me.");

    }

    public static void cardAttack() {

        System.out.println("I have an Attack ability represented as a number");

    }

    public static void cardDefence() {

        System.out.println("I have a Defence ability represented as a number");

    }

    public static void cardType() {

        System.out.println("I am the Father of all Animal cards");

    }

    public static void energy() {

        System.out.println("I consume energy during the fight.");
    }
}
