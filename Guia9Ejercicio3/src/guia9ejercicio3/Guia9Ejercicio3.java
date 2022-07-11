/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio3;

import guia9ejercicio3.Servicios.ServiciosBaraja;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Guia9Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosBaraja l1 = new ServiciosBaraja();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int a = 1;
        l1.Llenarbaraja();
        do{
           System.out.println(" Bienvenido al menu ");
           System.out.println(" Ingrese su opcion: 1 = Barajar, 2 = Siguiente carta, 3 = Cartas Disponibles, 4 = Dar Cartas, 5 = Mostrar Monton, 6 = Mostrar Baraja y 7 = Salir");
           int opcion = leer.nextInt();
           switch(opcion){
               case 1:
                   l1.Barajar();
                   break;
               case 2:
                   l1.siguienteCarta();
                   break;
               case 3:
                   l1.cartasDisponibles();
                   break;
               case 4:
                   l1.darCartas();
                   break;
               case 5:
                  l1.cartasMonton();
                  break;
               case 6:
                   l1.mostrarBaraja();
                   break;
               case 7:
                   a = 0;
                   break;
               default:
                   System.out.println(" No elegiste ninguna opcion logica");
                   break;
           }
       }while(a != 0);
    }
    
}
