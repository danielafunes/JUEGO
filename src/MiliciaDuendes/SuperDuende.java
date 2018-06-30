/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaDuendes;

import Duendes.Duendes;
import Jugador.Jugador;


/**
 *
 * @author DanielaFunes
 */
public class SuperDuende implements Duendes{

    public SuperDuende(Jugador jugador1) {
    }
    public int vida =75;
    public int daño = 75;
    public int costo = 75;
    int cantidad;
    public Jugador jugador;
    boolean estado=false;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
 @Override
    public void construir(Jugador jugador){
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
        int total, total1;
        SuperDuende sd = new SuperDuende(jugador);
        
        if(sd.getJugador().getCm3().getRecurso1() >= costo 
           && sd.getJugador().getCm3().getRecurso3() >= costo && estado==false){
            total = sd.getJugador().getCm3().getRecurso1()-costo;  
            sd.getJugador().getCm3().setRecurso1(total);
            total1 = sd.getJugador().getCm3().getRecurso3()-costo;
            sd.getJugador().getCm3().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno a SuperDuende");
        
        }else{
            System.out.println("No tiene recursos SuperDeunde");
            setEstado(false);
        }
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


