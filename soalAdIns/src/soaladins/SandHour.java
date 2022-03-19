/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;

/**
 *
 * @author fadil
 */
public class SandHour {
    public static void main(String[] args) {
        int n = 5,
            half = n / 2;
        for (int i = 0; i < half; i++) {
            for (int j = 0; j < i; j++)         System.out.print(" ");
            for (int j = 0; j < n - 2 * i; j++) System.out.print("*");
            System.out.println("");
        }
        for (int i = n - half - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++)         System.out.print(" ");
            for (int j = 0; j < n - 2 * i; j++) System.out.print("*");
            System.out.println("");
        }
    }
}
