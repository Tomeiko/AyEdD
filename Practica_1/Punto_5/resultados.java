/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYED;

/**
 *
 * @author Usuario
 */
public class resultados {
    
    private int max;
    private int min;
    private double prom;
    
    public resultados () {
        
    }
    
    public void setmax (int max) {
        this.max = max;
    }
    
    public void setmin (int min) {
        this.min = min;
    }
    
    public void setprom (double prom) {
        this.prom = prom;
    }
    
    public int getmax (int max) {
        return max;
    }
    
    public int getmin (int min) {
        return min;
    }
    
    public double getprom () {
        return prom;
    }
}
