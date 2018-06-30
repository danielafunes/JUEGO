/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Duendes.DuendesFactory;
import Elfos.ElfosFactory;
import Orcos.OrcosFactory;

/**
 *
 * @author DanielaFunes
 */
public class FactoryProducer {
    
    public static AbstractFactory getFactory(String type){
        switch(type){
            case "Elfos":
                return new ElfosFactory();
            case "Orcos":
                return new OrcosFactory(); 
            case "Duendes":
                return new DuendesFactory();
        }
        return null;
    }
    
}
