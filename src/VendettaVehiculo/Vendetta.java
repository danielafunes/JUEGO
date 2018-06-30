/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VendettaVehiculo;

import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import Duendes.Duendes;
import Jugador.Jugador;

/**
 *
 * @author DanielaFunes
 */
public class Vendetta implements Duendes{
    public int vida = 350;
    public int costo = 850;
    public int daño ;
    int cantidad;
    boolean estado=false;
    public Jugador jugador;
    
    public Vendetta(Jugador jugador){
    }

    public Vendetta() {
        
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
        AbstractFactory duendes = FactoryProducer.getFactory("Duendes");
        Duendes d = duendes.getDuendes("Vendetta");
        Vendetta ven = new Vendetta(jugador);
        if(ven.getJugador().getCm().getRecurso1() >= costo 
           && ven.getJugador().getCm().getRecurso2() >= costo){
            total = ven.getJugador().getCm().getRecurso1()-costo;  
            ven.getJugador().getCm().setRecurso1(total);
            total1 = ven.getJugador().getCm().getRecurso2()-costo;
            ven.getJugador().getCm().setRecurso2(total1);
            System.out.println("Construccion realizada");
            ven.getJugador().getV3().add(d);
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
