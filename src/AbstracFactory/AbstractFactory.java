/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstracFactory;

import Duendes.Duendes;
import Elfos.Elfos;
import Orcos.Orcos;



/**
 *
 * @author DanielaFunes
 */
public interface AbstractFactory {
    Elfos getElfos(String type);
    Orcos getOrcos(String type);
    Duendes getDuendes(String type);


}
