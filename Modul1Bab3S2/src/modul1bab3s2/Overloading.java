/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab3s2;

import java.util.Scanner;
public class Overloading {
    public static void HitungLuas(int a, int b) {
        int nilai = a * b;
        System.out.println("maka hasil luas : " + nilai);
    }
    public static void HitungLuas(double value, double value2) {
        double nilai = value * value2;
        System.out.println("Maka  hasil  luas  : " + nilai);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai integer 1 : ");
        int integer1 = in.nextInt();
        System.out.print("masukkan nilai integer 2 : ");
        int integer2 = in.nextInt();
        HitungLuas(integer1, integer2);
        System.out.print("masukkan nilai double 1 : ");
        double double1 = in.nextDouble();
        System.out.print("masukkan nilai double 2 : ");
        double double2 = in.nextDouble();
        HitungLuas(double1, double2);
    }
}
