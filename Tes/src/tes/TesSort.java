/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

/**
 *
 * @author ASUS
 */
public class TesSort {
    public static void main(String[] args) {
        int [] angka = {5,8,7,1,2};
        int temp=0;
        for (int i = 0; i < angka.length; i++) {
            for (int j = i+1; j < angka.length; j++) {
                if (angka[i]<angka[j]) {
                  temp = angka[i];
                  angka[i]= angka[j];
                  angka[j]=temp;
                } 
            }
            System.out.println(angka[i]);
        }
    }
}
