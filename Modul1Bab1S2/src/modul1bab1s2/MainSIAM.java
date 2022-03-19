/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1s2;

import java.util.Scanner;

public class MainSIAM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        SIAM siswa1 = new SIAM();
        SIAM siswa2 = new SIAM();
        SIAM siswa3 = new SIAM();
        String nama;
        String nim;
        double ip;

        System.out.println("===Sistem Informasi Akademik Mahasiswa===");
        System.out.print("Masukkan nama ke-1            : ");
        nama = in.nextLine();
        siswa1.setNama(nama);
        System.out.print("Masukkan NIM              : ");
        nim = in.nextLine();
        siswa1.setNIM(nim);
        System.out.print("Masukkan IP               : ");
        ip = input.nextDouble();
        siswa1.setIP(ip);
        System.out.print("Masukkan jurusan          : ");
        siswa1.jurusan = in.nextLine();
        siswa1.sks(ip);
        siswa1.mataKuliah();
        System.out.println("=========================================");
        siswa1.tampilan();
        System.out.print("Masukkan nama ke-2            : ");
        nama = in.nextLine();
        siswa2.setNama(nama);
        System.out.print("Masukkan NIM              : ");
        nim = in.nextLine();
        siswa2.setNIM(nim);
        System.out.print("Masukkan IP               : ");
        ip = input.nextDouble();
        siswa2.setIP(ip);
        System.out.print("Masukkan jurusan          : ");
        siswa2.jurusan = in.nextLine();
        siswa2.sks(ip);
        siswa2.mataKuliah();
        System.out.println("=========================================");
        siswa2.tampilan();
        System.out.print("Masukkan nama ke-3            : ");
        nama = in.nextLine();
        siswa3.setNama(nama);
        System.out.print("Masukkan NIM              : ");
        nim = in.nextLine();
        siswa3.setNIM(nim);
        System.out.print("Masukkan IP               : ");
        ip = input.nextDouble();
        siswa3.setIP(ip);
        System.out.print("Masukkan jurusan          : ");
        siswa3.jurusan = in.nextLine();
        siswa3.sks(ip);
        siswa3.mataKuliah();
        System.out.println("=========================================");
        siswa3.tampilan();
    }
}


