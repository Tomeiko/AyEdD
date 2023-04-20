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
public class ProfundidadDeArbolBinario {
    
    private ArbolBinario<Integer> arbol;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int profundidad = 2;
        System.out.println(sumaElementosProfundidad(profundidad));
    }
    
    public static int sumaElementosProfundidad (int p) {
        ListaDeEnterosEnlazada l = new ListaDeEnterosEnlazada();
        ArbolBinario<Integer> arbol = new ArbolBinario(3);
        arbol.agregarHijoIzquierdo(new ArbolBinario(4));
        arbol.agregarHijoDerecho(new ArbolBinario(7));
        arbol.getHijoIzquierdo().agregarHijoIzquierdo(new ArbolBinario(6));
        arbol.getHijoIzquierdo().agregarHijoDerecho(new ArbolBinario(1));
        arbol.getHijoDerecho().agregarHijoIzquierdo(new ArbolBinario(2));
        arbol.getHijoDerecho().agregarHijoDerecho(new ArbolBinario(5));
        ListaDeEnterosEnlazada l2 = calculo(arbol, -1, p, l);
        l2.comenzar();
        int total = 0;
        while (l2.fin() == false) {
            total += l2.proximo();
        }
        return total;
    }
    
    public static ListaDeEnterosEnlazada calculo (ArbolBinario a, int nivel, int p, ListaDeEnterosEnlazada l) {
        nivel += 1;
        if (nivel < p) {
            if (a.tieneHijoIzquierdo()) {
                calculo(a.getHijoIzquierdo(), nivel, p, l);
            }
            if (a.tieneHijoDerecho()) {
                calculo(a.getHijoDerecho(), nivel, p, l);
            }
        }
        if (nivel == p) {
            int num;
            ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<>();
            cola.encolar(a); 
            num = cola.desencolar().getDato();
            l.agregarInicio(num);
        }
        return l;
    }
    
}
