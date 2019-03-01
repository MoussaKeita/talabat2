/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.PlatRestau;
import com.talabat2.talabat2.domain.rest.vo.PlatRestauVo;

/**
 *
 * @author Keita Moussa
 */
public class PlatRestauConverter extends AbstractConverter<PlatRestau, PlatRestauVo>{

    @Override
    public PlatRestau toItem(PlatRestauVo vo) {
       if(vo==null){
           return null;
       }
       else{
           PlatRestau item = new PlatRestau();
           item.setId(vo.getId());
           item.setNom(vo.getNom());
           item.setReference(vo.getReference());
           item.setRestaurant(new RestaurantConverter().toItem(vo.getRestaurantVo()));
           return item;
       }
    }

    @Override
    public PlatRestauVo toVO(PlatRestau item) {
        if(item==null){
            return null;
        }
        else{
            PlatRestauVo vo = new PlatRestauVo();
            
            vo.setId(item.getId());
            vo.setNom(item.getNom());
            vo.setReference(item.getReference());
            vo.setRestaurantVo(new RestaurantConverter().toVO(item.getRestaurant()));
            return vo;
        }
    }
    
}
