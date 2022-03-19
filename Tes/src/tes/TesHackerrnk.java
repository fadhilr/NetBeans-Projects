/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class TesHackerrnk {

    public static void main(String[] args) {
        int kk = 5;
        String ss = "aaeesss";
        System.out.println(substringTes(ss, kk));
    }

    public static String substringTes(String s, int k) {
        String hasil = "";
        int possible = (s.length() - k) + 1;
//        ArrayList<String> kata = new ArrayList<String>();

        int max = 0;
        if (s.length() >= k) {
            String[][] kata = new String[possible][k];
            int[] nilai = new int[possible];
            for (int i = 0; i < possible; i++) {
//                nilai[i] = 0;
                int count = 0;
                for (int j = i; j < k + i; j++) {
                    //isi data kata[][] menjadi substring sesuai inputan
                    kata[i][count] = String.valueOf(s.charAt(j));
                    count++;
                    if (s.charAt(j) == 'a' || s.charAt(j) == 'i' || s.charAt(j) == 'u' || s.charAt(j) == 'e' || s.charAt(j) == 'o') {
                        nilai[i] += 1;
                    }
                }
                for (int j = 1; j < possible; j++) {
                    if (nilai[i] > nilai[j]) {
                        max = nilai[i];
                    }
                }
            }

            if (max == 0) {
                hasil = "Tidak ada vowels";
            } else {
                for (int i = 0; i < nilai.length; i++) {
                    if (nilai[i] == max) {
                        max = i;
                    }
                }
                for (int i = 0; i < kata[max].length; i++) {
                    hasil += kata[max][i];
                }
            }

        } else {
            hasil = "Jumlah karakter tidak valid";
        }
        return hasil;
    }
}
