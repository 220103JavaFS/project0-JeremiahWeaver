package com.pzfc.services;

import com.pzfc.models.RookieFinder;
import com.pzfc.repo.RookieFinderDAO;

import java.util.List;

public class RookieFinderServices {

    private RookieFinderDAO rookieFinderDAO = new RookieFinderDAO() {
        @Override
        public List<RookieFinder> findAll() { return null; }
    };
}
