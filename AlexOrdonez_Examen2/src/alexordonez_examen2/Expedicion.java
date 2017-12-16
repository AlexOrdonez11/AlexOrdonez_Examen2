/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexordonez_examen2;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex Ordonez
 */
public class Expedicion extends Thread {
    private boolean avanzar=true;
    private Naves nave;
    private Planeta destino;

    public Expedicion(Naves nave, Planeta destino) {
        this.nave = nave;
        this.destino = destino;
    }

    public Naves getNave() {
        return nave;
    }

    public void setNave(Naves nave) {
        this.nave = nave;
    }

    public Planeta getDestino() {
        return destino;
    }

    public void setDestino(Planeta destino) {
        this.destino = destino;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }
 
    public boolean isAvanzar() {
        return avanzar;
    }

    @Override
    public void run() {
        while(avanzar){
            try {
                double[]tempo=this.nave.calcularTiempo();
                Thread.sleep((long) (tempo[0]*1000));
                JOptionPane.showMessageDialog(null, "La nave: "+this.nave.getSerie()+" Llego a su destino");
                Thread.sleep((long) (tempo[1]*1000));
                JOptionPane.showMessageDialog(null, "La nave: "+this.nave.getSerie()+" regreso al planeta");
                avanzar=false;
            } catch (InterruptedException ex) {
                Logger.getLogger(Sonda_E.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
