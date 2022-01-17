package com.projectzero.card;

public class Carcas extends Food {

    public Carcas(){

        super();

    }

    public Carcas(String cardName, String cardType, String commonCardSayings,
                  int cardAttack, int cardDefense, int energy) {

    }

    public static void cardName(){

        System.out.println("Carcas");

    }

    public static void commonCardSaying(){

        System.out.println("I am a Carcas only carnivores can eat me.  If a non carnivore eats this they die.  If a carnivore does eat this they will gain 30 defense and plus 30 attack. However if the turn on which a carnivore does eat a carcas the carnivore will be too tired to to do anything during this turn including defend.");

    }

    public static void cardAttack(){

        System.out.println("I am a carcas I have no Attack.");

    }

    public static void cardDefense(){

        System.out.println("I am a carcas I have no defense.");
    }

    public static void cardType(){

        System.out.println("As a carcas I am a Food type Card.");

    }

    public static void energy(){

        System.out.println("I am a carcas I do not consume energy, However if a carnivore does eat me it looses it's energy for that turn.");

    }

}
