/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab2;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class Tugas1Bab2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int pilihan , panjang,lebar,alas,jari2,a,b,c,luasP,kelP;
        double luasL,kelL,luasS,kelS,s;
        final double pi=3.14;
        
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. menghitung luas dan keliling segitiga");
        System.out.print("pilihan anda\t:");
        pilihan= input.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.print("Masukkan panjang\t:");
                panjang= input.nextInt();
                System.out.print("Masukkan lebar\t\t:");
                lebar=input.nextInt();
                kelP= 2*panjang+2*lebar;
                System.out.println("Keliling persegi panjang\t:"+kelP+"cm");
                luasP= panjang*lebar;
                System.out.println("Luas persegi panjang\t\t:"+luasP+"cm2");
                break;
            case 2:
                System.out.print("Masukkan jari-jari\t:");
                jari2= input.nextInt();
                kelL= pi*2*jari2;
                System.out.printf("Keliling lingkaran\t: %.2f cm\n",kelL);
                luasL=pi*jari2*jari2;
                System.out.printf("Luas lingkaran\t\t: %.2f cm2\n",luasL);
                break;
            case 3:
                System.out.print("Masukkan sisi a\t:");
                a= input.nextInt();
                System.out.print("Masukkan sisi b\t:");
                b=input.nextInt();
                System.out.print("Masukkan sisi c\t:");
                c=input.nextInt();
                kelS= a+b+c;
                s= kelS/2;
                luasS= Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.printf("Keliling segitiga\t: %.2f cm\n",kelS);
                System.out.printf("Luas segitiga\t\t: %.2f cm2\n",luasS);
                break;
            default :
                System.out.println("Data tak ditemukan, program dihentikan...");
                
            
        }
    }
    
}
