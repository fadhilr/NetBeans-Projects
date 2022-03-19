/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab3;
import java.util.Scanner;
public class Tugas3Bab3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean nilai;       
        do {
        System.out.println("MENU");
        System.out.println("0. KELUAR");
        System.out.println("1. HITUNG VOLUME BALOK");
        System.out.println("2. HITUNG VOLUME BOLA");
        System.out.println("3. HITUNG VOLUME KERUCUT");
        System.out.println("4. HITUNG VOLUME SILINDER");
        System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");
        System.out.print("   MASUKKAN PILIHAN ANDA : ");
        int pilihan = input.nextInt();
        if (pilihan == 0)
            nilai = false;
        else
            nilai = true;
        switch(pilihan){
            case 1 : System.out.print("Masukkan panjang : ");
                     int panjang = input.nextInt();
                     System.out.print("Masukkan lebar   : ");
                     int lebar = input.nextInt();
                     System.out.print("Masukkan tinggi  : ");
                     int tinggi = input.nextInt();
                     int volBalok = panjang * lebar * tinggi;
                     System.out.println("Volume Balok   : "+volBalok);break;
            case 2 : System.out.print("Masukkan jari-jari : ");
                     double r = input.nextDouble();
                     double volBola = (4.0/3) *3.14 *r*r*r;
                     System.out.println("Volume Bola      : "+volBola);break;
            case 3 : System.out.print("Masukkan jari-jari : ");
                     double rKerucut = input.nextDouble();
                     System.out.print("Masukkan Tinggi    : ");
                     double tKerucut = input.nextDouble();
                     double volKerucut = 1.0/3 * 3.14 * rKerucut * rKerucut;
                     System.out.println("Volume Kerucut   : "+volKerucut);break;
            case 4 : System.out.print("Masukkan jari-jari : ");
                     double rTabung = input.nextDouble();
                     System.out.print("Masukkan tinggi    : ");
                     double tTabung = input.nextDouble();
                     double volTabung = 3.14*rTabung*rTabung*tTabung;
                     System.out.println("Volume Silinder  : "+volTabung);break;
            case 5 : System.out.print("Masukan Alas            : ");
                     double a = input.nextDouble();
                     System.out.print("Masukan tinggi Segitiga : ");
                     double tSegitiga = input.nextDouble();
                     System.out.print("Masukan tinggi Limas    : ");
                     double tLimas = input.nextDouble();
                     double volLimas = 1.0/6*a*tSegitiga*tLimas;
                     System.out.println("Volume limas segitiga : "+volLimas);break; 
        }
        }while(nilai == true);
    }
}

