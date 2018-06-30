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
public class Rochac implements Elfos {
    public int vida = 75;
    public int daño = 75;
    public int costo = 1000;
    int cant;
    public Jugador jugador;
    boolean estado = false;
    
    public Rochac() {
    }

    public Rochac(Jugador jugador) {
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
        int num;
        Rochac a = new Rochac(jugador);
        num = a.getCant();
        a.getJugador().getCm().setRecurso1(a.getJugador().getCm().getRecurso1()+num);
        return num;
    }
    
    public int getAtaque(){
        int total;
        Rochac t = new Rochac();
        System.out.println("antes: "+getVida());
        total = getVida() - getDaño();
        setVida(total);
        System.out.println("despues: "+getVida());
        return total;
    }
    
    @Override
    public boolean entrenar(Jugador jugador){
        int total, total1;
        Rochac t = new Rochac(jugador);
        if(t.getJugador().getCm().getRecurso1() >= costo 
           && t.getJugador().getCm().getRecurso3() >= costo && estado==false){
            total = t.getJugador().getCm().getRecurso1()-costo;  
            t.getJugador().getCm().setRecurso1(total);
            total1 = t.getJugador().getCm().getRecurso3()-costo;
            t.getJugador().getCm().setRecurso3(total1);
            setEstado(true);
            System.out.println("Se entrenaron Rochac");
        }else{
            System.out.println("No tiene recursos suficientes");
            setEstado(false);
        }
        return estado;
    }

    @Override
    public int getAtacar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void generar(Jugador jugador) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

    

    
