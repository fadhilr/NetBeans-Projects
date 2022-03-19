/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utppemlan;

import java.util.Scanner;


public class MainUTP2 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        Scanner input1=new Scanner (System.in);
        UTP2 nasabah=new UTP2("Hamdalun","123456",10000000);
        int pilih=1;
        do {
            System.out.print("Masukkan password ATM : ");
            String pass=input1.nextLine();
            if (pass.equalsIgnoreCase("123456")) {
                pilih=4;
                String pil;
                do {
                    System.out.println("==========menu bank BRI============== ");
                    System.out.println("1. Informasi saldo");
                    System.out.println("2. Lakukan penarikan");
                    System.out.println("3. Lakukan transfer");
                    System.out.print("Masukkan pilihan anda : ");
                    int pil1=input.nextInt();
                    switch (pil1) {
                        case 1:
                            nasabah.infoSaldo();
                            break;
                        case 2:
                            System.out.print("Berapa banyak uang yang ingin ditarik = ");
                            int uang=input.nextInt();
                            System.out.println("Jumlah uang yang ditarik = "+uang);
                            System.out.println("Sisa saldo anda setelah penarikan = "+
                                    nasabah.penarikan(uang));
                            break;
                        case 3:
                            System.out.print("Masukkan nama bank : ");
                            String bank=input1.nextLine();
                            if (bank.equalsIgnoreCase("BRI")) {
                                System.out.print("Berapa banyak uang yang ingin ditransfer = ");
                                int uangb=input.nextInt();
                                nasabah.transfer(012334,uangb);
                            } else {
                                System.out.print("Berapa banyak uang yang ingin ditransfer = ");
                                int uangb=input.nextInt();
                                nasabah.transfer(012333, uangb, bank);
                            }
                            nasabah.display();
                        default:
                            throw new AssertionError();
                    }
                    System.out.print("Apakah anda ingin melanjutkan?(y/n) : ");
                    pil=input1.nextLine();
                } while (pil.equalsIgnoreCase("y"));
                
            } else {
                System.out.println("Password yang anda masukkan salah");
                pilih++;
            }
        } while (pilih<4);
    }
}
