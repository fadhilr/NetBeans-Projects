/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_ppp;

import java.util.Scanner;
public class JatimPark {

    public static void main(String[] args) {
        Gedung[] list = {new KomediPutar(), new Gokart(), new KolamRenang()};
        Member vip = new Member();
        NonMember reg = new NonMember();
        Scanner input=new Scanner(System.in);
        System.out.println("Silahkan pilih jenis pembeli tiket : ");
        System.out.println("1. member ");
        System.out.println("2. non member ");
        System.out.print("Pilihan anda = ");
        int pilih=input.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("FASILITAS PEMESANAN TIKET JATIM PARK PADA MEMBER GUEST");
                for (Gedung Gedung : list) {
                    Gedung.accept(vip);
                }
                break;
            case 2:
                System.out.println("");
                System.out.println("FASILITAS PEMESANAN TIKET JATIM PARK PADA NON-MEMBER GUEST");
                for (Gedung Gedung : list) {
                    Gedung.accept(reg);
                }
                break;
            default:
                throw new AssertionError();
        }

    }
}
