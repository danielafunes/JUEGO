/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CatapultaVehiculo;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import Elfos.Elfos;
import Jugador.Jugador;


/**
 *
 * @author DanielaFunes
 */
public class Catapulta implements Elfos{

    public int vida = 200;
    public int costo = 100;
    public int daño = 150;
    int cantidad;
    boolean estado=false;
    public Jugador jugador;

    public Catapulta() {
        
    }

    public Catapulta (Jugador jugador) {
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

    @Override
     public void construir(Jugador jugador){
        int total, total1;
        AbstractFactory elfos = FactoryProducer.getFactory("Elfos");
        Elfos c = elfos.getElfos("Catapulta");
        Catapulta ca = new Catapulta(jugador);
        
        if(ca.getJugador().getCm().getRecurso1() >= costo 
           && ca.getJugador().getCm().getRecurso2() >= costo){
            total = ca.getJugador().getCm().getRecurso1()-costo;  
            ca.getJugador().getCm().setRecurso1(total);
            total1 = ca.getJugador().getCm().getRecurso2()-costo;
            ca.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            ca.getJugador().getV1().add(c);
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
    public void generar(Jugador jugador){
    }
    
    
    @Override
    public boolean estado(){
        return estado;
    }
    
}


