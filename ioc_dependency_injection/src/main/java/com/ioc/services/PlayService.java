package com.ioc.services;

import com.ioc.Interface.InterfaceDeliver;
import com.ioc.Interface.InterfaceTax;

public class PlayService {

    private InterfaceTax taxService;
    private InterfaceDeliver deliverService;

    public PlayService(InterfaceTax taxService, InterfaceDeliver deliverService){
        this.taxService = taxService;
        this.deliverService = deliverService;
    }

    
    public double finalPrice(double price, String region){ 
      return price + deliverService.region(region) + taxService.tax(price);
    }
}
