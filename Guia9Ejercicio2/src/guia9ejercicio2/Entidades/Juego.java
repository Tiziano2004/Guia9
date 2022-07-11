/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2.Entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Juego {

    ArrayList<Jugador> Jugadores = new ArrayList();
    PistoladeAgua l1 = new PistoladeAgua();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void llenarJuego() {
        System.out.println(" Ingrese la cantidad de jugadores ");
        int jugadores2 = leer.nextInt();

        if (jugadores2 > 6) {
            System.out.println(" No pueden ser mas de 6 jugadores ");
            System.out.println(" Seran 6 jugadores ");
            jugadores2 = 6;
        }
        for (int i = 0; i < jugadores2; i++) {
            Jugador m1 = new Jugador();
            System.out.println(" Ingrese el nombre del jugador ");
            m1.setNombre(leer.next());
            System.out.println(" Ingrese el ID ");
            m1.setID(leer.nextInt());
            Jugadores.add(m1);
        }
    }
    public void ronda(PistoladeAgua p1){
      p1.llenarRevolver(p1);
      int a = 0;
        do{
          for (Jugador aux : Jugadores) {
            aux.disparo(p1);
            if(aux.getMojado()== true){
                System.out.println(" El jugador "+ aux.getNombre() + " esta mojado");
                a = 1;
                break;
            }else{
                System.out.println(" El jugador "+ aux.getNombre() + " no se mojo");
            }
        } 
       }while(a == 0);
    }
    
}
