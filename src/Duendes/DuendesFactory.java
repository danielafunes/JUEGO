/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Duendes;

import AbstracFactory.AbstractFactory;
import Elfos.Elfos;
import Orcos.Orcos;
import TabernaEdi.Taberna;
import VendettaVehiculo.Vendetta;

/**
 *
 * @author DanielaFunes
 */



public class DuendesFactory implements AbstractFactory{
    
    @Override
    public Orcos getOrcos(String type){
        return null;
    }
    
   

    @Override
    public Elfos getElfos(String type) {
         return null;
    }
    
    @Override
    public Duendes getDuendes(String type){
        switch(type){
            case "Taberna":
                return (Duendes) new Taberna();
            case "Catapulta":
                return (Duendes) new Vendetta();
            
        }
        return null;
    }
    
   

}
    

