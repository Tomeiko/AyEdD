/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practica;

import java.util.Scanner;
import Pilas_Colas.PilaGenerica;

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
        Scanner lector = new Scanner(System.in);
        String secuencia = lector.nextLine().replace(" ", "");
        System.out.println(balanceado(secuencia));
    }
    
    public static boolean balanceado (String secuencia) {
        int i = 0;
        boolean ok = true;
        PilaGenerica<Character> pila = new PilaGenerica<>();
        while (i < secuencia.length() && ok == true) {
            switch (secuencia.charAt(i)) {
                case ')':
                    ok = pila.desapilar().equals('(');
                    break;
                case ']':
                    ok = pila.desapilar().equals('[');
                    break;
                case '}':
                    ok = pila.desapilar().equals('{');
                    break;
                default:
                    pila.apilar(secuencia.charAt(i));
            }
            i++;
        }
        return ok;        
    }   
    
}
