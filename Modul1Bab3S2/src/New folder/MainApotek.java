package Soal2;

import java.util.Scanner;

public class MainApotek {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner (System.in);
        Apotek konsumen = new Apotek();
        System.out.println("----------------------------------------------");
        System.out.println("|    SELAMAT DATANG DI APOTEK FILKOM 2015    |");
        System.out.println("|       UNIVERSITAS BRAWIJAYA MALANG         |");
        System.out.println("----------------------------------------------");
        System.out.print("Masukan Nama   : ");
        konsumen.setNama(in.nextLine());
        System.out.print("Masukan Alamat : ");
        konsumen.setAlamat(input.nextLine());
        konsumen.PilihanObat();
        konsumen.InfromasiTransaksi();
    }
}
