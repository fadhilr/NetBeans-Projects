/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;


public class SoalUTS2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai kuis =");
        int kuis=input.nextInt();
        System.out.print("Masukkan nilai uas =");
        int uas=input.nextInt();
        System.out.print("Masukkan nilai tugas =");
        int tugas=input.nextInt();
        int nilaiakhir=0;
        
        if (kuis>uas) {
            nilaiakhir=(int) ((0.4*kuis)+(0.4*uas)+(0.2*tugas));
            
        } else  {
            nilaiakhir=(int) ((0.3*kuis)+(0.5*uas)+(0.2*tugas));
        } 
        if (nilaiakhir>=85 && nilaiakhir<=100) {
            System.out.println("Nilai akhir ="+nilaiakhir);
            System.out.println("Nilai huruf =A");
            System.out.println("Hasil =LULUS");
        } else if (nilaiakhir>=75) {
            System.out.println("Nilai akhir ="+nilaiakhir);
            System.out.println("Nilai huruf =B");
            System.out.println("Hasil =LULUS");
        } else if (nilaiakhir>=65) {
            System.out.println("Nilai akhir ="+nilaiakhir);
            System.out.println("Nilai huruf =C");
            System.out.println("Hasil =LULUS");
        } else if (nilaiakhir>=50) {
            System.out.println("Nilai akhir ="+nilaiakhir);
            System.out.println("Nilai huruf =D");
            System.out.println("Hasil =PERBAIKAN");
        } else  {
            System.out.println("Nilai akhir ="+nilaiakhir);
            System.out.println("Nilai huruf =E");
            System.out.println("Hasil =MENGULANG");
        } 
       
        
        
    }
}
