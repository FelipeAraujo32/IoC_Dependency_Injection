package com.ioc.services;

import com.ioc.Interface.InterfaceTax;

public class TaxService implements InterfaceTax {
    
    //Definindo regra do tax uilizando Switch
    public double tax(double value, String region){
        switch(region){
            case "Norte": return value * 0.5;
            case "Nordeste": return value * 0.4;
            case "Centro-Oeste": return value * 0.3;
            case "Sudeste": return value * 0.2;
            case "Sul": return value * 0.1;
        }
        return 0;
    }
}
