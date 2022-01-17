package com.projectzero.card;

import com.projectzero.jw.Food;

public class Corn extends Food {

    public Corn(){

        super();

    }

    public Corn (String cardName, String cardType, String commonCardSayings,
                 int cardAttack, int cardDefense, int energy) {

    }

    public static void cardName(){

        System.out.println("Corn");

    }

    public static void commonCardSaying(){

        System.out.println("I am Corn flightless birds that consume me will gain plus 4 defense.  No effect to any other Animal.");

    }

    public static void cardAttack(){

        System.out.println("I am Corn I have no Attack.");

    }

    public static void cardDefense(){

        System.out.println("I am Corn I have no defense.");
    }

    public static void cardType(){

        System.out.println("As Corn I am a Food type Card.");

    }

    public static void energy(){

        System.out.println("I am Corn I do not consume energy.");

    }

}
