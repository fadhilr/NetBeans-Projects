/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab2;

import java.util.Scanner;

public class Tugas3Bab2 {
    public static void main(String[] args) {
        int jmlhjmkrja,selisihl, selisihd;
        Scanner input=new Scanner (System.in);
        System.out.print("Jam kerja\t:");
        jmlhjmkrja=input.nextInt();
        int upah=0, 
            denda=0, 
            lembur=0; 
        if (jmlhjmkrja>60) {
            selisihl= jmlhjmkrja-60;
            upah= 60*5000;
            System.out.println("Upah\t\t=Rp. "+upah);
            lembur= 6000*selisihl;
            System.out.println("Lembur\t\t=Rp. "+lembur);
            System.out.println("Denda\t\t=Rp. "+denda);
            
        } else if (jmlhjmkrja>=50) {
            upah= jmlhjmkrja*5000;
            System.out.println("Upah\t\t=Rp. "+upah);
            System.out.println("Lembur\t\t=Rp. "+lembur);
            System.out.println("Denda\t\t=Rp. "+denda);
            
        } else {
            upah= jmlhjmkrja*5000;
            System.out.println("Upah\t\t=Rp. "+upah);
            System.out.println("Lembur\t\t=Rp. "+lembur);
            selisihd=50-jmlhjmkrja;
            denda=1000*selisihd;
            System.out.println("Denda\t\t=Rp. "+denda);
        }
        System.out.println("---------------------------");
        System.out.println("Total upah\t=Rp. "+(upah+lembur+denda));

    }
}
