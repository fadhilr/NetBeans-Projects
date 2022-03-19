/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;
public class MainTugas1 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        Scanner input1=new Scanner (System.in);
        String pil="y";
        do {
            System.out.println("============Employee===========");
            System.out.print("Masukkan nama : ");
            String nama=input1.nextLine();
            System.out.print("Masukkan id : ");
            String id=input1.nextLine();
            System.out.print("Masukkan jabatan : ");
            String jab=input1.nextLine();
            String jabatan=jab.toLowerCase();
            System.out.print("Status pernikahan (y/n) : ");
            String istri=input1.nextLine();
            System.out.print("Masukkan jumlah anak : ");
            int anak=input.nextInt();
            System.out.print("Masukkan tahun masuk kerja anda : ");
            int tahun=input.nextInt();
            switch (jabatan) {
                case "manager":
                    Manager manager=new Manager(nama,id,jabatan,istri,tahun,anak);
                    manager.display();
                    break;
                case "pns":
                    PegawaiTetap pegawai=new PegawaiTetap(nama,id,jabatan,istri,tahun,anak);
                    pegawai.display();
                    break;
                case "non pns":
                    System.out.print("Masukkan jumlah jam kerja : ");
                    int jam=input.nextInt();
                    PegawaiNonTetap pegawai1=new PegawaiNonTetap(nama,id,jabatan,istri,tahun,anak,jam);
                    pegawai1.display();
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.print("Apakah anda ingin melanjutkan(y/n) : ");
            pil=input1.nextLine();
        } while (pil.equalsIgnoreCase("y"));
    }
}
