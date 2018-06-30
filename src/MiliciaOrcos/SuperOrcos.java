/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiliciaOrcos;
import Jugador.Jugador;
import Orcos.Orcos;
/**
 *
 * @author DanielaFunes
 */
public class SuperOrcos implements Orcos {
    
    public int vida = 500;
    public int daño = 500;
    public int costo = 200;
    int cant;
    public Jugador jugador;
    boolean estado = false;

    public SuperOrcos(Jugador jugador) {
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

    public void setCant(int cant) {
        this.cant = cant;
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
    public int getAtacar(){
        return daño;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        int total, total1;
        SuperOrcos sr = new SuperOrcos(jugador);
        if(sr.getJugador().getCm2().getRecurso2() >= costo 
           && sr.getJugador().getCm2().getRecurso3() >= costo && estado==false){
            total = sr.getJugador().getCm2().getRecurso2()-costo;  
            sr.getJugador().getCm2().setRecurso2(total);
            total1 = sr.getJugador().getCm2().getRecurso3()-costo;
            sr.getJugador().getCm2().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entreno a SuperOrcos");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
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


