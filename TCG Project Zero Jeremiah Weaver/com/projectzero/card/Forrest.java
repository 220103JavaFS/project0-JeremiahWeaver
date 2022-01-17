package com.projectzero.card;

public class Forrest extends Land{

    public Forrest() {

        super();

    }

    public Forrest(String cardName, String cardType, String commonCardSayings,
                   int cardAttack, int cardDefense, int energy) {

    }

    public static void cardName(){

        System.out.println("Forrest");

    }

    public static void commonCardSaying(){

        System.out.println("In the Forrest Animals can hide in tree or behind trees.");

    }

    public static void cardAttack(){

        System.out.println("I am a Forrest I do not attack.");

    }

    public static void cardDefence(){

        System.out.println("I am a Forrest I do not have defence.");

    }

    public static void cardType(){

        System.out.println("I as a Forrest I am a Land Type Card");

    }

    public static void energy(){

        System.out.println("I am a Forrest I do not have energy.");
    }
}
/* I noticed that in my constructors I might be having an issue.  I think it is
as simple as the methods I am using have the same name as my supers and might just
 need to be this.energy etc. will check after reviewing the video note from today.
 */
