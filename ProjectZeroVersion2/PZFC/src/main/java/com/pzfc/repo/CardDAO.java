package com.pzfc.repo;

import com.pzfc.models.Card;

import java.util.List;

public interface CardDAO {

    List<Card> findall();

    Card findPlayer(int id);

    boolean addPlayer(Card card);

    boolean updatePlayer(Card card);

    boolean deletePlayer(int id);

}
