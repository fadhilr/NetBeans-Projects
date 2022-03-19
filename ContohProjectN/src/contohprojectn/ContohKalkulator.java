/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohprojectn;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class ContohKalkulator {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        System.out.print("data yg dimasukkan:"); 
        int a=scanner.nextInt();
        System.out.print("data yg lain:"); 
        int b=scanner.nextInt();
        int bagi, kali, jumlah, kurang;
        bagi=a/b; kali=a*b; jumlah=a+b; kurang=a-b;
        System.out.println("pembagian :"+bagi);
        System.out.println("perkalian :"+kali);
        System.out.println("penjumlahan :"+jumlah);
        System.out.println("pengurangan :"+kurang);
        
    }
}
