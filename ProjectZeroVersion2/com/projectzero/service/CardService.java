package com.projectzero.service;

public class CardService {

    private CardDAO cDAO = new CardDAOImpl();

    public Card callCard(int id) {return cardDAO.findCard(id);}
}
