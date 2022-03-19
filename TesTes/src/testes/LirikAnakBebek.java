/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

public class LirikAnakBebek {
    public static void main(String[] args) {
        int x,b=0,i;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan anak bebek\t:");
        x=input.nextInt();
        
        for (i = x; i >=b;i-- ) {
            for ( b = 1; i >=b ; b++) {
                System.out.println("Anak bebek turun "+i+" hilang "+b+" tinggal "+(i-b));
                i-=b;
            }
         
                System.out.println("anak bebek turun "+i+" hilang "+i+" tinggal induknya");
 
            
        }
    }
   
}
