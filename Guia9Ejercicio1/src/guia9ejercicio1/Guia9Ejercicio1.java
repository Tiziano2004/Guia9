/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio1;

import guia9ejercicio1.Entidades.Mascota;
import guia9ejercicio1.Entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author angel
 */
public class Guia9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona m1 = new Persona();
        Persona m2 = new Persona();
        Mascota l1 = new Mascota();
        Mascota l2 = new Mascota();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println(" Cree a la primer persona ");
        System.out.println("-------------------------*----------------------");
        System.out.println(" Ingrese el nombre ");
        m1.setNombre(leer.next());
        System.out.println(" Ingrese el apellido ");
        m1.setApellido(leer.next());
        System.out.println(" Ingrese la edad ");
        m1.setEdad(leer.nextInt());
        System.out.println(" Ingrese el documento ");
        m1.setDocumento(leer.nextInt());
        System.out.println(" Cree al Perro ");
        System.out.println("-------------------------*----------------------");
        System.out.println(" Ingrese el nombre ");
        l1.setNombre(leer.next());
        System.out.println(" Ingrese la raza ");
        l1.setRaza(leer.next());
        System.out.println(" Ingrese la edad ");
        l1.setEdad(leer.nextInt());
        System.out.println(" Ingrese el tamaño ");
        l1.setTamaño(leer.nextInt());
        m1.setPerro(l1);
        System.out.println(m1.toString());
    }

}
