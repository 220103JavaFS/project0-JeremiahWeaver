package com.projectzero.card;

public class Mountains extends Land{

    public Mountains() {

        super();
    }

    public Mountains(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int enegry) {

    }

    public static void cardName() {

        System.out.println("I am called Mountains.");

    }

    public static void commonCardSayings() {

        System.out.println("I am the Mountains and I am calling be daring to face battle here.");

    }

    public static void cardAttack(){

        System.out.println("I am the Mountains I do not attack.");

    }

    public static void cardDefense(){

        System.out.println("I am the Mountains I do not defend.");

    }

    public static void cardType(){

        System.out.println("I am the Mountains as such I am a Land card");

    }

    public static void energy() {

        System.out.println("I am the Mountains I have no need for energy.");

    }

}
