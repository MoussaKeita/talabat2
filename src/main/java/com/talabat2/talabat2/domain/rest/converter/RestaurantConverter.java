/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest.converter;

import com.talabat2.talabat2.domain.bean.Restaurant;
import com.talabat2.talabat2.domain.rest.vo.RestaurantVo;

/**
 *
 * @author Keita Moussa
 */
public class RestaurantConverter extends AbstractConverter<Restaurant, RestaurantVo> {

    @Override
    public Restaurant toItem(RestaurantVo vo) {
        if(vo==null){
            return null;
        }
        else{
            Restaurant item = new  Restaurant();
            item.setId(vo.getId());
            item.setNom(vo.getNom());
            item.setReference(vo.getReference());
            item.setTel(vo.getTel());
            item.setPlatRestaus(new PlatRestauConverter().toItem(vo.getPlatRestauVo()));
            return item;
        }
    }

    @Override
    public RestaurantVo toVO(Restaurant item) {
        if(item==null){
            return null;
        }
        else{
            RestaurantVo vo = new RestaurantVo();
            vo.setId(item.getId());
            vo.setNom(item.getNom());
            vo.setAdresse(item.getAdresse());
            vo.setReference(item.getReference());
            vo.setTel(item.getTel());
            vo.setPlatRestauVo(new PlatRestauConverter().toVo(item.getPlatRestaus()));
            return vo;
        }
    }  
}
