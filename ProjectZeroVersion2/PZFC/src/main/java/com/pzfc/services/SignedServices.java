package com.pzfc.services;

import com.pzfc.models.Signed;
import com.pzfc.repo.SignedDAO;

import java.util.List;

public class SignedServices {

    private SignedDAO signedDAO = new SignedDAO() {
        @Override
        public List<Signed> findAll() { return null; }
    };
}
