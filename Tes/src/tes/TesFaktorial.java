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
public class TesFaktorial {
    public static void main(String[] args) {
        int angka = 5;
        int hasil = 1;
        for (int i = 1; i <= angka; i++) {
            hasil *= i;
        }
        System.out.println(hasil);
    }
}
