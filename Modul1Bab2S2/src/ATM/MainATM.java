/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.util.Scanner;

public class MainATM {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Atm user1 = new Atm();
        Atm user2 = new Atm(5000);
        int pin;

        String keluar = "n";
        do {
            boolean kode = false;
            System.out.println("===Selamat Datang Di ATM=== ");
            do {
                System.out.print("Masukkan PIN anda : ");
                pin = in.nextInt();
                if (pin == 555757) {
                    kode = true;
                }
                if (pin == 888323) {
                    kode = true;
                }
            } while (kode == false);
            if (pin == 555757) {
                keluar = "n";
                do {
                    System.out.println("======MENU======");
                    System.out.println("1. Melihat Saldo");
                    System.out.println("2. Menarik Uang");
                    System.out.println("3. Transfer");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan pilihan anda : ");
                    int pilih = in.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.println("Saldo anda Rp " + user1.saldo);
                            continue;
                        case 2:
                            user1.tarikTunai();
                            continue;
                        case 3:
                            user1.transfer(user2);
                            continue;
                        case 4:
                            keluar = "y";
                    }
                } while (keluar.equalsIgnoreCase("n"));
            }
            if (pin == 888323) {
                keluar = "n";
                do {
                    System.out.println("======MENU======");
                    System.out.println("1. Melihat Saldo");
                    System.out.println("2. Menarik Uang");
                    System.out.println("3. Transfer");
                    System.out.println("4. Keluar");
                    System.out.print("Masukkan pilihan anda : ");
                    int pilih = in.nextInt();
                    switch (pilih) {
                        case 1:
                            System.out.println("Saldo anda Rp " + user2.saldo);
                            continue;
                        case 2:
                            user2.tarikTunai();
                            continue;
                        case 3:
                            user2.transfer(user1);
                            continue;
                        case 4:
                            keluar = "y";
                    }
                } while (keluar.equalsIgnoreCase("n"));
            }
            System.out.print("Keluar dari ATM (y/n) : ");
            keluar = in.next();
        } while (keluar.equalsIgnoreCase("n"));
    }
}
