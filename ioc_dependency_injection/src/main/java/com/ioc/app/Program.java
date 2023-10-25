package com.ioc.app;

import com.ioc.Interface.InterfaceDeliver;
import com.ioc.Interface.InterfaceTax;
import com.ioc.services.DeliverService;
import com.ioc.services.PlayService;
import com.ioc.services.TaxService;

public class Program {
    public static void main(String[] args) {
        
        InterfaceTax taxService = new TaxService();
        InterfaceDeliver deliverService = new DeliverService();

        PlayService playService = new PlayService(taxService, deliverService);
        
        System.out.println("RESULTADO = " + playService.finalPrice(100.0, "Centro-Oeste"));
    }
}
