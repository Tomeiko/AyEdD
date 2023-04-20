/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Arboles.ArbolBinario;
import Listas.ListaDeEnterosEnlazada;
import Pilas_Colas.ColaGenerica;

/**
 *
 * @author Usuario
 */
public class RedBinariaLlena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(retardoReenvio());
    }
    
    public static int retardoReenvio() {
        ListaDeEnterosEnlazada lista = new ListaDeEnterosEnlazada();
        ArbolBinario<Integer> arbol = new ArbolBinario(3);
        arbol.agregarHijoIzquierdo(new ArbolBinario(4));
        arbol.agregarHijoDerecho(new ArbolBinario(7));
        arbol.getHijoIzquierdo().agregarHijoIzquierdo(new ArbolBinario(6));
        arbol.getHijoIzquierdo().agregarHijoDerecho(new ArbolBinario(1));
        arbol.getHijoDerecho().agregarHijoIzquierdo(new ArbolBinario(2));
        arbol.getHijoDerecho().agregarHijoDerecho(new ArbolBinario(5));
        ListaDeEnterosEnlazada lista2 = calculop(arbol, lista, 0);
        lista.comenzar();
        int max = 0;
        int aux;
        while (lista.fin() == false) {
            aux = lista.proximo();
            if (max < aux) {
                max = aux;
            }
        }
        return max;
    }

    public static ListaDeEnterosEnlazada calculop (ArbolBinario a, ListaDeEnterosEnlazada lista, int num) {
        ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<>();
        cola.encolar(a);   
        num += cola.desencolar().getDato();
        lista.agregarInicio(num);
        if (a.tieneHijoIzquierdo()) {
            calculop (a.getHijoIzquierdo(), lista, num);
        }
        if (a.tieneHijoDerecho()) {
            calculop (a.getHijoDerecho(), lista, num);
        }
        return lista;
    }
    
}
