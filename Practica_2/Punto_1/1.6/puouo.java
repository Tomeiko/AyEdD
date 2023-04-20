/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Listas.ListaDeEnterosEnlazada;

/**
 *
 * @author Usuario
 */
public class puouo {
    
    private ListaDeEnterosEnlazada aux = new ListaDeEnterosEnlazada();
    
    public puouo () {
        
    }
    
    public ListaDeEnterosEnlazada ecuacion (int n) {
        aux.agregarInicio(n);
        if (n != 1) {
            if (n % 2 == 0) {
                n = n/2;
            }
            else {
                n = 3*n+1;
            }
            ecuacion (n);
        }
        return aux;
    }
}
