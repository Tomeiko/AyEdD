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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        estudiante e [] = new estudiante [2];
        profesor p [] = new profesor [3];
        
        e [0] = new estudiante("x0", "y0", 00, "y0", "x0");
        e [1] = new estudiante("x1", "y1", 01, "y1", "x1");
        
        p [0] = new profesor("x0", "y0", "z0", "y0", "x0");
        p [1] = new profesor("x1", "y1", "z1", "y1", "x1");
        p [2] = new profesor("x2", "y2", "z2", "y2", "x2");
        
        for (int i = 0; i < 2; i++) {
            System.out.println(e[i].tusDatos());
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println(p[i].tusDatos());
        }
        
    }
    
}
