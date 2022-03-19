/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester1bab1;

import java.util.Scanner;


public class nomor1 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan operator pertama :\t");
        int angka1=input.nextInt();
        System.out.print("Masukkan operator kedua :\t");
        int angka2=input.nextInt();
        System.out.println("Hasil penjumlahan : \t"+penjumlahan(angka1,angka2));
        System.out.println("Hasil pengurangan : \t"+pengurangan(angka1,angka2));
        System.out.println("Hasil pembagian : \t"+pembagian(angka1,angka2));
        System.out.println("Hasil perkalian : \t"+perkalian(angka1,angka2));
    }
    public static int penjumlahan(int a,int b){
        int hasil;
        hasil= a+b;
        return hasil;            
    }
    public static int pengurangan(int a,int b){
        int hasil;
        hasil= a-b;
        return hasil;            
    }
    public static int perkalian(int a,int b){
        int hasil;
        hasil= a*b;
        return hasil;            
    }
    public static int pembagian(int a,int b){
        int hasil;
        hasil= a/b;
        return hasil;            
    }
    
    
}
