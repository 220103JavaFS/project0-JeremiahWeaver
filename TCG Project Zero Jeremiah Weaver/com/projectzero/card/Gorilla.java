package com.projectzero.card;

public class Gorilla extends Animal{

    public Gorilla() {

        super();

    }

    public Gorilla(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int energy) {

    }

    public static void cardName(){

        System.out.println("This Gorilla beats it's chest!");

    }

    public static void commonCardSayings(){

        System.out.println("A large Gorilla sits over looking a green field don't be too loud that might spook it.");

    }

    public static void cardAttack() {

        int Attack = 100;

    }

    public static void cardDefense(){

        int Defense = 25;

    }

    public static void cardType(){

        System.out.println("A Gorilla is an Animal card.");

    }

    public static void energy(){

        int energy = 3;

    }

}
