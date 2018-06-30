package Jugador;


import AbstracFactory.AbstractFactory;
import AbstracFactory.FactoryProducer;
import Duendes.Duendes;
import Elfos.Elfos;
import Orcos.Orcos;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DanielaFunes
 */
public class Menu {
    public Jugador jugador;

    public Menu() {
    }
    
    public Menu(Jugador jugador) {
        this.jugador = jugador;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }
    

    AbstractFactory Elfos = FactoryProducer.getFactory("Elfos");
    AbstractFactory Orcos = FactoryProducer.getFactory("Orcos");
    AbstractFactory Duendes = FactoryProducer.getFactory("Duendes");
    
  
    Elfos e = Elfos.getElfos("Rochac"); // milicia
    Elfos e1 = Elfos.getElfos("SuperElfo");//milicia
    Elfos ac = Elfos.getElfos("Dakar");//edificacion 
    Elfos c = Elfos.getElfos("Catapulta");// vehiculo
    Elfos e4 = Elfos.getElfos("Generar oro"); // generar
    
    Orcos o6 = Orcos.getOrcos("Dack");
    Orcos o1 = Orcos.getOrcos("SuperOrco");
    Orcos b = Orcos.getOrcos("Cobalt");
    Orcos tan = Orcos.getOrcos("Tanque");
    Orcos o4 = Orcos.getOrcos("GenerarPlata");
    
    
    Duendes d2 = Duendes.getDuendes("Triza");
    Duendes d1 = Duendes.getDuendes("SuperDuende");
    Duendes a = Duendes.getDuendes("Taberna");
    Duendes d = Duendes.getDuendes("Vendetta");
    Duendes d4 = Duendes.getDuendes("GenerarCristales");
    
    
    public void MenuRaza(Jugador jugador){
        Menu menu = new Menu(jugador);
        
        Scanner leer = new Scanner(System.in);
        int opc;
        System.out.println("\n"+getJugador().getNombre() +"\nEliga su raza\n");
        System.out.println("1. Entrenar Elfos");
        System.out.println("2. Entrenar Orcos");
        System.out.println("3. Entrenar sDuendes\n");
        System.out.println("Digite una opcion: ");
        opc = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Eligio Elfos");
                menu.MenuElfos(jugador);
            break;
            
            case 2:
                System.out.println("Eligio Orcos");
                menu.MenuOrcos(jugador);
            break;
            
            case 3:
                System.out.println("Eligio Duendes");
                menu.MenuDuendes(jugador);
            break;
        }
        
    }
    public void MenuElfos(Jugador jugador){
        int opc=0;
        String answer;
        
        
        do{
            
            System.out.println("\n-----------ELFOS ----------------");
            System.out.println("1. Conrtruir Edificacion Dakar");
            System.out.println("2. Construir Vehiculo Catapulta");
            System.out.println("3. Mejorar centro de mando");
            System.out.println("4. Atacar");
            System.out.println("5. Generar");
            System.out.println("6. Terminar");
            System.out.println("7.salir");
            System.out.println("--------------RECURSOS--------------");
            System.out.println("Monedas de crital: "+getJugador().getCm().getRecurso1());
            System.out.println("Mones de plata: "+getJugador().getCm().getRecurso2());
            System.out.println("Moedas de oro: "+getJugador().getCm().getRecurso3());
            
            Scanner leer = new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            switch(opc){
                    
                   
                case 1:
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                    System.out.println("Cuesta 1000 acero, 1000 cristal. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        ac.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd1().size());
                break;    
                    
                   
                case 2:
                    System.out.println("Cuesta 100 plata, 100 oro. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        c.construir(jugador);
                    }else{
                        break;
                    }
                break;
                case 3:
                    int c1 = getJugador().getCm().getCapacidad1();
                    int c2 = getJugador().getCm().getCapacidad2();
                    int c3 = getJugador().getCm().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double res= (ca1+ca2+ca3);
                    res=res*0.25;
                    res=(int)res/3;
                    
                    System.out.println("El costo por recurso para la mejora es de: "+res);
                    
                    if(getJugador().getCm2().getRecurso1() >= res && getJugador().getCm2().getRecurso2() >= res && getJugador().getCm2().getRecurso3() >= res){
                        getJugador().getCm2().mejorar();
                        System.out.println("Tienes: ");
                        System.out.println("Recurso 1: "+getJugador().getCm().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getCm().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getCm().getRecurso2());
                        System.out.println("Desea continurar con la mejora?(S/N)");
                        answer = leer.next();
                        getJugador().getCm2().setRecurso1(getJugador().getCm2().getRecurso1()-1833);
                        getJugador().getCm2().setRecurso2(getJugador().getCm2().getRecurso2()-1833);
                        getJugador().getCm2().setRecurso3(getJugador().getCm2().getRecurso3()-1833);
                        System.out.println("\nSe ha mejorado Centro de Mando\n");
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                break;
                  
                case 4:
                    break;
                    
                case 5:
                    e4.generar(jugador);
                    break;
                case 6:
                    Menu m = new Menu(jugador);
                    m.MenuElfos(jugador);
                    
                    break;
                   
                }
             }while(opc!=7); 
          }
    
      public void MenuOrcos(Jugador jugador){
        int opc=0;
        String answer;
        
      
        do{
            
            System.out.println("\n-------------- ORCOS------------------");
            System.out.println("1. Conrtruir Edificacion Cobalt ");
            System.out.println("2. Construir Vehiculo Tanque");
            System.out.println("3. Mejorar centro de mando");
            System.out.println("4. Atacar");
            System.out.println("5. Generar");
            System.out.println("6. Terminar");
            System.out.println("7.salir");
            System.out.println("---------------RECURSOS---------------");
            System.out.println("Monedas de cristal: "+getJugador().getCm().getRecurso1());
            System.out.println("Mones de plata: "+getJugador().getCm().getRecurso2());
            System.out.println("Moedas de oro: "+getJugador().getCm().getRecurso3());
            
            Scanner leer = new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            switch(opc){
                
                    
                case 1:
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd2().size());
                    System.out.println("Cuesta 1500 oro, 1500 cristal. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        b.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd2().size());
                break;
                    
                case 2:
                    System.out.println("isEmpty: "+getJugador().getEd1().isEmpty());
                    System.out.println("size: "+getJugador().getEd2().size());
                    System.out.println("Cuesta 2000 oro, 2000 cristal. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        tan.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd2().isEmpty());
                    System.out.println("size: "+getJugador().getEd2().size());
                break;
                    
                case 3:
                    int c1 = getJugador().getCm2().getCapacidad1();
                    int c2 = getJugador().getCm2().getCapacidad2();
                    int c3 = getJugador().getCm2().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double res= (ca1+ca2+ca3);
                    res=res*0.25;
                    res=(int)res/3;
                    
                    System.out.println("El costo por recurso para la mejora es de: "+res);
                    
                    if(getJugador().getCm2().getRecurso1() >= res && getJugador().getCm2().getRecurso2() >= res && getJugador().getCm2().getRecurso3() >= res){
                        getJugador().getCm2().mejorar();
                        System.out.println("Tienes: ");
                        System.out.println("Recurso 1: "+getJugador().getCm2().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getCm2().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getCm2().getRecurso2());
                        System.out.println("Desea continurar con la mejora?(S/N)");
                        answer = leer.next();
                        getJugador().getCm2().setRecurso1(getJugador().getCm2().getRecurso1()-1833);
                        getJugador().getCm2().setRecurso2(getJugador().getCm2().getRecurso2()-1833);
                        getJugador().getCm2().setRecurso3(getJugador().getCm2().getRecurso3()-1833);
                        System.out.println("\nSe ha mejorado el Centro de Mando\n");
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                break;
                  
                case 4:
                    break;
                
                case 5:
                    o4.generar(jugador);
                    break;   
                    
                case 6:
                    Menu m = new Menu(jugador);
                    m.MenuElfos(jugador);
                    
                    break;
                   
                }
             }while(opc!=7); 
    
      }
    public void MenuDuendes(Jugador jugador){
        int opc=0;
        String answer;
        
        
        do{
            
            System.out.println("\n-----------DUENDES------------------------------")
            System.out.println("1. Conrtruir Edificacion Taberna");
            System.out.println("2. Construir Vehiculo Vendetta ");
            System.out.println("3. Mejorar centro de mando");
            System.out.println("4. Atacar");
            System.out.println("5. Generar");
            System.out.println("6. Terminar");
            System.out.println("7.salir");
            System.out.println("----------------------RECURSOS---------------------");
            System.out.println("Monedas de cristal: "+getJugador().getCm().getRecurso1());
            System.out.println("Mones de plata: "+getJugador().getCm().getRecurso2());
            System.out.println("Moedas de oro: "+getJugador().getCm().getRecurso3());
            Scanner leer = new Scanner(System.in);
            try{
                System.out.println("\nDigite una opcion: ");
                opc = leer.nextInt();
            }
            catch(Exception e){
                System.err.println("\nNo ingresó un numero\n");
            }
            switch(opc){
                
                case 1:
                    System.out.println("isEmpty: "+getJugador().getEd3().isEmpty());
                    System.out.println("size: "+getJugador().getEd3().size());
                    System.out.println("Cuesta 1000 cristal, 1000 plata. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        a.construir(jugador);
                    }else{
                        break;
                        }
                    System.out.println("isEmpty: "+getJugador().getEd3().isEmpty());
                    System.out.println("size: "+getJugador().getEd3().size());
                break;
                case 2:
                    System.out.println("isEmpty: "+getJugador().getEd3().isEmpty());
                    System.out.println("size: "+getJugador().getEd3().size());
                    System.out.println("Cuesta 1000 cristal, 1000plata. Desea continuar?((S/N)");
                    answer = leer.next();
                    if(answer.equalsIgnoreCase("S")){
                        
                        d.construir(jugador);
                    }else{
                        break;
                    }
                    System.out.println("isEmpty: "+getJugador().getEd3().isEmpty());
                    System.out.println("size: "+getJugador().getEd3().size());
                break;
                case 3:
                    int c1 = getJugador().getCm3().getCapacidad1();
                    int c2 = getJugador().getCm3().getCapacidad2();
                    int c3 = getJugador().getCm3().getCapacidad3();
                    double ca1=c1+(c1*0.10); 
                    double ca2=c2+(c2*0.30); 
                    double ca3=c3+(c3*0.50); 
                    double res= (ca1+ca2+ca3);
                    res=res*0.25;
                    res=(int)res/3;
                    
                    System.out.println("El costo por recurso para la mejora es de: "+res);
                    
                    if(getJugador().getCm2().getRecurso1() >= res && getJugador().getCm2().getRecurso2() >= res && getJugador().getCm2().getRecurso3() >= res){
                        getJugador().getCm2().mejorar();
                        System.out.println("Tienes: ");
                        System.out.println("Recurso 1: "+getJugador().getCm3().getRecurso1());
                        System.out.println("Recurso 2: "+getJugador().getCm3().getRecurso3());
                        System.out.println("Recurso 3: "+getJugador().getCm3().getRecurso2());
                        System.out.println("Desea continurar con la mejora?(S/N)");
                        answer = leer.next();
                        getJugador().getCm2().setRecurso1(getJugador().getCm3().getRecurso1()-1833);
                        getJugador().getCm2().setRecurso2(getJugador().getCm3().getRecurso2()-1833);
                        getJugador().getCm2().setRecurso3(getJugador().getCm3().getRecurso3()-1833);
                        System.out.println("\nSe ha mejorado el Centro de Mando!\n");
                    }else{
                        System.out.println("No tiene recursos suficientes");
                    }
                break;
                  
                case 4:
                    break;
                case 5:
                    d4.generar(jugador);
                    break;    
                case 6:
                    Menu m = new Menu(jugador);
                    m.MenuElfos(jugador);
                    
                    break;
                   
                }
             }while(opc!=7); 
        
          }

    public void addMenu() {
        
    }
}
