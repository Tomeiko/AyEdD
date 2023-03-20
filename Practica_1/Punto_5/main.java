/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYED;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class main {
    
    private double vector [] = new double [3]; 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vector [] = new int [5];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            vector [i] = lector.nextInt();
        }
        double v [] = calcular1(vector);
        resultados re = new resultados ();
        calcular2(vector, re);
        
    }
    
    public static double [] calcular1 (int vector []) {
        double v [] = new double [3]; 
        int max = -999;
        int min = 999;
        double prom = 0;
        int i;
        for (i = 0; i < vector.length; i++) {
            if (max < vector [i]) {
                max = vector [i];
            }
            if (min > vector [i]) {
                min = vector [i];
            }
            prom += vector [i];
        }
        prom = prom / i;
        v [0] = max;
        v [1] = min;
        v [2] = prom;
        return v;
    }
    
    public static void calcular2 (int vector [], resultados resul) {
        int max = -999;
        int min = 999;
        double prom = 0;
        int i;
        for (i = 0; i < vector.length; i++) {
            if (max < vector [i]) {
                max = vector [i];
            }
            if (min > vector [i]) {
                min = vector [i];
            }
            prom += vector [i];
        }
        prom = prom / i;     
        resul.setmax(max);
        resul.setmin(min);
        resul.setprom(prom);
    }
    
    //FALTA HACER EL PUNTO C
}
