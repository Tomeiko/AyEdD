/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Pilas_Colas.ColaGenerica;
import Pilas_Colas.PilaGenerica;

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
        PilaGenerica<Integer> pila = new PilaGenerica<>();
        ColaGenerica<Integer> cola = new ColaGenerica<>();

        pila.apilar(3);
      //  pila.apilar(6);
       // pila.apilar(12);
      //  pila.apilar(24);
      //  pila.apilar(48);
        
        cola.encolar(5);
      //  cola.encolar(10);
        //cola.encolar(20);
       // cola.encolar(40);
       // cola.encolar(80);
        
        System.out.println("la pila es vacia?: " + pila.esVacia());
        System.out.println("la cola es vacia?: " + cola.esVacia());
   
        System.out.println("pila: \n" + pila.desapilar());
        System.out.println("cola: \n" + cola.desencolar());
        
        System.out.println("pila: \n" + pila.tope());
        System.out.println("cola: \n" + cola.tope());
        
        System.out.println("la pila es vacia?: " + pila.esVacia());
        System.out.println("la cola es vacia?: " + cola.esVacia());
        
    }
    
}
