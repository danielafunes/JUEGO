/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elfos;

import AbstracFactory.AbstractFactory;
import CatapultaVehiculo.Catapulta;
import DakarEdi.Dakar;
import Orcos.Orcos;
import Duendes.Duendes;


/**
 *
 * @author DanielaFunes
 */
public class ElfosFactory implements AbstractFactory{
   
    @Override
    public Elfos getElfos(String type){
        switch(type){
            case "Dakar":
                return  new Dakar();
            case "Catapulta":
                return  new Catapulta();
            
        }
        return null;
    }
    
    @Override
    public Orcos getOrcos(String type){
        return null;
    }
    
    @Override
    public Duendes getDuendes(String type){
        return null;
    }

}