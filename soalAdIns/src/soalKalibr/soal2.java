/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalKalibr;

import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class soal2 {

    static String input = "1\n"
            + "2\n"
            + "3\n"
            + "ca";
    static int hasil = 0;

    public static void main(String[] args) {
        int t = 0;
        int a = 0;
        int b = 0;
        String k = "";

        Scanner in = new Scanner(input);
        t = in.nextInt();
        for (int i = 1; i <= t; i++) {
            a = in.nextInt();
            b = in.nextInt();
            k = in.next();
            char[] x = new char[k.length()];
            for (int j = 0; j < k.length(); j++) {
                x[j] = k.charAt(j);
            }

            char[][] val = new char[a][b];
            for (int j = 0; j < a; j++) {
                for (int l = 0; l < b; l++) {
                    char karakter = soal2.buatKarakterAcakVariasi('a', 'c');
                    System.out.print(karakter);
                    val[j][l] = karakter;
                }
                System.out.println("");
            }
            for (int j = 0; j < a; j++) {
                for (int l = 0; l < b; l++) {
                    for (int m = 0; m < k.length(); m++) {
                        soal2.cekSame(x[m], val[j][m], k.length());
                    }
                }
                System.out.println("");
            }

            System.out.println("Case " + i + ": " + hasil);

        }
    }

    public static int cekSame(int a, int b, int c) {
//        int nilai = 0;
        if (c != 0) {
            if (a == b) {
                c--;
                soal2.cekSame(a, b, c);
            }
        } else {
            hasil+=1;
        }

        return hasil;
    }

    public static char buatKarakterAcakVariasi(char dariChar, char keChar) {
        int unicode = dariChar + (int) ((keChar - dariChar + 1) * Math.random());
        return (char) unicode;
    }

    public static char buatKarakterAcakVariasi() {
        return buatKarakterAcakVariasi('a', 'c');
    }

}
