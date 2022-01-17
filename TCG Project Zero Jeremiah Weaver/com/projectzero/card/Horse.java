package com.projectzero.card;

public class Horse extends Animal {

    public Horse() {

        super();

    }

    public Horse(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int energy) {

    }

    public static void cardName(){

        System.out.println("This is a Horse card");

    }

    public static void commonCardSayings(){

        System.out.println("A wild Horse stands free, but it can't be tamed or ridden it is only a card.");

    }

    public static void cardAttack() {

        int Attack = 15;

    }

    public static void cardDefense() {

        int Defense = 85;

    }

    public static void cardType(){

        System.out.println("A Horse is an Animal card.");

    }

    public static void energy(){

        int energy = 2;

    }

}
