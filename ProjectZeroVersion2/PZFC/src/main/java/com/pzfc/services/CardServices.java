package com.pzfc.services;

import com.pzfc.models.Card;
import com.pzfc.repo.CardDAO;

import java.util.List;

public class CardServices {

    private CardDAO cDAO = new CardDAO() {
        @Override
        public List<Card> findAll() { return null;}

    };
}
