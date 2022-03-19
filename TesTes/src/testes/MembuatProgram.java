/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;


public class MembuatProgram {
    public static void main(String[] args) {
        int angka;
        Scanner input= new Scanner(System.in);
        int pilih;
        String ulang;
        do {
            System.out.println("1. amsamsk");
            System.out.println("2. amsamsk");
            System.out.println("3. amsamsk");
            System.out.println("4. amsamsk");
            System.out.print("Masukkan pilihan anda: ");
            pilih=input.nextInt();
            
            switch (pilih) {
                case 1:
                    
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.print("Apakah anda ingin melanjutkan(y/n) :");
            ulang= input.nextLine();
            
        } while (ulang.equalsIgnoreCase("y"));
        
    }
    
    
}
