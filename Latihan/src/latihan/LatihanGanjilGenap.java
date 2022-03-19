/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;


public class LatihanGanjilGenap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai yang diinginkan=");
        int a=input.nextInt();
        ganjilgenap(a); 
    }
    static String ganjilgenap(int a){
        String z= "ganjil";
        if (a%2==1) {
            System.out.println("nilai yang dimasukkan="+z);
        } else {
            System.out.println("nilai yang dimasukkan=genap");
        }
        return z;
                
    }
}
