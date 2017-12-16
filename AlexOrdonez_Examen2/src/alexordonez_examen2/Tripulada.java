/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_examen2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Ordonez
 */
public class Tripulada extends Naves {
    private String despeje;
    private ArrayList<Astronautas> astros=new ArrayList();
    public Tripulada(double velocidad, int serie, Planeta planet) {
        super(velocidad, serie, planet);
    }

    public String getDespeje() {
        return despeje;
    }

    public Tripulada(String despeje, double velocidad, int serie, Planeta planet) {
        super(velocidad, serie, planet);
        this.despeje = despeje;
    }
    

    public void setDespeje(String despeje) {
        this.despeje = despeje;
    }

    public ArrayList<Astronautas> getAstros() {
        return astros;
    }

    public void setAstros(ArrayList<Astronautas> astros) {
        this.astros = astros;
    }
//En el caso de las naves tripuladas, el tiempo de ida es igual a (distancia / (velocidad*(suma de todos los
//pesos al cuadrado / 100))), y la velocidad de regreso será (distancia / (velocidad*(suma de todos los pesos
/// 100))).
    @Override
    public double[] calcularTiempo() {
        double[]tempo=new double[2];
        double ida,regreso,peso;
        peso=0;
        for (Astronautas astro : this.getAstros()) {
            peso+=astro.getPeso();
        }
        ida=super.getPlanet().getDistancia()/(peso*peso);
        regreso=this.getVelocidad()*(peso/100);
        tempo[0]=ida;
        tempo[1]=regreso;
        return tempo;
    }

    
    
}
