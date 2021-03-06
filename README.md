# Project 0

**Description**
Leveraging Java 8, create an API with a multi-tier user system. You may choose the actual use case for your application as long as it meets all the requirements defined below. 

Possible examples include:
* Banking application
* Employee management system
* Collectable card game tracker
* Purchase ordering system

**Requirements**
* Technologies:
  *	Java 8
    * Javalin (HTTP handling)
    * JDBC (Database Connectivity)
    * JUnit (Unit Testing)
    * Logback (Logging)
  * PostgreSQL
  * Postman (HTTP messaging)
  * Gradle (Dependency Management)
*	Functionalities: 
  * Multi-tier Users - There must be at least three different types of user accounts each different functionality access. 
  * Basic mathematic manipulation of the fields of an entity object.
  * User login with passwords and logout.
    * Passwords may not be stored in their raw form in the database. They must be encrypted somehow. 
    * Stretch Goal: User registration. 
  * Validation for invalid inputs. 
  * Reasonable Logging of user interactions with the application. 

* Design:
  * Data persistence in a SQL database normalized to 3rd normal form. 
    * Must contain at least three entity tables. (Join tables do not count.) 
    * Must contain at least two relationships between tables. 
      * Stretch Goal: Create a Many to Many relationship between tables. 
    * Must contain at least one stored procedure. 
  * Three layered architecture of the Java application.
    * Reasonable test coverage of the service layer. 
      * Stretch Goal: Implement Test Driven Development.
  * DAO design pattern.
  * User interactions will be simulated by HTTP messaging via Postman. 
* Other:
  * A SQL Script file that can be used to create a clone of your database structures. 
  * Stretch Goal: A slide show presentation introducing your application before demoing it. 

**Example Bank Application Requirements**
*	Customers of the bank should be able to register with a username and password, and apply to open an account.
    * Stretch Goal: Customers should be able to apply for joint accounts
*	Once the account is open, customers should be able to withdraw, deposit, and transfer funds between accounts
    * All basic validation should be done, such as trying to input negative amounts, overdrawing from accounts etc.
*	Employees of the bank should be able to view all of their customers information. This includes:
    * Account information
    * Account balances
    * Personal information
*	Employees should be able to approve/deny open applications for accounts
*	Bank admins should be able to view and edit all accounts. This includes:
    * Approving/denying accounts
    * withdrawing, depositing, transferring from all accounts
    * canceling accounts


## Evaluation
The project will be evaluated out of 100 points split between two main catagories: 70 points for the functionality and design of your project and 30 points for the presentation of your project during the project showcase. The evaluation will be further subdivided as follows: 

**Project Score**(70 pts):
* 15 pts: Ability to persist meaningful data in the database and then retrieve it and display it to the console.
* 10 pts: Ability for the application to logically address the use-case for which it was designed.  
* 10 pts: Ability to mathematically manipulate values stored in an entity object.
* 10 pts: Proper database schema achieving 3rd normal form. (E.g. Accounts have a proper relationship to their owning user.)
* 10 pts: Login, register, update and logout functionality for users.  
* 5 pts: Proper use of DAO design pattern.  
* 5 pts: Different user roles with different levels of access implemented correctly. 
* 5 pts: Reasonable test coverage of the service layer and proper logging. 

**Presentation Score**(25 pts):
* 15 pts: Clear, concise, logical and professional communication during the project presentation.
* 10 pts: Ability to communicate clear answers to fully address questions asked about the project. 

**Agile Score**(5 pts):
* 5 pts: Kanban board and daily standup notes utilized and completed.


## Frequently Asked Questions

1. When is the project due? 

    >A: The project will be due no earlier then Wednesday of Week 3. The exact due date will be set by QC as they schedule project 0 presentations. 

2. Can I have an extension? 
    >A: No. While you are encouraged to continue to work on your projects past the date of the project presentation for your own learning benefit, extensions can not be accommodated. If for some reason you can not be present at the time of project presentations you will need to schedule a time BEFORE the due date to present your project. 

3. Is there a code freeze? 
    >A: It is recommended that you institute your own code freeze at least a day before the project presentations. However, this is a recommendation only; it will not be enforced. NOTE: The code that will be evaluated by your trainer will be the code you last pushed to your repository BEFORE the time set for project presentations. Code submitted while presentations are on-going or after will not be evaluated. 

4. What happens if I break my project that was mostly working right before the due date? 
    >A: As you should have been regularly pushing code to your repository you should be able to roll back to previously working version. If you have not regularly pushed your code and do not have a working commit to return to you will need to present the state of your application in its current form. 

5. Who will be evaluating the project? 
    >A: Your trainer will be the one providing the full evaluation of your projects. However, the QC team will also be present at presentations to ask questions about your project and consult with your trainer. 

6. Are we allowed to collaborate with others on our projects? 
    >A: Collaboration is encouraged. Hopefully you will work together to solve the problems presented in this project. However, you should still be ultimately designing the project yourself. Straight copy/pasting of another person's code is considered plagiarism. NOTE: Code provided in demos by your trainer is not subject to plagiarism concerns. Feel free to copy/paste and edit such code as necessary to suit your projects. 

7. What is a passing score? 
    >A: 75% is the base expected passing score.

8. What are stretch goals?
  >A: Stretch goals are extensions to the project that if completed will grant bonus points. However, stretch goals will only be considered if all the required functionality (i.e. requirements that are not stretch goals) are completed. 

8. If I fail the project will I be released from training?  
    >A: The project is a major component of the determination process for continued participation in training. Failure to present the work you completed on the project will lead to a release. 

9. Are there really no extensions? 
    >A: There are not.

package com.projectzero.jw;

public class Main {

    public static void main(String[] args) {

    }
}
/* Not sure how to the packages work.  I thought I understood then I went to try to work with a package and got a little
 lost.  I also tried to add an external library and thought I got something wrong.
 So I decided to go back to some basics till I am able to ask some questions.  had an issue where I guess I created a new
 final project and put it into a different file folder.  I was unable to add, commit, and push the new files until I found
 where the base file was stored and moved the file now I can add, commit, and push the new project.  However, I am not sure
 if all of my classes are supposed to be attached to the README file instructions or if they are supposed to be separated.
 on that note I am note, sure if my classes are supposed to be one on top of another like my methods of if each class needs
  to be a different file for each class for readability a different file is better, but for access one "page" makes more
  sense.  Unable to add and commit this project file.  Noting that I have attempted to branch and added a package as well
as done some small editing in notepad.*/

package com.projectzero.card;

public class Card {

    private String cardName;

    private String commonCardSayings;

    private int cardAttack;

    private int cardDefense;

    private String cardType;

    private int energy;

    public Card(){

    }

    public static void cardName(){

        System.out.println("Card Father");

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
 the cards.  I added the method notes to remind me how to make the children work correctly
 Update I realized that I had my constructors as the body to a constructor I also realized
 in the child classes I had duplicated my constructors to both pass through and be the body
 */

/* I am not entirely sure exactly what the steps are to complete this, but I do know the less I add to Cards
less extra things I will need to do here.*/

package com.projectzero.card;

public class Food extends Card {

    public Food() {

        super();

    }

    public Food(String cardName, String cardType, String commonCardSayings,
                int cardAttack, int cardDefense, int energy) {

    }

    public static void cardName(){

        System.out.println("Food");

    }

    public static void commonCardSayings() {

        System.out.println("I am a food card as a food card I have effects that take place during a fight.");

    }

    public static void cardAttack() {

        System.out.println("As a food card I do not Attack!");

    }

    public static void cardDefence() {

        System.out.println("As a food card I have no Defence!");

    }

    public static void cardType() {

        System.out.println("I am the father of all Food cards.");

    }

    public static void energy() {

        System.out.println("As a Food card I do not consume energy however I might be able to add or drain energy.");

    }
    
}


package com.projectzero.card;

public class Animal extends Card {

    public Animal() {

        super();

    }

    public Animal(String cardName, String cardType, String commonCardSayings,
                  int cardAttack, int cardDefense, int energy){

    }

    public static void cardName(){

        System.out.print("Animal");

    }

    public static void commonCardSaying(){

        System.out.println("I am an Animal I do all the fighting my sayings will explain how to use me.");

    }

    public static void cardAttack() {

        System.out.println("I have an Attack ability represented as a number");

    }

    public static void cardDefence() {

        System.out.println("I have a Defence ability represented as a number");

    }

    public static void cardType() {

        System.out.println("I am the Father of all Animal cards");

    }

    public static void energy() {

        System.out.println("I consume energy during the fight.");
    }
}

// I moved everything to my README file as a test

package com.projectzero.card;

public class Land extends Card{

    public Land() {

        super();

    }

    public Land(String cardName, String commonCardSayings,int cardAttack, int cardDefense, String cardType, int energy) {

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

package com.projectzero.User;

public class User {

    private String passwordProtection;

    private String gameBoard;

    private int subtract;

    private int addition;

    private String cards;

    private String gameRules;

    public User() {

    }

    public static void passwordProtection() {

        System.out.println("My audience users will need to have logins passwords to view fights.");

    }

    public static void gameBoard(){

        System.out.println("My players will need a the game board to play their cards Mainly fighter or Animal cards.");

    }

    public static void subtract() {

        System.out.println("Each player plays a card and the attack numbers are subtracted from the defence numbers");

    }

    public static void addition() {

        System.out.println("Less often than subtract which will happen each play addition can happen depending on some cards");

    }

    public static void cards() {

        System.out.println("The cards are what the player use to make the fight take place.");

    }

    public static void gameRules() {

        System.out.println("The Game Master is in charge of enforcing the rules which are found in each common card sayings.");

    }

}

package com.projectzero.card;

public class Banana extends Food{

    public Banana(){

        super();

    }

    public Banana(String cardName, String cardType, String commonCardSayings,
                  int cardAttack, int cardDefense, int energy) {

    }

    public static void cardName(){

        System.out.println("Banana");
    }

    public static void commonCardSaying(){

        System.out.println("Bananas are will add 3 energy to all prime apes.  Banana's will poison carnivores minus 3 health.  Bananas will have no affect on any other Animal.");

    }

    public static void cardAttack(){

        System.out.println("I am a Banana I have no Attack.");

    }

    public static void cardDefense(){

        System.out.println("I am a Banana I have no defense.");
    }

    public static void cardType(){

        System.out.println("As a Banana I am a Food type Card.");

    }

    public static void energy(){

        System.out.println("I am a Banana I do not consume energy, How ever if I am consumed by a primate the primate gains 3 energy");

    }

}

/* I had set up some basic classes for that are child classes of Card Types and Card Types Food
    is a child class of cards I may need to rethink how I set these up because as of now that is way too
    in depth and after the JSON tutorial it would make more sense to "Scrap" this style and just create "cards"
    as shown in the avengers model. Update after looking at some of the code from Avengers I
    realized that I need to make some small additions to my code.*/

package com.projectzero.card;

public class Hay extends Food {

    public Hay() {

        super();

    }

    public Hay(String cardName, String cardType, String commonCardSayings,
               int cardAttack, int cardDefense, int energy){

    }

    public static void cardName(){

        System.out.println("Hay");

    }
    public static void commonCardSaying(){

        System.out.println("Hay will add 5 attack to all ridding Animals.  Hay will have no affect on any other Animal.");

    }

    public static void cardAttack(){

        System.out.println("I am Hay I have no Attack.");

    }

    public static void cardDefense(){

        System.out.println("I am Hay I have no defense.");
    }

    public static void cardType(){

        System.out.println("As Hay I am a Food type Card.");

    }

    public static void energy(){

        System.out.println("I am Hay I do not consume energy, How ever if I am consumed by a ridding Animal the ridding Animal will add 5 attack.");

    }

}

package com.projectzero.card;

public class Carcas extends Food{

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
package com.projectzero.card;

public class Corn extends Food{

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

package com.projectzero.card;

public class Desert extends Card {

    public Desert() {

        super();

    }

    public Desert(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int enegry){

    }

    public static void cardName(){

        System.out.println("I am the Desert.");

    }

    public static void commonCardSayings(){

        System.out.println("The Desert is hot and dry make sure you have enough water.");

    }"

    public static void cardAttack() {

        System.out.println("I am the Desert in the Land cards I have no Attack.");

    }

    public static void cardDefense() {

        System.out.println("I am the Desert in the Land card I have no Defense.");

    }

    public static void cardType(){

        System.out.println("I am a Land card known as the Desert.");

    }

    public static void energy(){

        System.out.println("I am the Desert I have no energy I also do not use energy.");

    }
    
}

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

    public static int cardAttack(){

        int Attack = 100;

    }

    public static int cardDefense() {

        int Defense = 100;

    }

    public static void cardType(){

        System.out.println("This Lion is an Animal card.");

    }

    public static int energy(){

        int energy = 10;

    }

}

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

package com.projectzero.card;

public class Turkey extends Animal {

    public Turkey() {
        
        super();
        
    }

    public Turkey(String cardName, String commonCardSayings, int cardAttack, int cardDefense, String cardType, int energy) {
      
    }
    
    public static void cardName(){
        
        System.out.println("This is the Turkey");
        
    }
    
    public static void commonCardSayings(){
        
        System.out.println("This is the majestic Turkey it will die fast hope you can deal with that.");
        
    }
    
    public static void cardAttack(){
        
        int Attack = 10;
        
    }
    
    public static void cardDefense(){
        
        int Defense = 10;
        
    }
    
    public static void cardType(){
        
        System.out.println("The Turkey is an Animal card.");
        
    }
    
    public static void energy(){
        
        int enery = 1;
        
    }
    
}

package com.projectzero.User;

public class GameMaster extends User{

    public GameMaster() {

        super();

    }

    public GameMaster(String passwordProtection, String gameBoard, int subtract, int addition, String cards, String gameRules){

    }

    public static void passwordProtection(){

        System.out.println("I am game master I do not have get paid to ensure the Rules are followed so I will need top login.");

    }

    public static void gameBoard(){

        System.out.println("The rules dictate that a game board have room for up to the types of player cards.  I must verify.");

    }

    public static void subtract(){

        System.out.println("attack - defense = card winner I do that math.");

    }

    public static void addition(){

        System.out.println("energy + card = card improved energy.");

    }

    public static void card(){

        System.out.println("I do not use this function I only observe for fair play");

    }

    public static void gameRules(){

        System.out.println("I know the rules forward and backwards I regulate that no player is cheating.");

    }

}

package com.projectzero.User;

public class Players extends User{

    public Players() {

        super();

    }

    public Players(String passwordProtection, String gameBoard, int subtract, int addition, String cards, String gameRules){

    }
    public static void passwordProtection(){

        System.out.println("I am a player I am what the whole game is built around protect my password to login.");

    }

    public static void gameBoard() {

        System.out.println("I need the board to be able to play my cards.");

    }

    public static void subtract() {

        System.out.println("I need to be able to keep track of the subtraction of my cards attack vs defense.");

    }

    public static void addition(){

        System.out.println("I need to be able to keep track if a card increases my energy how much more per turn I can do.");

    }

    public static void cards() {

        System.out.println("I have a deck of cards to use against my foe my plan is to win.");

    }

    public static void gameRules(){

        System.out.println("I must follow the game rule or there will be consequences.");

    }

}

package com.projectzero.User;

public class Audience extends User{

    public Audience() {

        super();

    }

    public Audience(String passwordProtection, String gameBoard, int subtract, int addition, String cards, String gameRules){

    }

    public static void passwordProtection(){

        System.out.println("I paid to get onto this website I would like my payment info password secure please.");

    }

    public static void gameBoard(){

        System.out.println("I can see the game board to be able support my favorite player.");

    }

    public static void subtract(){

        System.out.print("I don't need to subtract I just want to watch the game securely.");

    }

    public static void addition(){

        System.out.println("I don't need to add I just want to watch the game securely.");

    }

    public static void cards(){

        System.out.println("Yes I have my own set of cards.  No I am not here to play I am here to watch.");

    }

    public static void gameRules(){

        System.out.println("Yes I know the rules because I play for fun with my friends and knowing the rules helps me to enjoy watching the game even more.");

    }

}
