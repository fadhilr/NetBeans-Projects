/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

import java.util.Scanner;


public class LatihanMatriksPersegi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan ordo baris :");
        int m=input.nextInt();
        System.out.print("Masukkan ordo kolom :");
        int n=input.nextInt();
        System.out.println("Ordo "+m+"x"+n);
        int matriks[][]=new int [m][n];
        System.out.println("Masukkan nilai ");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print("Matriks ["+i+"] ["+j+"] =");
                matriks[i][j]=input.nextInt();  
            }
        }
        System.out.println("=======================");
        System.out.println("Bentuk matriksnya :");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                if (matriks[i][j]>9) {
                    System.out.print("  "+matriks[i][j]);
                } else {
                    System.out.print("   "+matriks[i][j]);
                }
            }
            System.out.println("");
        }

    }
}
