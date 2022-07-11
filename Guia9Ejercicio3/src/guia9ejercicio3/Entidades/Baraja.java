/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio3.Entidades;

import guia9ejercicio3.Enumeraciones.Enumeracione;

/**
 *
 * @author Usuario
 */
public class Baraja {

    private Integer carta;
    private Enumeracione palo;

    public Baraja() {
    }

    public Baraja(Integer carta, Enumeracione palo) {
        this.carta = carta;
        this.palo = palo;
    }

    public Integer getCarta() {
        return carta;
    }

    public void setCarta(Integer carta) {
        this.carta = carta;
    }

    public Enumeracione getPalo() {
        return palo;
    }

    public void setPalo(Enumeracione palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Baraja{" + "carta=" + carta + ", palo=" + palo + '}';
    }

    
    
    

}
