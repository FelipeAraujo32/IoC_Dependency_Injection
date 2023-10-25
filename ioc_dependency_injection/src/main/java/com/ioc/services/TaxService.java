package com.ioc.services;

import com.ioc.Interface.InterfaceTax;

public class TaxService implements InterfaceTax {
    

    public double tax(double value){
        return value * 0.1;
    }
}
