/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class Bab1Praktikum1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        double a, b, tambah, kurang, kali, bagi;
        System.out.print("masukkan operator pertama \t :");
        a= scanner.nextInt ();
        System.out.print("masukkan operator kedua\t\t :");
        b= scanner.nextInt();
        tambah= a+b;
        kurang= a-b;
        kali= a*b;
        bagi= a/b;
        System.out.println("hasil penjumlahan\t\t :"+tambah+"\b\b");
        System.out.println("hasil pengurangan\t\t :"+kurang+"\b\b");
        System.out.println("hasil perkalian\t\t\t :"+kali+"\b\b");
        System.out.println("hasil pembagian\t\t\t :"+bagi);
        
           
    }
}
