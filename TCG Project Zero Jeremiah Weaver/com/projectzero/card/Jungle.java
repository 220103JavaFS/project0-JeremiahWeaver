package com.projectzero.card;

public class Jungle extends Land{

    public Jungle() {

        super();

    }

    public Jungle(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int energy) {

    }

    public static void cardName(){

        System.out.println("I am the Jungle");

    }

    public static void commonCardSayings() {

        System.out.println("The Jungle is dense it has large amounts of shade but in that shade many things hide.");

    }

    public static void cardAttack(){

        System.out.println("The Jungle does not attack");

    }

    public static void cardDefense(){

        System.out.println("The Jungle does not defend.");

    }

    public static void cardType(){

        System.out.println("The Jungle is a Land");

    }

    public static void energy(){

        System.out.println("The Jungle does not deal with energy.");

    }

}
