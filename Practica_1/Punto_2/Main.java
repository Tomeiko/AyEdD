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

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector = new Scanner(System.in);
	    int vector [] = vector(lector.nextInt());
        for (int i = 0; i < vector.length;  i++) {
              System.out.println(vector [i]);
        }
        lector.close();
    }
    
    public static int [] vector (int n) {
        int vector [] = new int [n];
        int aux = 0;
        for (int i = 0; i < n; i++) {
            aux += n;
            vector [i] = aux;
        }
        return vector;
    }
    
}
