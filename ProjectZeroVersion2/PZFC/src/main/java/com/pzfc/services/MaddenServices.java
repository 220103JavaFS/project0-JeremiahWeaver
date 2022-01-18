package com.pzfc.services;

import com.pzfc.models.Madden;
import com.pzfc.repo.MaddenDAO;

import java.util.List;

public class MaddenServices {

    private MaddenDAO mDAO = new MaddenDAO() {
        @Override
        public List<Madden> findAll() {
            return null;
        }
    };

}
