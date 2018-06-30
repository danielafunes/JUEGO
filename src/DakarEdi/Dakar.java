/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DakarEdi;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import Jugador.Jugador;
import Elfos.Elfos;
/**
 *
 * @author DanielaFunes
 */
public class Dakar implements Elfos {
    
    public int vida = 500;
    public int costo = 1000;
    int daño  = 1000;
    int cantidad =1000;
    boolean estado=false;
    public Jugador jugador;

    public Dakar(Jugador jugador) {
        this.jugador = jugador;
    }

    public Dakar() {
       
    }
    

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    @Override
    public void construir(Jugador jugador){
        int total, total1;
        
        AbstractFactory elfos = FactoryProducer.getFactory("Elfos");
        Elfos el = elfos.getElfos("Dakar");
        Dakar ac = new Dakar(jugador);
        
        
        if(ac.getJugador().getCm().getRecurso1() >= costo 
           && ac.getJugador().getCm().getRecurso2() >= costo){
            total = ac.getJugador().getCm().getRecurso1()-costo;  
            ac.getJugador().getCm().setRecurso1(total);
            total1 = ac.getJugador().getCm().getRecurso2()-costo;
            ac.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            ac.getJugador().getEd1().add(el);
            
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }
   
  @Override
    public int recoger(Jugador jugador){
        return cantidad;
    }

    @Override
    public int getAtacar(){
        return daño;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        return estado;
    }
    
    @Override
    public boolean estado(){
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
        
    }
}