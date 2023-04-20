/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Arboles.ArbolBinario;

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
        ArbolBinario<Integer> a1 = new ArbolBinario();
        ArbolBinario<Integer> a2 = new ArbolBinario();
        ArbolBinario<Integer> a3 = new ArbolBinario();
        ArbolBinario<Integer> a4 = new ArbolBinario();
        ArbolBinario<Integer> a5 = new ArbolBinario();
        
        ArbolBinario<Integer> an = new ArbolBinario();
        ArbolBinario<Integer> a = new ArbolBinario();
        
        a1.setDato(1);
        a2.setDato(2);
        a3.setDato(3);
        a4.setDato(4);
        a5.setDato(5);
        
        an.setDato(6);
        a.setDato(7);
        
        a1.agregarHijoIzquierdo(a2);
        a1.agregarHijoDerecho(a3);
        a2.agregarHijoDerecho(a4);
        a3.agregarHijoIzquierdo(a5);
        a3.agregarHijoDerecho(an);
        a2.agregarHijoIzquierdo(a);
        
        System.out.println(a1.getDato());
        System.out.println(a1.getHijoIzquierdo().getDato());
        System.out.println(a1.getHijoDerecho().getDato());
        System.out.println(a1.getHijoIzquierdo().getHijoDerecho().getDato());
        System.out.println(a1.getHijoDerecho().getHijoIzquierdo().getDato());
        System.out.println(a1.getHijoDerecho().getHijoDerecho().getDato());
        System.out.println(a1.getHijoIzquierdo().getHijoIzquierdo().getDato());

        System.out.println("Cantidad de hojas en el arbol: " + a1.contarHojas());
        
        a1.espejo();
        
        System.out.println(a1.getDato());
        System.out.println(a1.getHijoIzquierdo().getDato());
        System.out.println(a1.getHijoDerecho().getDato());
        System.out.println(a1.getHijoIzquierdo().getHijoDerecho().getDato());
        System.out.println(a1.getHijoDerecho().getHijoIzquierdo().getDato());
        System.out.println(a1.getHijoDerecho().getHijoDerecho().getDato());
        System.out.println(a1.getHijoIzquierdo().getHijoIzquierdo().getDato());
        
        System.out.println("Impresion por niveles: ");
        
        a1.entreNiveles(0, 2);
        
    }
    
}
