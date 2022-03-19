/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukuAlamat;

import java.util.Scanner;
public class MainBuku {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        Scanner input1=new Scanner (System.in);
        BukuAlamat objek=new BukuAlamat();
        String pilih,lanjut;
        do{
        System.out.println("==============Menu Buku Alamat==============");
        System.out.println("1. Input data buku");
        System.out.println("2. Lihat data buku");
        System.out.print(" Masukkan pilihan anda : ");
        int pil=input1.nextInt();
            switch (pil) {
                case 1:
                    System.out.println("============Input Data=============");
                    do{
                    System.out.print("Masukkan nama lengkap : ");
                    String nama=input.nextLine();
                    System.out.print("Masukkan alamat lengkap : ");
                    String alamat=input.nextLine();
                    System.out.print("Masukkan nomor telepon  : ");
                    long telepon=input1.nextLong();
                    System.out.print("Masukkan alamat E-mail : ");
                    String email=input.nextLine();
                    objek.setDataBuku(nama, alamat, telepon, email);
                    System.out.println("-------------------------------");
                    System.out.print("Apakah anda ingin lanjut input data?(y/n) : ");
                    lanjut=input.nextLine();
                    }while(lanjut.equalsIgnoreCase("y"));
                    break;
                case 2:
                    System.out.println("==============Lihat Data============");
                    for (int i = 0; i < BukuAlamat.nama.size(); i++) {
                        System.out.println("Nama Lengkap : "+objek.getNama().get(i));
                        System.out.println("Alamat Lengkap : "+objek.getAlamat().get(i));
                        System.out.println("Nomor Telepon : "+objek.getNotelp().get(i));
                        System.out.println("Alamat Email : "+objek.getEmail().get(i));
                        System.out.println("---------------------------------");
                    }
                    break;
                default:
                    break;
            }
        System.out.print("Apakah anda ingin melanjutkan?(y/n) : ");
        pilih=input.nextLine();
        }while(pilih.equalsIgnoreCase("y"));
    }
}
