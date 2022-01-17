package com.projectzero.card;

public class Land extends Card{

    public Land() {

        super();

    }

    public Land(String cardName, String cardType, String commonCardSayings,
                int cardAttack, int cardDefense, int energy) {

    }

    public static void cardName(){

        System.out.println("Land");

    }

    public static void commonCardSayings(){

        System.out.println("I am a Land card I determine where each fight takes place and if that effects any animals");

    }

    public static void cardAttack(){

        System.out.println("I am a Land card I do not have any attack values");

    }

    public static void cardDefence() {

        System.out.println("I am a Land card I do not have any defence values.");

    }

    public static void cardType() {

        System.out.println("I am father of all Land type cards");

    }

    public static void energy() {

        System.out.println("I am a Land card I do not have energy and i do not affect energy.");

    }

}
