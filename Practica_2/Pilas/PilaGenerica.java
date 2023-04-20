/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas_Colas;

import Listas.ListaEnlazadaGenerica;

/**
 *
 * @author Usuario
 * @param <T>
 */
public class PilaGenerica<T> {
    
    private ListaEnlazadaGenerica<T> pila;
    
    public PilaGenerica () {
        pila = new ListaEnlazadaGenerica<>();
    }
    
    public void apilar (T elem) {
        pila.agregarInicio(elem);
    }
    
    public T desapilar () {
        if (pila.esVacia() == true) {
            return null;
        }
        else {
            pila.comenzar();
            T dato = pila.proximo();
            pila.eliminarEn(1);
            return dato;
        }
    }
    
    public T tope () {
        if (pila.esVacia() == true) {
            return null;
        }
        else {
            pila.comenzar();
            T dato = pila.proximo();
            return dato;
        }
    }
    
    public boolean esVacia() {
        boolean ok = pila.esVacia();
        return ok;
    }
}
