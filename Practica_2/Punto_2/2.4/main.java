/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Listas.ListaEnlazadaGenerica;

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
        estudiante e5 = new estudiante("a", "a", 9, "a", "a");
        estudiante e6 = new estudiante("s", "s", 8, "s", "s");
        estudiante e7 = new estudiante("d", "d", 7, "d", "d");
        estudiante e8 = new estudiante("f", "f", 6, "f", "f");
        estudiante e9 = new estudiante("g", "g", 1, "g", "g");
        
        ListaEnlazadaGenerica<estudiante> l2 = new ListaEnlazadaGenerica<estudiante>();
         
        estudiante e[] = new estudiante [5];
        
        e[0] = e5;
        e[1] = e6;
        e[2] = e7;
        e[3] = e8;
        e[4] = e9;
        
        l2.agregar(e);
        
        l2.comenzar(); 
        
        while (l2.fin() != true) {
            System.out.println(l2.proximo().tusDatos());
        }
    }
    
}