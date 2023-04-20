/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Arboles.ArbolBinario;
import Listas.ListaEnlazadaGenerica;

/**
 *
 * @author Usuario
 */
public class ContadorArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario<Integer> arbol = new ArbolBinario(1);
        ListaEnlazadaGenerica lista = new ListaEnlazadaGenerica();
        
        ArbolBinario<Integer> n2 = new ArbolBinario(2);
        ArbolBinario<Integer> n3 = new ArbolBinario(3);
        ArbolBinario<Integer> n4 = new ArbolBinario(4);
        ArbolBinario<Integer> n5 = new ArbolBinario(5);
        ArbolBinario<Integer> n6 = new ArbolBinario(6);
        ArbolBinario<Integer> n7 = new ArbolBinario(7);
        
        arbol.agregarHijoIzquierdo(n2);
        arbol.agregarHijoDerecho(n3);
        arbol.getHijoIzquierdo().agregarHijoIzquierdo(n4);
        arbol.getHijoIzquierdo().agregarHijoDerecho(n5);
        arbol.getHijoDerecho().agregarHijoIzquierdo(n6);
        arbol.getHijoDerecho().agregarHijoDerecho(n7);
        
        //System.out.println(Preorder(arbol, lista));
        //System.out.println(Inorder(arbol, lista));
        System.out.println(Posorder(arbol, lista));
             
        lista.comenzar();
        
        System.out.println(lista.proximo());
        System.out.println(lista.proximo());
        System.out.println(lista.proximo());
        System.out.println(lista.proximo());
        System.out.println(lista.proximo());
        System.out.println(lista.proximo());
        System.out.println(lista.proximo());
    }
    public static ListaEnlazadaGenerica Preorder (ArbolBinario a, ListaEnlazadaGenerica l) {
        l.agregarInicio(a.getDato());
        if (a.tieneHijoIzquierdo()) {
            Preorder(a.getHijoIzquierdo(), l);
        }
        if (a.tieneHijoDerecho()) {
            Preorder(a.getHijoDerecho(), l);
        }
        return l;
    }
    public static ListaEnlazadaGenerica Inorder (ArbolBinario a, ListaEnlazadaGenerica l) {
        if (a.tieneHijoIzquierdo()) {
            Inorder(a.getHijoIzquierdo(), l);
        }
        l.agregarInicio(a.getDato());
        if (a.tieneHijoDerecho()) {
            Inorder(a.getHijoDerecho(), l);
        }
        return l;
    }
    public static ListaEnlazadaGenerica Posorder (ArbolBinario a, ListaEnlazadaGenerica l) {
        if (a.tieneHijoIzquierdo()) {
            Posorder(a.getHijoIzquierdo(), l);
        }
        if (a.tieneHijoDerecho()) {
            Posorder(a.getHijoDerecho(), l);
        }
        l.agregarInicio(a.getDato());
        return l;
    }
    
}
