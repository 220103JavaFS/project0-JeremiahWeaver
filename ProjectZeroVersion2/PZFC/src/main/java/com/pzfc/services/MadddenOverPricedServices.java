package com.pzfc.services;

import com.pzfc.models.MaddenOverPriced;
import com.pzfc.repo.MaddenOverPricedDAO;

import java.util.List;

public class MadddenOverPricedServices {

    private MaddenOverPricedDAO maddenOverPricedDAO = new MaddenOverPricedDAO() {
        @Override
        public List<MaddenOverPriced> findAll() { return null; }
    };
}
