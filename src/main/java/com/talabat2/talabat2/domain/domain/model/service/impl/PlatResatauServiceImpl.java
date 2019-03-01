/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.domain.model.service.impl;

import com.talabat2.talabat2.domain.bean.PlatRestau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.talabat2.talabat2.domain.domain.model.dao.PlatRestauDao;
import com.talabat2.talabat2.domain.domain.model.service.PlatRestauService;

/**
 *
 * @author Keita Moussa
 */
@Service
public class PlatResatauServiceImpl implements PlatRestauService{

    @Autowired
    private PlatRestauDao platRestauDao;
    
    
    @Override
    public PlatRestau findByReference(String reference) {
      return platRestauDao.findByReference(reference);
    }

    public PlatRestauDao getPlatRestauDao() {
        return platRestauDao;
    }

    public void setPlatRestauDao(PlatRestauDao platRestauDao) {
        this.platRestauDao = platRestauDao;
    }
    
    
}
