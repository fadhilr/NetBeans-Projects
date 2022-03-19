/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        MakhlukHidup ayam= new MakhlukHidup();
        System.out.print("Masukkan angka yang diinginkan = ");
        int a=input.nextInt();
        ayam.bergerak(a);
    }
    
    
    
}
