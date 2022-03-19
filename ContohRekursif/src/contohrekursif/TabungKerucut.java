/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohrekursif;

import java.util.Scanner;


public class TabungKerucut {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan diameter= ");
        double diameter=input.nextDouble();
        System.out.print("Masukkan tinggi= ");
        double tinggi=input.nextInt();
        ganjilgenap(diameter,tinggi);
        
    }
    static void ganjilgenap(double diameter, double tinggi){
        if (diameter%2==1) {
            rumustabung(diameter,tinggi);
        } else {
            rumuskerucut(diameter,tinggi);
        }
    }
    static void rumustabung(double diameter, double tinggi){
        double tabung= 1.0/4*diameter*diameter*tinggi*3.14;
        System.out.println("Volume tabung= "+tabung);
    }
    static void rumuskerucut(double diameter, double tinggi){
        double kerucut= 1.0/3*1.0/4*diameter*3.14*tinggi;
        System.out.println("Volume kerucut= "+kerucut);
    }
    
}
