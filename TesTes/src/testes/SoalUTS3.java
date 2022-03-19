/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;


public class SoalUTS3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan jumlah hari kerja =");
        int harikerja=input.nextInt();
        int gaji= 75000;
        int lembur=0, gajibersih=0;
        if (harikerja<=5) {
            gajibersih=75000*harikerja;
            
        } else {
            gajibersih=75000*harikerja;
            lembur=(harikerja-5)*80000;
        }
        System.out.println("Jumlah hari kerja = "+harikerja);
        System.out.println("Lembur = "+lembur);
        System.out.println("Gaji bersih = "+gajibersih);
        
    }
}
