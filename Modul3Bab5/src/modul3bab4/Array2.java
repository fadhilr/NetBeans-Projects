/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab4;

import java.util.Scanner;

public class Array2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String nama[] = new String[10];
        int coba[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        double[][] bank = new double[2][3];
        System.out.println(" i j coba[i][j]");
        int i, j;
        double nilaiRata2 = 0, nilaiMax = bank[0][0], nilaiMin = bank[0][0];
        for (int k = 0; k < coba.length; k++) {
            for (int l = 0; l < coba[k].length; l++) {
                nilaiRata2 += coba[k][l];
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 3; j++) {
                System.out.printf("%2d %2d %3d\n", i, j, coba[i][j]);
            }
        }
        for (i = 0; i <= 1; i++) {
            for (j = 0; j < 3; j++) {
                bank[i][j] = i * 0.5 + j * 0.25;
            }
        }
        for (i = 0; i <= 1; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(bank[i][j] + " ");
            }
        }System.out.println("");
        for (int k = 0; k < bank.length; k++) {
            for (int l = 0; l < bank[0].length; l++) {
                if (nilaiMin > bank[k][l]) {
                    nilaiMin = bank[k][l];
                }
            }
        }
        for (int k = 0; k < bank.length; k++) {
            for (int l = 0; l < bank[0].length; l++) {
                if (nilaiMax < bank[k][l]) {
                    nilaiMax = bank[k][l];
                }
            }
        }
        System.out.println("MAX = " + nilaiMax);
        System.out.println("MIN = " + nilaiMin);
          System.out.println("Rata-rata : " + nilaiRata2 / (coba.length * coba[0].length));
    }
}
