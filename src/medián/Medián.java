/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medián;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author david.lukes1
 */
public class Medián {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MAX = 100;
        int[] pole = new int[MAX];
        int pocet = 0;
        Scanner vstup = new Scanner(System.in);
        System.out.print("vlož číslo: ");
        int cislo = vstup.nextInt();
        while (cislo != 0) {
            pole[pocet++] = cislo;
            System.out.print("vlož číslo: ");
            cislo = vstup.nextInt();
        }
        Arrays.sort(pole,0,pocet);
        if (pocet%2 == 1) {
            //lichý počet prvků
            System.out.println("Medián: "+pole[pocet/2]);
        } else {
            //sudý počet prvků
            System.out.println("Medián: "+
                    (float) (pole[pocet/2]+pole[pocet/2-1])/2);
        }
        
    }
    
}
