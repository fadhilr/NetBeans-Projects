/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP2;

import java.util.Scanner;

public class Login {
    private static String id;
    public Login(String a){
        id=a;
    }
    public static void login(){
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("masukkan Nama\t\t=");
        String pass=input.nextLine();
        
            String pil1="y";
            do{
            System.out.println("==========================");
            System.out.println("Menu bagi Petugas Perpus :");
            System.out.println("1. input nama mahasiswa");
            System.out.println("2. input data buku");
            System.out.println("3. transaksi pinjam buku");
            System.out.println("4. lihat daftar anggota");
            System.out.println("5. lihat daftar buku");
            System.out.println("6. lihat transaksi pinjam buku");
            System.out.println("===========================");
            System.out.print("Masukkan pilihan anda : ");
            int pil=input.nextInt();
            System.out.println("===========================");
            switch (pil) {
                case 1:
                    DaftarAnggota.inputAnggota();
                    break;
                case 2:
                    DaftarBuku.inputBuku();
                    break;
                case 3:
                    DaftarBuku.pinjamBuku();
                    break;
                case 4:
                    DaftarAnggota.lihatAnggota();
                    break;
                case 5:
                    DaftarBuku.lihatBuku();
                    break;
                case 6:
                    DaftarBuku.lihatPinjamBuku();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
                System.out.print("apakah anda ingin melanjutkan?(y/n)");
                pil1=input1.nextLine();
            }while (pil1.equalsIgnoreCase("y"));
        
    }
}
