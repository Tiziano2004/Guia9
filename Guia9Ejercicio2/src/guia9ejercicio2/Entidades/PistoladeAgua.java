/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia9ejercicio2.Entidades;

/**
 *
 * @author angel
 */
public class PistoladeAgua {

    private Integer posicionactual;
    private Integer posicionagua;

    
    public PistoladeAgua() {
    }

    public PistoladeAgua(Integer posicionactual, Integer posicionagua) {
        this.posicionactual = posicionactual;
        this.posicionagua = posicionagua;
    }

    public Integer getPosicionactual() {
        return posicionactual;
    }

    public void setPosicionactual(Integer posicionactual) {
        this.posicionactual = posicionactual;
    }

    public Integer getPosicionagua() {
        return posicionagua;
    }

    public void setPosicionagua(Integer posicionagua) {
        this.posicionagua = posicionagua;
    }

    public void llenarRevolver(PistoladeAgua p1) {
        posicionactual = (int) (Math.random() * 6) + 1;
        posicionagua = (int) (Math.random() * 6) + 1;
    }
    
    public void mojar(PistoladeAgua p1){
        boolean iguales = false;
        if(posicionactual == posicionagua){
            iguales = true;
        }
        if(iguales == true){
        }
    }
    
    public void siguienteChorro(PistoladeAgua p1){ 
        if(posicionagua > 5){
            posicionagua = 1;
        }else{
            posicionagua += 1;
        }
    }

    @Override
    public String toString() {
        return "PistoladeAgua{" + "posicionactual=" + posicionactual + ", posicionagua=" + posicionagua + '}';
    }
    
    
}
