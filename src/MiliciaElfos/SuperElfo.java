/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaElfos;

import Jugador.Jugador;
import Elfos.Elfos;

/**
 *
 * @author DanielaFunes
 */
public class SuperElfo implements Elfos {
    public int vida = 150;
    public int daño = 150;
    public int costo = 1000;
    int cant;
    public Jugador jugador;
    boolean estado = false;
    
    public SuperElfo(Jugador jugador){
     this.jugador = jugador;   
    }

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

    public int getCant() {
        return cant;
    }

    public void setCat(int cat) {
        this.cant = cat;
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
        return cant;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        int total, total1;
        SuperElfo s = new SuperElfo(jugador);
        if(s.getJugador().getCm().getRecurso1() >= costo 
           && s.getJugador().getCm().getRecurso3() >= costo && estado==false){
            total = s.getJugador().getCm().getRecurso1()-costo;  
            s.getJugador().getCm().setRecurso1(total);
            total1 = s.getJugador().getCm().getRecurso3()-costo;
            s.getJugador().getCm().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno SuperElfo");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
        return estado;
    }

    @Override
    public int getAtacar() {
        return daño;
    }
    @Override
    public boolean estado() {
        return estado;
    }

    @Override
    public void generar(Jugador jugador) {
        
    }
}



