package com.projectzero.gameboard;

import com.projectzero.card.Gorilla;
import com.projectzero.card.Horse;
import com.projectzero.card.Lion;
import com.projectzero.card.Turkey;

public class GameBoard {

    GameBoard Board = new GameBoard();

    public GameBoard(){

    }

    public static int gorillaAttack(){

        Gorilla.cardAttack();

        return gorillaAttack();

    }

    public static int horseAttack(){

        Horse.cardAttack();

        return horseAttack();
    }

    public static int lionAttack(){

        Lion.cardAttack();

        return lionAttack();
    }

    public static int turkeyAttack(){

        Turkey.cardAttack();

        return turkeyAttack();
    }

    public static int gorillaDefense(){

        Gorilla.cardDefense();

        return gorillaDefense();

    }

    public static int horseDefense() {

        Horse.cardDefense();

        return horseDefense();
    }

    public static int lionDefense(){

        Lion.cardDefense();

        return lionDefense();

    }

    public static int turkeyDefense(){

        Turkey.cardDefense();

        return turkeyDefense();

    }
}
