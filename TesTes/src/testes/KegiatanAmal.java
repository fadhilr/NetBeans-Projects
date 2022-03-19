/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class KegiatanAmal {
    public static void main(String[] args) {
        int harta; 
        double sumbang;
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan jumlah harta\t: Rp.");
        harta= input.nextInt();
        
        if (harta==500) {
            sumbang=100;
            System.out.printf("Harta yang disumbangkan\t: Rp.%.0f\n",sumbang);
        }else if (harta<=1000) {
            sumbang= harta*0.05;
            System.out.println("Harta yang disumbangkan\t: Rp."+(int)sumbang);
        }else if(harta<=5000){
            sumbang=harta*0.08;
            System.out.println("Harta yang disumbangkan\t: Rp."+(int)sumbang);
        }else if(harta>5000){
            sumbang= harta*0.1;
            System.out.println("Harta yang disumbangkan\t: Rp."+(int)sumbang);
        }
       
    }
}
