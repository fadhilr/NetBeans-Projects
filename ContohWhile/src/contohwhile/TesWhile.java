/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;

import java.util.Scanner;


public class TesWhile {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan nilai n\t=");
        int n=input.nextInt();
        n=(2*n)-1;
        int i=1;
        while (i<=n) {
            int j=1;
            while (j<=n) {
                System.out.print(j);
                
                j++;
                
            }
            System.out.println("");
            i++;
        }
    }
}
