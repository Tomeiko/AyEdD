/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AYED;

/**
 *
 * @author Usuario
 */

import java.util.Scanner;

public class TestListaDeEnterosConArreglos {

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
    }
}