/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CentroMando;

/**
 *
 * @author DanielaFunes
 */
public class CentroMando3 {
    int vida = 1000;
    int recurso1 = 1500, recurso2=1500, recurso3=1500;
    int capacidad1 = 10000;
    int capacidad2 = 5000;
    int capacidad3 = 3000;
    int capacidad1mejorar = 11000;
    int capacidad2mejorar = 6500;
    int capacidad3mejorar = 4500;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getRecurso1() {
        return recurso1;
    }

    public void setRecurso1(int recurso1) {
        this.recurso1 = recurso1;
    }

    public int getRecurso2() {
        return recurso2;
    }

    public void setRecurso2(int recurso2) {
        this.recurso2 = recurso2;
    }

    public int getRecurso3() {
        return recurso3;
    }

    public void setRecurso3(int recurso3) {
        this.recurso3 = recurso3;
    }

    public int getCapacidad1() {
        return capacidad1;
    }

    public void setCapacidad1(int capacidad1) {
        this.capacidad1 = capacidad1;
    }

    public int getCapacidad2() {
        return capacidad2;
    }

    public void setCapacidad2(int capacidad2) {
        this.capacidad2 = capacidad2;
    }

    public int getCapacidad3() {
        return capacidad3;
    }

    public void setCapacidad3(int capacidad3) {
        this.capacidad3 = capacidad3;
    }

    public int getCapacidad1mejorar() {
        return capacidad1mejorar;
    }

    public void setCapacidad1mejorar(int capacidad1mejorar) {
        this.capacidad1mejorar = capacidad1mejorar;
    }

    public int getCapacidad2mejorar() {
        return capacidad2mejorar;
    }

    public void setCapacidad2mejorar(int capacidad2mejorar) {
        this.capacidad2mejorar = capacidad2mejorar;
    }

    public int getCapacidad3mejorar() {
        return capacidad3mejorar;
    }

    public void setCapacidad3mejorar(int capacidad3mejorar) {
        this.capacidad3mejorar = capacidad3mejorar;
    }
    public void mejorar(){
        setCapacidad1(capacidad1mejorar);
        setCapacidad2(capacidad2mejorar);
        setCapacidad3(capacidad3mejorar);
    }
    
}


