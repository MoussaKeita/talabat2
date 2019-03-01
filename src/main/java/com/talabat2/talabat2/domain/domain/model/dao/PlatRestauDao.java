/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.domain.model.dao;


import com.talabat2.talabat2.domain.bean.PlatRestau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Keita Moussa
 */
@Repository
public interface PlatRestauDao extends JpaRepository<PlatRestau , Long>{
    public PlatRestau findByReference(String reference);
}
