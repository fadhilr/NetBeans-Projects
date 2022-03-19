/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

import java.util.Scanner;

public class RekeningBank {
    static int no=0;
    String nama,password;
    double saldo;
    public RekeningBank(int no, String nama, String password, double saldo){
        this.no=no;
        this.nama=nama;
        this.password=password;
        this.saldo=saldo;
    }

    public int getNo() {
        return no;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public double getSaldo() {
        return saldo;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        RekeningBank mhs1 = null;
        SingleLinkedList l=new SingleLinkedList();
        String pil="y";
        do {
        System.out.println("1. Buat Rekening");
        System.out.println("2. Login Rekening");
        System.out.print("Masukkan pilihan anda = ");
        int pilih=input.nextInt();
            switch (pilih) {
            case 1:
                System.out.println("Membuat Rekening :");
                System.out.print("Masukkan nama = ");
                String nama=input1.nextLine();
                System.out.print("Masukkan password = ");
                String pass=input1.nextLine();
                System.out.print("Masukkan saldo = ");
                double saldo=input.nextDouble(); 
                mhs1 = new RekeningBank((no+1), nama, pass,saldo);  
                no++;
                break;
            case 2:
                System.out.println("Login Rekening");
                System.out.print("Masukkan nama rekening = ");
                String nama1=input1.nextLine();
                System.out.print("Masukkan password rekening = ");
                String pass1=input1.nextLine();
                if (mhs1.nama.equalsIgnoreCase(nama1)&&mhs1.password.equalsIgnoreCase(pass1)) {
                    System.out.println("1. Setor uang");
                    System.out.println("2. Tarik uang");
                    System.out.println("3. Logout");
                    int pilihan=input.nextInt();
                    switch (pilihan) {
                        case 1:
                            System.out.print("Masukkan jumlah setoran = ");
                            double setor=input.nextInt();
                            mhs1.saldo+=setor;
                            System.out.println("Uang anda sekarang = "+mhs1.saldo);
                            break;
                        case 2:
                            System.out.print("Masukkan jumlah tarikan = ");
                            int tarik=input.nextInt();
                            mhs1.saldo-=tarik;
                            System.out.println("Uang anda sekarang = "+mhs1.saldo);
                            break;
                        default:
                            throw new AssertionError();
                    }
                } else {
                    System.out.println("Nama dan password yang dimasukkan salah");
                }break;
            
        }
            System.out.print("apakah anda ingin melanjutkan?(y/n) ");
            pil=input1.nextLine();
        } while (pil.equalsIgnoreCase("y"));     
    }
}
