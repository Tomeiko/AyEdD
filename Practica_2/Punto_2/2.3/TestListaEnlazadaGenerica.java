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
public class TestListaEnlazadaGenerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        estudiante e1 = new estudiante("t", "t", 5, "t", "t");
        estudiante e2 = new estudiante("y", "y", 4, "y", "y");
        estudiante e3 = new estudiante("u", "u", 3, "u", "u");
        estudiante e4 = new estudiante("i", "i", 2, "i", "i");
        
        ListaEnlazadaGenerica<estudiante> l1 = new ListaEnlazadaGenerica<estudiante>();
        
        l1.agregarFinal(e2);
        l1.agregarInicio(e3);
        l1.agregarInicio(e4);
        l1.agregarEn(e1, 3);
        
        l1.comenzar();
        while (l1.fin() != true) {
            System.out.println(l1.proximo().tusDatos());
        }
    }
    
}
