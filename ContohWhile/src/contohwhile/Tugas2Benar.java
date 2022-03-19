/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;

import java.util.Scanner;


public class Tugas2Benar {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan nilai n=");
        int n=input.nextInt();
        int x;
        for (int i = 1; i <= n; i++) {
            if (i==(n+2)/2) {
                for (int j = 1; j <= n; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
                continue;
            }
            
                for (int j = 1; j <= n/2; j++) {
                    if (j<=9) {
                        System.out.print("  ");
                    } else {
                        System.out.print("   ");
                    }
                    
                }
                System.out.println(i);
         
        }
    }
}
