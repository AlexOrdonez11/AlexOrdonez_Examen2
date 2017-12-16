/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_examen2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 *
 * @author Alex Ordonez
 */
public class Sonda_E extends Naves{
    private String material;
    private double peso;
    public Sonda_E(double velocidad, int serie, Planeta planet) {
        super(velocidad, serie, planet);
    }

    public Sonda_E(String material, double peso, double velocidad, int serie, Planeta planet) {
        super(velocidad, serie, planet);
        this.material = material;
        this.peso = peso;
    }
    

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
//retornara dos valores, un tiempo de ida y un tiempo de regreso. En el caso de la sonda espacial el tiempo
//de ida se calculara con la división de la (distancia / velocidad de la sonda), el tiempo de regreso se
//calculara por la formula (9.8*Velocidad de ida).
    @Override
    public double[] calcularTiempo() {
        double[] tempo=new double[2];
        double ida,regreso;
        ida=(super.getPlanet().getDistancia()/this.getVelocidad());
        regreso=(9.8*ida);
        tempo[0]=ida;
        tempo[1]=regreso;
        return tempo;
    }

    
    
}
