/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab2;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("masukkan nilai : ");
    int nilai = in.nextInt();
        if (nilai > 60)
    System.out.println("Anda lulus");
        else if (nilai >= 40)
    System.out.println("Anda harus mengulang !");
        else{
    System.out.println("Anda gagal");
       }
    }
}
