/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;

import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class SegitigaTerbalik {
    public static void main(String[] args) {
        //Segitiga terbalik
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan tinggi: ");
        int angka = input.nextInt();
        for (int i = angka; i >= 1; i--) {
            
            for (int j=angka; j>i; j--) {
                System.out.print("O");
            }
            
            for (int m=1; m<i*2 ; m++) {
                System.out.print("X");
            }
            for (int j=i; j<angka; j++) {
                System.out.print("O");
            }
            
            System.out.println("");
        }
    }
}
