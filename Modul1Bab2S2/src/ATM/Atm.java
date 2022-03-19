/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATM;

import java.util.Scanner;

public class Atm {

    int saldo;
    Scanner in = new Scanner(System.in);

    public Atm() {
        saldo = 5000000;
    }
    public Atm(int saldo) {
        this.saldo = saldo;
    }
    public void tarikTunai() {
        String keluar;
        do {
            System.out.println("1. Rp 50.000           4. Rp 500.000");
            System.out.println("2. Rp 100.000          5. Rp 750.000");
            System.out.println("3. Rp 250.000          6. Rp 1.000.000");
            System.out.print("Masukkan pilihan anda : ");
            int pilih = in.nextInt();
            switch (pilih) {
                case 1:
                    if (saldo >= 50000) {
                        saldo -= 50000;
                    } else {
                        System.out.println("Saldo anda tidak mencukupi");
                    }
                    break;
                case 2:
                    if (saldo >= 100000) {
                        saldo -= 100000;
                    } else {
                        System.out.println("Saldo anda tidak mencukupi");
                    }
                    break;
                case 3:
                    if (saldo >= 250000) {
                        saldo -= 250000;
                    } else {
                        System.out.println("Saldo anda tidak mencukupi");
                    }
                    break;
                case 4:
                    if (saldo >= 500000) {
                        saldo -= 500000;
                    } else {
                        System.out.println("Saldo anda tidak mencukupi");
                    }
                    break;
                case 5:
                    if (saldo >= 750000) {
                        saldo -= 750000;
                    } else {
                        System.out.println("Saldo anda tidak mencukupi");
                    }
                    break;
                case 6:
                    if (saldo >= 1000000) {
                        saldo -= 1000000;
                    } else {
                        System.out.println("Saldo anda tidak mencukupi");
                    }
                    break;
            }
            System.out.print("Tarik lagi ? (y/n) : ");
            keluar = in.next();
        } while (keluar.equalsIgnoreCase("y"));
    }

    public void transfer(Atm A) {
        String keluar;
        do {
            System.out.println("===Transfer===");
            System.out.print("Masukkan jumlah uang : Rp ");
            int uang = in.nextInt();
            if (saldo >= uang) {
                saldo -= uang;
                A.saldo += uang;
            } else {
                System.out.println("Saldo anda tidak mencukupi");
            }

            System.out.print("Transfer lagi ? (y/n) : ");
            keluar = in.next();
        } while (keluar.equalsIgnoreCase("y"));
    }
}
