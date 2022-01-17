package com.projectzero.card;

public class Lion extends Animal {

    public Lion() {

        super();
    }

    public Lion(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int energy) {

    }

    public static void cardName(){

        System.out.println("Card Roars! I am a Lion");

    }

    public static void commonCardSayings() {

        System.out.println("The great Lion can be found in many different environments. A Lion can only eat meat.");

    }

    public static void cardAttack(){

        int Attack = 100;

    }

    public static void cardDefense() {

        int Defense = 100;

    }

    public static void cardType(){

        System.out.println("This Lion is an Animal card.");

    }

    public static void energy(){

        int energy = 10;

    }

}
