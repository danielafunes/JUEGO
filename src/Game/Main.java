/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import Jugador.Jugador;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Jugador j = new Jugador();
        
        System.out.println("Descricion de Razas");
        System.out.println("Eliga sabiamente su raza, cada una tiene sus fortalezas y debilidades");
        System.out.println("Elfos: Poseen las edificaciones mas fuertes, pero su milicia es debil");
        System.out.println("Orcos: Poseen la milicia mas fuerte de todas, pero el costo de edificaciones y milicia es muy alto");
        System.out.println("Duendes: Poseen los mejores vehiculos para atacar, pero sus edificaciones son debiles\n");
        System.out.println("Escriba s para continuar");
        System.out.println("\n(S/N)");
        Scanner leer = new Scanner(System.in);
        String t = leer.next();
        if(t.equalsIgnoreCase("s")){
            try {  
            Thread.sleep(1000);                
        }catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        j.addJugador();
        j.addJugador2();
        }else{
            System.exit(0);
        }
        
    }
}

       
        
      
       



