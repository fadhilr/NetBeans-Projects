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
public class TesFib {

    public static void main(String[] args) {
        int angkaKe = 6;
        int[] listFib = new int[angkaKe];
        int hasil = 0;
        if (angkaKe == 0) {
            hasil = angkaKe;
        } else if (angkaKe == 1) {
            hasil = angkaKe;
        } else {
            for (int i = 0; i < listFib.length; i++) {
                if (i == 0) {
                    listFib[i] = 0;
                }else if (i == 1) {
                    listFib[i] = 1;
                } else {
                    listFib[i] = listFib[i - 1] + listFib[i - 2];
                }
            }
            hasil = listFib[angkaKe - 1];
        }
        System.out.println(hasil);
    }
}
