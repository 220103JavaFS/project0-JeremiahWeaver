package com.pzfc.services;

import com.pzfc.models.Rookie;
import com.pzfc.repo.RookieDAOImpl;

import java.util.List;

public class RookieServices {

    private final RookieDAOImpl rDAO;

    public RookieServices(){ rDAO = new RookieDAOImpl();}


        public List<Rookie> findAllRookies() {return rDAO.findAllRookies();}

        public List<Rookie> findRookieById(int id) {return rDAO.findRookieByID(id);}

        public boolean insertRookie(Rookie rookie) {return rDAO.insertRookie(rookie);}



}
