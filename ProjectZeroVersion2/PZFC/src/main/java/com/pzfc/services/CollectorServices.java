package com.pzfc.services;

import com.pzfc.models.Collector;
import com.pzfc.repo.CollectorDAO;

import java.util.List;

public class CollectorServices {

    private CollectorDAO collectorDAO = new CollectorDAO() {
        @Override
        public List<Collector> findAll() { return null; }
    };
}
