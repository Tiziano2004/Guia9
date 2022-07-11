/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicioextra1.Servicios;

import guia9ejercicioextra1.Entidades.Perro;
import guia9ejercicioextra1.Entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServiciosEntidades {

    ArrayList<Perro> Perros = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Iterator m = Perros.iterator();
ArrayList<Persona> m1 = new ArrayList();
    public void Adoptar() {
        Perro l1 = new Perro("Pepito", "Bulldog", 2.1, 14);
        Perro l2 = new Perro("Pepita", "Caniche", 1.4, 10);
        Perro l3 = new Perro("Apolo", "Aleman", 3.2, 5);
        Perro l4 = new Perro("Zeus", "Shiptsu", 1.1, 3);
        Perro l5 = new Perro("Poseidon", "Caniche Toy", 2.6, 1);
        Perro l6 = new Perro("Hades", "Bulldog", 3.5, 11);
        Perros.add(l1);
        Perros.add(l2);
        Perros.add(l3);
        Perros.add(l4);
        Perros.add(l5);
        Perros.add(l6);
        String opcion = null;
        do {
            if (Perros.isEmpty()) {
                System.out.println(" No hay mas perros para dar en adopcion ");
                break;
            }
            Persona v1 = new Persona();
            System.out.println(" Cree al humano ");
            System.out.println(" Ingrese el nombre ");
            v1.setNombre(leer.next());
            System.out.println(" Ingrese el apellido ");
            v1.setApellido(leer.next());
            System.out.println(" Ingrese la edad ");
            v1.setEdad(leer.nextInt());
            System.out.println(" Ingrese el DNI ");
            v1.setDNI(leer.nextInt());
            for (Perro aux : Perros) {
                System.out.println(aux.toString());
            }
            System.out.println(" Ingrese el nombre del perro al que quiere adoptar ");
            String adopcion = leer.next();
            for (int i = 0; i < Perros.size(); i++) {
                Perro aux = Perros.get(i);
                if(adopcion.equals(aux.getNombre())){
                    v1.setPerro(aux);
                    Perros.remove(i);
                }
            }
            m1.add(v1);
            System.out.println(" ¿Quiere adoptar otra mascota ?");
            opcion = leer.next();
            if(opcion.equalsIgnoreCase("no")){
               for (Persona aux1 : m1) {
                System.out.println(aux1.toString());
            } 
            }
           
        } while (!opcion.equalsIgnoreCase("No"));
    }
}
