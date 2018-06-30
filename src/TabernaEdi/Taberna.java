/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TabernaEdi;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import Jugador.Jugador;
import Duendes.Duendes;

/**
 *
 * @author DanielaFunes
 */
public class Taberna implements Duendes{
    public int vida = 350;
    public int costo = 1000;
    int daño;
    int cantidad;
    public Jugador jugador;
    
    public Taberna(Jugador jugador) {
        this.jugador = jugador;
    }

    public Taberna() {
        
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    boolean estado=false;
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
        AbstractFactory duendes = FactoryProducer.getFactory("Duendes");
        Duendes taberna = duendes.getDuendes("Taberna");
        Taberna a = new Taberna(jugador);
        
        if(a.getJugador().getCm().getRecurso1() >= costo 
           && a.getJugador().getCm().getRecurso2() >= costo){
            total = a.getJugador().getCm().getRecurso1()-costo;  
            a.getJugador().getCm().setRecurso1(total);
            total1 = a.getJugador().getCm().getRecurso2()-costo;
            a.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            a.getJugador().getEd3().add(a);
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