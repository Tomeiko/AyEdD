/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Listas.ListaDeEnterosConArreglos;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Punto_1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaDeEnterosConArreglos lista = new ListaDeEnterosConArreglos ();
        Scanner lector = new Scanner(System.in);
        System.out.print("LEER NUMERO A AGREGAR: ");
        int aux = lector.nextInt();
        while (aux != -1) {
            lista.agregarInicio(aux);
            System.out.print("LEER NUMERO A AGREGAR: ");
            aux = lector.nextInt();
        }
        System.out.println("\n" + "EMPIEZA LA LISTA" + "\n");
        System.out.println(lista.toString());
        System.out.println("TERMINA LA LISTA");
        
        System.out.println("\n" + "EMPIEZA LA LISTA" + "\n");
        toStringInvertido(lista, 100);
        System.out.println("TERMINA LA LISTA");
    }

        public static void toStringInvertido (ListaDeEnterosConArreglos lista, int pos) {
            if (pos > 0) {
                pos--;
                if (lista.getdatos(pos) != -99999999) {
                    System.out.println(lista.getdatos(pos));
                }      
                toStringInvertido(lista, pos);
            }
        }   
}
