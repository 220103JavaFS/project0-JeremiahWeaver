package com.pzfc.services;

import com.pzfc.models.Rookie;
import com.pzfc.repo.RookieDAO;

import java.util.List;

public class RookieServices {

    private RookieDAO rDAO = new RookieDAO() {
        @Override
        public List<Rookie> findAll() { return null; }
    };

}
