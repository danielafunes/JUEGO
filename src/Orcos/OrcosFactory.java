/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orcos;

import AbstracFactory.AbstractFactory;
import Duendes.Duendes;
import Elfos.Elfos;
import CobaltEdi.Cobalt;
import TanqueVehiculo.Tanque;




/**
 *
 * @author DanielaFunes
 */
public class OrcosFactory implements AbstractFactory{
    
    @Override
    public Orcos getOrcos(String type){
        
    switch(type){
            case "Cobalt":
                return  new Cobalt();
            case "Tanque":
                return  new Tanque();
           
            
        }
        return null;
    }
    
   

    @Override
    public Elfos getElfos(String type) {
         return null;
    }
    
    @Override
    public Duendes getDuendes(String type){
       
        return null;
    }
    
   

}
    

