/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.talabat2.talabat2.domain.rest;
import com.talabat2.talabat2.domain.bean.PlatRestau;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.talabat2.talabat2.domain.domain.model.service.PlatRestauService;
import com.talabat2.talabat2.domain.rest.converter.PlatRestauConverter;
import com.talabat2.talabat2.domain.rest.vo.PlatRestauVo;

/**
 *
 * @author Keita Moussa
 */
@RestController()
@RequestMapping("talabat2/plats")
public class PlatRestauRest {
    @Autowired
    private PlatRestauService platRestauService;
    
@GetMapping("/reference/{reference}")
    public PlatRestauVo findByReference(@PathVariable String reference) {
        return new PlatRestauConverter().toVO(platRestauService.findByReference(reference));
    }

    public PlatRestauService getPlatRestauService() {
        return platRestauService;
    }

    public void setPlatRestauService(PlatRestauService platRestauService) {
        this.platRestauService = platRestauService;
    }
    
}
