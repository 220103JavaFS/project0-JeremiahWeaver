public class Card {

    public Card() {
    }

    public static void commonCardSayings() { // This method needs to be placed in all it's children.

        System.out.println("I am the father of all Cards all Food, all Animal, and all Land cards");
    }

    public static void cardAttack () {   // This method needs to be placed in all it's children.

        System.out.println("I am the attack points for cards that attack.");

    }

    public static void cardDefence() {  // This method needs to be placed in all it's children.

        System.out.println("I am the Defence");
    }

    public static void cardType() {  // This method needs to be placed in all it's children.

        System.out.println("My card type is father of all card types all Food, All Animal, and all Land card types");

    }

    public static void energy() {  // This method needs to be placed in all it's children.

        System.out.println("I am in charge of how each card handles energy");

    }

}
/* need to figure out why println won't work here.  possible that it is outside the main method.
 possible that it is outside the correct package, then again I should be in the default package.
 Update to why println was not working I had println outside any kind of method once I put the println in a method
 the problem was fixed. I will need to remember what to do with all these methods, but I also know I need them to make
 the cards.  I added the method notes to remind me how to make the children work correctly*/