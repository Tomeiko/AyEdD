/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import Listas.ListaDeEnterosEnlazada;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Main {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.print("Numero: ");
        int aux = scn.nextInt();
        System.out.println("\n");
        puouo e = new puouo();
        ListaDeEnterosEnlazada l = e.ecuacion(aux);
        System.out.println("Comienza \n");
        System.out.println(l.toString());
        System.out.println("Finaliza");

    }
}
