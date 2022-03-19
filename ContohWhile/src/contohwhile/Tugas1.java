/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;

import java.util.Scanner;

class Tugas1 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan nilai n\t=");
        int n=input.nextInt();
        
//        int i=1;
//        while (i<=n) {
//            int j=i;
//            while (j<=n) {
//                System.out.print(" ");
//                j++;
//            }
//            int k=1;
//            while (k<=(2*i)-1) {
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();
//            i++;
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = i;j <= n; j++) {
                System.out.print(" ");
                
            }
            for (int k = 1; k <= (2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
}
