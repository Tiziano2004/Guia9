/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio3.Servicios;

import guia9ejercicio3.Entidades.Baraja;
import guia9ejercicio3.Enumeraciones.Enumeracione;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Usuario
 */
public class ServiciosBaraja {

    ArrayList<Baraja> baraja = new ArrayList();
    ArrayList<Baraja> resto = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void Llenarbaraja() {
        for (int i = 1; i < 12; i++) {
            if (i == 8 || i == 9) {
                continue;
            } else {
                Baraja e = new Baraja();
                Baraja s = new Baraja();
                Baraja c = new Baraja();
                Baraja b = new Baraja();
                e.setCarta(i);
                s.setCarta(i);
                c.setCarta(i);
                b.setCarta(i);
                e.setPalo(Enumeracione.Basto);
                s.setPalo(Enumeracione.Espada);
                c.setPalo(Enumeracione.Oro);
                b.setPalo(Enumeracione.Copa);
                baraja.add(e);
                baraja.add(s);
                baraja.add(c);
                baraja.add(b);
            }

        }
    }
    private static final Logger LOG = Logger.getLogger(ServiciosBaraja.class.getName());

    public void Barajar() {
        Collections.shuffle(baraja);
        System.out.println(" Se acaban de barajar las cartas ");
    }

    public void siguienteCarta() {
        if (baraja.isEmpty()) {
            System.out.println(" No hay mas cartas en la baraja");
        } else {
            resto.add(baraja.get(0));
            baraja.remove(0);
        }
    }

    public void cartasDisponibles() {
        System.out.println(" La cantidad de cartas en la baraja es " + baraja.size());
    }

    public void darCartas() {
        System.out.println(" Indique la cantidad de cartas que quiere sacar de la baraja ");
        int cartas = leer.nextInt();

        if (baraja.isEmpty()) {
            System.out.println(" La baraja esta vacia ");
        } else {
            if (cartas > baraja.size()) {
                System.out.println(" No hay tantas cartas en la baraja");
            } else {
                for (int i = 0; i < cartas; i++) {
                    resto.add(baraja.get(0));
                    baraja.remove(0);
                }
            }
        }
        System.out.println(" Ya se dieron las cartas ");
    }

    public void cartasMonton() {
        if (resto.isEmpty()) {
            System.out.println(" No hay cartas en el monton ");
        } else {
            System.out.println(" Se van a mostrar las cartas en el monton ");
            for (Baraja aux : resto) {
                System.out.println(aux.toString()
                );
            }
        }

    }

    public void mostrarBaraja() {
        System.out.println(" Se van a mostrar las cartas en la baraja ");
        for (Baraja aux : baraja) {
            System.out.println(aux.toString());
        }
    }
}
