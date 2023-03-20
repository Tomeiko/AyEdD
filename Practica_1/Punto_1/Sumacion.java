/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayedd;

/**
 *
 * @author Usuario
 */
public class Sumacion {
    
    public static void sumacion1 (int a, int b) {
        for (int i= a; i <= b; i++) {
            System.out.println(a);
            a++;
        }
    }
    public static void sumacion2 (int a, int b) {
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }
    public static void sumacion3 (int a, int b) {
        if (a <= b) {
            System.out.println(a);
            a++;
            Sumacion.sumacion3(a, b);
        }
    }
}
