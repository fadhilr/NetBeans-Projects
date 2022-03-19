/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author fadil
 */
public class GanjilGenap {
    public static void main(String[] args) {
        Random rd = new Random(); 
        String nilai[]= {"kuning","putih"};
//        System.out.println(nilai[1]);
//        System.out.println(rd.nextInt(2)); 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Input: ");
        int angka = input.nextInt();
        int hasil= angka%2;
        if (hasil==1) {
            System.out.println("output : kuning");
        }else{
            System.out.println("output : putih");
        }
    }
}
