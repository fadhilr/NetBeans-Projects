/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab2;

import java.util.Scanner;

public class Tugas2Bab2 {
    public static void main(String[] args) {
        int berat;
        double tinggi, imt;
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan berat badan (kg)\t: ");
        berat= input.nextInt();
        System.out.print("Masukkan tinggi badan(m)\t: ");
        tinggi= input.nextDouble();
        
        imt= berat/(tinggi*tinggi);
        if (imt<=18.5) {
            System.out.printf("IMT = %.2f",imt);
            System.out.printf("%30s ", "Termasuk kurus\n");
            
        } else if (imt<=25) {
            System.out.printf("IMT = %.2f",imt);
            System.out.printf("%30s ", "Termasuk normal\n");
            
        } else if (imt<=30){
            System.out.printf("IMT = %.2f",imt);
            System.out.printf("%30s ", "Termasuk gemuk\n");
        } else{
            System.out.printf("IMT = %.2f",imt);
            System.out.printf("%30s ", "Termasuk kegemukan\n");
        } 

    }
}
