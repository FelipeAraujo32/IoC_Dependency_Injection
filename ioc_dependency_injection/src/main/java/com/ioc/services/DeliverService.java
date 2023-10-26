package com.ioc.services;

import com.ioc.Interface.InterfaceDeliver;

public class DeliverService implements InterfaceDeliver {
    
    //Definindo regra do deliver uilizando IF-ELSE
    @Override
    public double region(String region){
            if("Norte".equalsIgnoreCase(region)){
                return 50.0;
            }
            else if("Nordeste".equalsIgnoreCase(region)){
                return 40.0;
            }
            else if("Centro-Oeste".equalsIgnoreCase(region)){
                return 30.0;
            }
            else if("Sudeste".equalsIgnoreCase(region)){
                return 20.0;
            }
            else if("Sul".equalsIgnoreCase(region)){
                return 10.0;
            }   
            return 0; 
        }
}

    

    