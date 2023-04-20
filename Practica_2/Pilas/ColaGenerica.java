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
public class ColaGenerica<T> {
    
    private ListaEnlazadaGenerica<T> cola;
    
    public ColaGenerica () {
        cola = new ListaEnlazadaGenerica<>();
    }
    
    public void encolar(T elem) {
        cola.agregarFinal(elem);
    }
    
    public T desencolar () {
        if (cola.esVacia() == true) {
            return null;
        }
        else {
            cola.comenzar();
            T dato = cola.proximo();
            cola.eliminarEn(1);
            return dato;
        }
    }
    
    public T tope () {
        if (cola.esVacia() == true) {
            return null;
        }
        else {
            cola.comenzar();
            T dato = cola.proximo();
            return dato;
        }
    }
    
    public boolean esVacia () {
        return cola.esVacia();
    }
}
