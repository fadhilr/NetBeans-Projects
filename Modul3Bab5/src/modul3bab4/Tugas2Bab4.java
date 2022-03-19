/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab4;

import java.util.Scanner;

public class Tugas2Bab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String data[][] = {{"Ekonomi", "50000", "2 %", "Tidak ada", "Tidak ada"},
        {"Bisnis", "100000", "5 %", "Ada", "Tidak ada"},
        {"Eksekutif", "200000", "7 %", "Ada", "ada"},
        {"Pariwisata", "300000", "10 %", "Ada", "Ada"}};
        int hargatot1 = 0, a = 1, pil;
        String pesan[] = null;
        do {
            System.out.println("1. Melihat daftar kereta api");
            System.out.println("2. Melihat daftar kereta api yang ada AC");
            System.out.println("3. Melihat daftar kereta api yang ada Colokan");
            System.out.println("4. Memesan kereta api");
            System.out.println("5. Melihat pesanan tiket");
            System.out.print("Masukkan nilai pilihan : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("|Jenis \t\t Harga \t\t   Diskon \t\t AC \t\t Colokan \t |");
                    System.out.println("------------------------------------------------------------------------------------------");
                    for (int i = 0; i < data.length; i++) {
                        for (int j = 0; j < data[i].length; j++) {
                            System.out.printf("|%-15s |", data[i][j]);
                        }
                        System.out.println("");
                    }
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("|Jenis \t\t Harga \t\t   Diskon \t\t AC \t\t Colokan \t |");
                    System.out.println("------------------------------------------------------------------------------------------");
                    for (int i = 0; i < data.length; i++) {
                        for (int j = 0; j < data[i].length; j++) {
                            if (data[i][3].equalsIgnoreCase("Ada")) {
                                System.out.printf("|%-15s |", data[i][j]);
                            }
                        }
                        System.out.println("");
                    }

                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("|Jenis \t\t Harga \t\t   Diskon \t\t AC \t\t Colokan \t |");
                    System.out.println("------------------------------------------------------------------------------------------");
                    for (int i = 0; i < data.length; i++) {
                        for (int j = 0; j < data[i].length; j++) {
                            if (data[i][4].equalsIgnoreCase("Ada")) {
                                System.out.printf("|%-15s |", data[i][j]);
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("");
                    System.out.println("------------------------------------------------------------------------------------------");
                    break;
                case 4:
                    System.out.print("Masukkan banyak tiket : ");
                    int n = input.nextInt();
                    pesan = new String[n];
                    for (int i = 0; i < pesan.length; i++) {
                        System.out.print("Masukkan jenis tiket ke-" + a + " = ");
                        pesan[i] = input1.nextLine();
                        a++;
                    }
                    System.out.println("");
                    break;
                case 5:
                    double harga[] = new double[pesan.length],
                     diskon[] = new double[pesan.length];
                    int hargatot[] = new int[pesan.length];
                    for (int i = 0; i < pesan.length; i++) {
                        if (pesan[i].equalsIgnoreCase("Ekonomi")) {
                            harga[i] = Double.valueOf(data[0][1]);
                            diskon[i] = Double.valueOf(data[0][2].replace("%", ""));
                            hargatot[i] = (int) (harga[i] - (harga[i] * (diskon[i] / 100)));
                            System.out.println("Harga pesanan tiket ekonomi= \t\t" + hargatot[i]);
                        } else if (pesan[i].equalsIgnoreCase("Bisnis")) {
                            harga[i] = Double.valueOf(data[1][1]);
                            diskon[i] = Double.valueOf(data[1][2].replace("%", ""));
                            hargatot[i] = (int) (harga[i] - (harga[i] * (diskon[i] / 100)));
                            System.out.println("Harga pesanan tiket bisnis= \t\t" + hargatot[i]);
                        } else if (pesan[i].equalsIgnoreCase("Eksekutif")) {
                            harga[i] = Double.valueOf(data[2][1]);
                            diskon[i] = Double.valueOf(data[2][2].replace("%", ""));
                            hargatot[i] = (int) (harga[i] - (harga[i] * (diskon[i] / 100)));
                            System.out.println("Harga pesanan tiket eksekutif= \t\t" + hargatot[i]);
                        } else if (pesan[i].equalsIgnoreCase("Pariwisata")) {
                            harga[i] = Double.valueOf(data[3][1]);
                            diskon[i] = Double.valueOf(data[3][2].replace("%", ""));
                            hargatot[i] = (int) (harga[i] - (harga[i] * (diskon[i] / 100)));
                            System.out.println("Harga pesanan tiket pariwisata= \t" + hargatot[i]);
                        }
                        hargatot1 += hargatot[i];
                    }
                    System.out.println("Harga total = \t" + hargatot1);
                    System.out.println("");
                    break;
            }
        } while (pil >= 1 && pil <= 5);
    }
}
