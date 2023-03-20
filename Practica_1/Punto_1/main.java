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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sumacion1(1, 10);
        sumacion2(5, 10);
        sumacion3(7, 10);
    }

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
            sumacion3(a, b);
        }
    }
    
}
