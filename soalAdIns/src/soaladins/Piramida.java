/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;

import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class Piramida {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Input: ");
        int tinggi = input.nextInt(); 
        for(int t=1; t<=tinggi; t++){
            for(int j=t; j<=tinggi; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=(t*2)-2; j++){
                System.out.print("*");
            }
            System.out.println(); //Membuat Baris Baru
        }
    }
}
