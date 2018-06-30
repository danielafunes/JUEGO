/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaltEdi;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import DakarEdi.Dakar;
import Elfos.Elfos;
import Jugador.Jugador;
import Orcos.Orcos;


/**
 *
 * @author DanielaFunes
 */
public class Cobalt implements Orcos {
    public int vida = 200;
    public int costo = 1500;
    int daño;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;
    
    public Cobalt() {
    
    }
    
    public Cobalt(Jugador jugador) {
        this.jugador = jugador;
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
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
    @Override
    public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory orcos = FactoryProducer.getFactory("Orcos");
        Orcos bon = orcos.getOrcos("Orcos");
        Cobalt b= new Cobalt(jugador);
        
        //AbstractFactory play = FactoryProducer.getFactory("");
        
        if(b.getJugador().getCm2().getRecurso3() >= costo 
           && b.getJugador().getCm2().getRecurso2() >= costo){
            total = b.getJugador().getCm2().getRecurso3()-costo;  
            b.getJugador().getCm2().setRecurso3(total);
            total1 = b.getJugador().getCm2().getRecurso2()-costo;
            b.getJugador().getCm2().setRecurso2(total1);
            System.out.println("Construccion realizada");
            b.getJugador().getEd2().add(bon);
        }else{
            System.out.println("No tiene recursos suficientes");
        }
    }

    
    
    @Override
    public int recoger(Jugador jugador){
        return cantidad;
    }

    
    @Override
    public boolean entrenar(Jugador jugador){
        return estado;
    }
    
    @Override
    public void generar(Jugador jugador){
    }
    
    @Override
    public boolean estado(){
        return estado;
    }

    @Override
    public int getAtacar() {
        return daño;
    }
    
}


