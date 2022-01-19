package com.pzfc.repo;

import com.pzfc.models.Rookie;

import java.util.List;

public interface RookieDAO {

    List<Rookie> findAllRookies();

    List<Rookie> findRookieByID(int id);

    boolean insertRookie(Rookie rook);


}

