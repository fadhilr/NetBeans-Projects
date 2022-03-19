/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1s2;

import java.util.Scanner;



public class MainMobil {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
//instan objek bernama m1
        Mobil m1 = new Mobil();
        System.out.print("Masukkan waktu dalam satuan jam\t= ");
        double waktu = input.nextInt();
        m1.setWaktu(waktu);
        System.out.print("Masukkan kecepatan\t= ");
        int kec = input.nextInt();
        m1.setKecepatan(kec);
        m1.hitungJarak();
        System.out.print("Masukkan manufaktur\t= ");
        String man = input1.nextLine();
        m1.setManufaktur(man);
        System.out.print("Masukkan nomor plat\t= ");
        String noplat = input1.nextLine();
        m1.setNoPlat(noplat);
        System.out.print("Masukkan warna\t= ");
        String warna = input1.nextLine();
        m1.setWarna(warna);
        System.out.println("");
        m1.displayMessage();
        System.out.println("================");
//instan objek baru bernama m2
        Mobil m2 = new Mobil();
        System.out.print("Masukkan waktu dalam satuan jam\t= ");
        double waktu1 = input.nextInt();
        m1.setWaktu(waktu1);
        System.out.print("Masukkan kecepatan = ");
        int kec1 = input.nextInt();
        m2.setKecepatan(kec1);
        System.out.print("Masukkan manufaktur\t= ");
        String man1 = input1.nextLine();
        m2.setManufaktur(man1);
        System.out.print("Masukkan warna\t= ");
        String noplat1 = input1.nextLine();
        m2.setNoPlat(noplat1);
        System.out.print("Masukkan warna\t= ");
        String warna1 = input1.nextLine();
        m2.setWarna(warna1);
        m2.displayMessage();
        System.out.println("");
        System.out.println("================");
//merubah warna dari objek m1
        System.out.print("mobil pada objek m1 di rubah menjadi warna yang dinginkan\t=");
        String warna2=input1.nextLine();
        m1.setWarna(warna2);
        System.out.println("");
//menampilkan hasil perubahan
        m1.displayMessage();
    }
}
