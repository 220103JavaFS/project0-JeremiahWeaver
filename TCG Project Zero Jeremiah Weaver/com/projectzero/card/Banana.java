package com.projectzero.card;

public class Banana extends Food{

    public Banana(){

        super();

    }

    public Banana(String cardName, String cardType, String commonCardSayings,
                  int cardAttack, int cardDefense, int energy) {

    }

    public static void cardName(){

        System.out.println("Banana");
    }

    public static void commonCardSaying(){

        System.out.println("Bananas are will add 3 energy to all prime apes.  Banana's will poison carnivores minus 3 health.  Bananas will have no affect on any other Animal.");

    }

    public static void cardAttack(){

        System.out.println("I am a Banana I have no Attack.");

    }

    public static void cardDefense(){

        System.out.println("I am a Banana I have no defense.");
    }

    public static void cardType(){

        System.out.println("As a Banana I am a Food type Card.");

    }

    public static void energy(){

        System.out.println("I am a Banana I do not consume energy, How ever if I am consumed by a primate the primate gains 3 energy");

    }

}

/* I had set up some basic classes for that are child classes of Card Types and Card Types Food
    is a child class of cards I may need to rethink how I set these up because as of now that is way too
    in depth and after the JSON tutorial it would make more sense to "Scrap" this style and just create "cards"
    as shown in the avengers model. Update after looking at some of the code from Avengers I
    realized that I need to make some small additions to my code.*/
