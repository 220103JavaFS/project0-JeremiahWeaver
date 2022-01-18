package com.pzfc.services;

import com.pzfc.models.Collections;
import com.pzfc.repo.CollectionsDAO;

import java.util.List;

public class CollectionsServices {

    private CollectionsDAO collectionsDAO = new CollectionsDAO() {
        @Override
        public List<Collections> findAll() { return null; }
    };
}
