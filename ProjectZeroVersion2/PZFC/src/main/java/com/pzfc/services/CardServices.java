package com.pzfc.services;

import com.pzfc.models.Card;
import com.pzfc.repo.CardDAO;

import java.util.List;

public class CardServices {

    private CardDAO cDAO = new CardDAO() {
        @Override
        public List<Card> findAll() {
            return null;
        }

        @Override
        public Card findPlayer(int id) {
            return null;
        }

        @Override
        public boolean addPlayer(Card card) {
            return false;
        }

        @Override
        public boolean updatePlayer(Card card) {
            return false;
        }

        @Override
        public boolean deletePlayer(int id) {return false;}

    };

}
