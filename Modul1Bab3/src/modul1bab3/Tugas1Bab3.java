/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab3;

import java.util.Scanner;
public class Tugas1Bab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = input.nextInt();
        for (int i = n ; i >= 1 ; i--){
            for (int j = 1 ; j <= n ; j++){
                if(i > j)
                    System.out.print(" ");
                else 
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
