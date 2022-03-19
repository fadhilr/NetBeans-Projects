/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDoubleLinkedList;

import java.util.Scanner;

public class Mahasiswa {
    private String nama, NIM;
    private double IPK;

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return NIM;
    }

    public double getIPK() {
        return IPK;
    } 

    public Mahasiswa(String nama, String NIM, double IPK) {
        this.nama = nama; this.NIM = NIM; this.IPK = IPK;
    }
    
    public static void main(String[] args) {
        int pilih; double IPK;
        DoubleLinkedList data = new DoubleLinkedList();
        Scanner masukan = new Scanner(System.in);
        do {
            System.out.println(" ");
            System.out.println("Masukkan pilihan anda :");
            System.out.println("1. Masukkan data di depan ");
            System.out.println("2. Masukkan data di akhir");
            System.out.println("3. Masukkan data urut");
            System.out.println("4. Hapus data");
            System.out.println("5. Keluar");
            System.out.print("Jawab : ");
            pilih = masukan.nextInt();
            System.out.println(" ");
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan data ");
                    System.out.print("Nama  : ");
                    String nama = masukan.next();
                    System.out.print("NIM   : ");
                    String NIM = masukan.next();
                    System.out.print("IPK   : ");
                    IPK = masukan.nextDouble();
               Mahasiswa m1 = new Mahasiswa(nama, NIM, IPK);
                    data.sisipDiAwal(m1);
                    System.out.println(" ");
                    System.out.println("------------------");
                    data.cetak("Data mahasiswa\n");
                    System.out.println("------------------");
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("Masukkan data ");
                    System.out.print("Nama  : ");
                    nama = masukan.next();
                    System.out.print("NIM   : ");
                    NIM = masukan.next();
                    System.out.print("IPK   : ");
                    IPK = masukan.nextDouble();
               Mahasiswa m2 = new Mahasiswa(nama, NIM, IPK);
                    data.sisipDiAkhir(m2);
                    System.out.println(" ");
                    System.out.println("------------------");
                    data.cetak("Data mahasiswa\n");
                    System.out.println("------------------");
                    break;

                case 3:
                    System.out.println("Masukkan data ");
                    System.out.print("Nama  : ");
                    nama = masukan.next();
                    System.out.print("NIM   : ");
                    NIM = masukan.next();
                    System.out.print("IPK   : ");
                    IPK = masukan.nextDouble();
               Mahasiswa m3 = new Mahasiswa(nama, NIM, IPK);
                    data.sisipDataUrut(m3);
                    System.out.println(" ");
                    System.out.println("-------------------");
                    data.cetak("Data mahasiswa\n");
                    System.out.println("------------------");
                    break;

                case 4:
      System.out.print("Masukkan NIM yang ingin dihapus : ");
                    NIM = masukan.next();
                    data.hapusData(NIM);
                    System.out.println(" ");
                    System.out.println("------------------");
                    data.cetak("Data mahasiswa\n");
                    System.out.println("------------------");
                    break;

                case 5:
          System.out.println("Tampilan DLL Data Mahasiswa");
                    System.out.println("------------------");
                    data.cetak("Data mahasiswa\n");
                    System.out.println("------------------");
                    break;   
            }
        } while (pilih != 6);
    }    
}
