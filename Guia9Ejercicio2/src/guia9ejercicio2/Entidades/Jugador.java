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
public class Jugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private Integer ID;
    private Boolean mojado;
    private ArrayList<Jugador>  jugadores = new ArrayList();
    public Jugador() {
    }
PistoladeAgua l1 = new PistoladeAgua();
    public Jugador(String nombre, Integer ID, Boolean mojado) {
        this.nombre = nombre;
        this.ID = ID;
        this.mojado = mojado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }

    public void disparo(PistoladeAgua p1){
        p1.mojar(p1);
        if(p1.getPosicionactual()==p1.getPosicionagua()){
            mojado = true;
        }else{
            mojado = false;
        }
        p1.siguienteChorro(p1);
    }
}
