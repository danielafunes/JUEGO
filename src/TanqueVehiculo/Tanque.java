/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TanqueVehiculo;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import Jugador.Jugador;
import Orcos.Orcos;


/**
 *
 * @author DanielaFunes
 */
public class Tanque implements Orcos{
    public int vida = 200;
    public int costo = 2000;
    public int daño;
    int cantidad;
    boolean estado=false;
    public Jugador jugador;
    
    
    public Tanque(Jugador jugador){
        
    }

    public Tanque() {
        
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
        AbstractFactory orcos = FactoryProducer.getFactory("Orcos");
        Orcos o = orcos.getOrcos("Tanque");
        Tanque tan = new Tanque(jugador);
        
        if(tan.getJugador().getCm2().getRecurso1() >= costo 
           && tan.getJugador().getCm2().getRecurso2() >= costo){
            total = tan.getJugador().getCm2().getRecurso1()-costo;  
            tan.getJugador().getCm2().setRecurso1(total);
            total1 = tan.getJugador().getCm2().getRecurso2()-costo;
            tan.getJugador().getCm2().setRecurso2(total1);
            System.out.println("Construccion realizada");
            tan.getJugador().getV2().add(o);
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

