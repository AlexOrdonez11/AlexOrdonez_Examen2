/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_examen2;

import javax.swing.JProgressBar;

/**
 *
 * @author Alex Ordonez
 */
public abstract class Naves {
    private double velocidad;
    private int serie;
    private Planeta planet;

    public Naves(double velocidad, int serie, Planeta planet) {
        this.velocidad = velocidad;
        this.serie = serie;
        this.planet = planet;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public Planeta getPlanet() {
        return planet;
    }

    public void setPlanet(Planeta planet) {
        this.planet = planet;
    }

    @Override
    public String toString() {
        return ""+serie;
    }
    
    public abstract double[] calcularTiempo();
}
