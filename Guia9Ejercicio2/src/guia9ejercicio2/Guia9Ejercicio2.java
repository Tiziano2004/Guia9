/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2;

import guia9ejercicio2.Entidades.Juego;
import guia9ejercicio2.Entidades.PistoladeAgua;


/**
 *
 * @author angel
 */
public class Guia9Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       PistoladeAgua p1 = new PistoladeAgua();
        Juego l1 = new Juego();
        l1.llenarJuego();
        l1.ronda(p1);
    }
    
}
