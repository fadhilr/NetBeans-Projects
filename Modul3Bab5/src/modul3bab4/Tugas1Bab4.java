/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul3bab4;

import java.util.Scanner;

public class Tugas1Bab4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pil;
        int data[] = null;
        int a = 1, b = 1, c = 1;
        do {
            System.out.println("------Menu------");
            System.out.println("1. Input data");
            System.out.println("2. Lihat data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("7. Keluar");
            System.out.print("Masukkan nilai : ");
            pil = input.nextInt();
            switch (pil) {
                case 1:
                    System.out.print("Masukkan banyak data : ");
                    int n = input.nextInt();
                    data = new int[n];
                    for (int i = 0; i < data.length; i++) {
                        System.out.print("Masukkan data " + a + " = ");
                        data[i] = input.nextInt();
                        a++;
                    }
                    break;
                case 2:
                    for (int i = 0; i < data.length; i++) {
                        System.out.println("Data ke- " + b + "anda = " + data[i]);
                        b++;
                    }
                    break;
                case 3:
                    int average = 0;
                    for (int i = 0; i < data.length; i++) {
                        average = average + data[i];
                    }
                    System.out.println("Rata-ratanya = " + average / data.length);

                    break;
                case 4:
                    int sum = 0;
                    for (int i = 0; i < data.length; i++) {
                        sum += sum + data[i];
                    }
                    System.out.println("SUM : " + sum);
                    break;
                case 5:
                    int max = data[0];
                    for (int i = 1; i < data.length; i++) {
                        if (max < data[i]) {
                            max = data[i];
                        }
                    }
                    System.out.println("Nilai MAX : " + max);
                    break;
                case 6:
                    int min = data[0];
                    for (int i = 1; i < data.length; i++) {
                        if (min > data[i]) {
                            min = data[i];
                        }
                    }
                    System.out.println("Nilai MIN : " + min);
                    break;
            }
        } while (pil != 7);
    }
}
