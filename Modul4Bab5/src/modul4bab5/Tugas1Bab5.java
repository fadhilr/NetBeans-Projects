/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4bab5;

import java.util.Scanner;

public class Tugas1Bab5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 1;
        int pil1;
        do {
            System.out.println("Program Pengghitung Kombinasi dan Permutasi");
            System.out.println("1. menghitung permutasi");
            System.out.println("2. menghitung kombinasi");
            System.out.println("3. keluar");
            System.out.print("Masukkan pilihan anda : ");
            pil1 = input.nextInt();

            switch (pil1) {
                case 1:
                    System.out.print("Masukkan nilai n : ");
                    int n = input.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    int r = input.nextInt();
                    System.out.println("        n ");
                    System.out.println("nPr = ----- = " + permutasi(n, r));
                    System.out.println("      (n-r)!");
                    break;
                case 2:
                    System.out.print("Masukkan nilai n : ");
                    int n1 = input.nextInt();
                    System.out.print("Masukkan nilai r : ");
                    int r1 = input.nextInt();
                    System.out.println("          n ");
                    System.out.println("nPr = ----------- = " + kombinasi(n1,r1));
                    System.out.println("      (n-r)!x r!");
                    break;
            }
            i++;
        } while (pil1 != 3);
    }

    static int permutasi(int n, int r) {
        int c = n - r;
        int hasilp = faktorial(n) / (faktorial(c));
        return hasilp;
    }

    static int kombinasi(int n, int r) {
        int c1 = n - r;
        int hasilk = faktorial(n) / (faktorial(c1) * faktorial(r));
        return hasilk;
    }

    static int faktorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return (n * faktorial(n - 1));
        }
    }
}
