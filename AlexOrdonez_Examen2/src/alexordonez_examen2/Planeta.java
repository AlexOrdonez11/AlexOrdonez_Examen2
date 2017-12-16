/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_examen2;

import java.io.Serializable;

/**
 *
 * @author Alex Ordonez
 */
public class Planeta implements Serializable{
    private static final long SerialVersionUTD = 555L;
    private String nombre,Superficie;
    private double distancia;
    private boolean anillos;
    private int temp;

    public Planeta() {
    }

    public Planeta(String nombre, String Superficie, double distancia, boolean anillos, int temp) {
        this.nombre = nombre;
        this.Superficie = Superficie;
        this.distancia = distancia;
        this.anillos = anillos;
        this.temp = temp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(String Superficie) {
        this.Superficie = Superficie;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public boolean isAnillos() {
        return anillos;
    }

    public void setAnillos(boolean anillos) {
        this.anillos = anillos;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
