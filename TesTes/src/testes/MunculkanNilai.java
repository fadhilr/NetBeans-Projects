/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

public class MunculkanNilai {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan angka\t:");
        int angka= input.nextInt();
        int batas=0;
        for (int i = 0; i <= angka; i++) {
            if (batas>9) {
                batas=0;
            }
            System.out.print(batas);
            batas++;
        }
        
        
    }
   
}
