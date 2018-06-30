/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador;


import CentroMando.CentroMando;
import CentroMando.CentroMando2;
import CentroMando.CentroMando3;
import Duendes.Duendes;
import Elfos.Elfos;
import Orcos.Orcos;


import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
    
    public String nombre;
    public CentroMando cm;
    public CentroMando2 cm2;
    public CentroMando3 cm3;
    
    public ArrayList<Elfos> ed1;
    public ArrayList<Orcos> ed2;
    public ArrayList<Duendes> ed3;
    
    public ArrayList<Elfos> v1;
    public ArrayList<Orcos> v2;
    public ArrayList<Duendes> v3;
    
    public ArrayList<Elfos> es1;
    public ArrayList<Orcos> es2;
    public ArrayList<Duendes>es3;

     
    
    public Jugador jugador;

    public Jugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador() {
    }

    public Jugador(String nombre, CentroMando cm) {
        this.nombre = nombre;
        this.cm = cm;
    }

    public Jugador(String nombre, CentroMando cm, CentroMando2 cm2, CentroMando3 cm3, ArrayList<Elfos> ed1, ArrayList<Orcos> ed2, ArrayList<Duendes> ed3, ArrayList<Elfos> v1, ArrayList<Orcos> v2, ArrayList<Duendes> v3) {
        this.nombre = nombre;
        this.cm = cm;
        this.ed1 = ed1;
        this.ed2 = ed2;
        this.ed3 = ed3;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.cm2 = cm2;
        this.cm3 = cm3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CentroMando getCm() {
        return cm;
    }

    public void setCm(CentroMando cm) {
        this.cm = cm;
    }

    public ArrayList<Elfos> getEd1() {
        return ed1;
    }

    public void setEd1(ArrayList<Elfos> ed1) {
        this.ed1 = ed1;
    }

    public ArrayList<Orcos> getEd2() {
        return ed2;
    }

    public void setEd2(ArrayList<Orcos> ed2) {
        this.ed2 = ed2;
    }

    public ArrayList<Duendes> getEd3() {
        return ed3;
    }

    public void setEd3(ArrayList<Duendes> ed3) {
        this.ed3 = ed3;
    }

    public ArrayList<Elfos> getV1() {
        return v1;
    }

    public void setV1(ArrayList<Elfos> v1) {
        this.v1 = v1;
    }

    public ArrayList<Orcos> getV2() {
        return v2;
    }

    public void setV2(ArrayList<Orcos> v2) {
        this.v2 = v2;
    }

    public ArrayList<Duendes> getV3() {
        return v3;
    }

    public void setV3(ArrayList<Duendes> v3) {
        this.v3 = v3;
    }

    public CentroMando2 getCm2() {
        return cm2;
    }

    public void setCm2(CentroMando2 cm2) {
        this.cm2 = cm2;
    }

    public CentroMando3 getCm3() {
        return cm3;
    }

    public void setCm3(CentroMando3 cm3) {
        this.cm3 = cm3;
    }
    
    public void addJugador(){
        CentroMando m1 = new CentroMando();
        CentroMando2 m2 = new CentroMando2();
        CentroMando3 m3 = new CentroMando3();
        ArrayList<Elfos> ed1 = new ArrayList();
        ArrayList<Orcos> ed2 = new ArrayList();
        ArrayList<Duendes> ed3 = new ArrayList();
        ArrayList<Elfos> v1 = new ArrayList();
        ArrayList<Orcos> v2 = new ArrayList();
        ArrayList<Duendes> v3 = new ArrayList();
        Scanner leer = new Scanner(System.in);
        System.out.println("\nEmpieza el jugador 1!");
        System.out.println("Jugador 1, digite su nombre: ");
        String player1 = leer.nextLine();
        Jugador j1 = new Jugador(player1, m1, m2, m3, ed1, ed2, ed3, v1, v2, v3);
        ArrayList<Jugador> jug1 = new ArrayList();
        jug1.add(j1);
        System.out.println("Jugador 1: "+j1.getNombre());
        Menu me = new Menu(j1);
        me.MenuRaza(j1);
    }
    
    public void addJugador2(){
        CentroMando m2 = new CentroMando();
        CentroMando2 m3 = new CentroMando2();
        CentroMando3 m4 = new CentroMando3();
        ArrayList<Elfos> ed1 = new ArrayList();
        ArrayList<Orcos> ed2 = new ArrayList();
        ArrayList<Duendes> ed3 = new ArrayList();
        ArrayList<Elfos> v1 = new ArrayList();
        ArrayList<Orcos> v2 = new ArrayList();
        ArrayList<Duendes> v3 = new ArrayList();
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 2, digite su nombre: ");
        String player2 = leer.nextLine();
        Jugador j2 = new Jugador(player2, m2, m3, m4, ed1, ed2, ed3, v1, v2, v3);
        ArrayList<Jugador> jug2 = new ArrayList();
        jug2.add(j2);
        System.out.println("Jugador 2: "+j2.getNombre());
        Menu m = new Menu(j2);
        m.MenuRaza(j2);

    }
}
