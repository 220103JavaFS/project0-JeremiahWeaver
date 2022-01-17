package com.projectzero.card;

public class Hay extends Food {

    public Hay() {

        super();

    }

    public Hay(String cardName, String cardType, String commonCardSayings,
               int cardAttack, int cardDefense, int energy){

    }

    public static void cardName(){

        System.out.println("Hay");

    }
    public static void commonCardSayings(){

        System.out.println("Hay will add 5 attack to all ridding Animals.  Hay will have no affect on any other Animal.");

    }

    public static void cardAttack(){

        System.out.println("I am Hay I have no Attack.");

    }

    public static void cardDefense(){

        System.out.println("I am Hay I have no defense.");
    }

    public static void cardType(){

        System.out.println("As Hay I am a Food type Card.");

    }

    public static void energy(){

        System.out.println("I am Hay I do not consume energy, How ever if I am consumed by a ridding Animal the ridding Animal will add 5 attack.");

    }

}
