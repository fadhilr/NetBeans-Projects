/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;

import java.util.Scanner;


public class Tugas3 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan nilai n\t=");
        int n=input.nextInt(),x=1,y=((n-1)*6)-2;
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < x; j++) {
                System.out.print(" ");
            }
            x+=3;
            System.out.print("*");
            for (int j = y; j > 1; j--) {
                System.out.print(" ");
            }
            y-=6;
            System.out.print("*");
            System.out.println("");
        }
        for (int i = 0; i < x-2; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = n; i > 1; i--) {
            for (int j = x-4; j > 0; j--) {
                System.out.print(" ");
            }
            x-=3;
            System.out.print("*");
            for (int j = 0; j < y+5; j++) {
                System.out.print(" ");
            }
            y+=6;
            System.out.print("*");
            System.out.println("");
        }
        
    }
}
