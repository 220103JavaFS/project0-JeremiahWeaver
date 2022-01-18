package com.pzfc.services;

import com.pzfc.models.Success;
import com.pzfc.repo.SuccessDAO;

import java.util.List;

public class SuccessServices {

    private SuccessDAO sDAO = new SuccessDAO() {
        @Override
        public List<Success> findAll() { return null; }
    };
}
