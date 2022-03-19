/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Musik;
import java.util.Scanner;
public class MainMusik {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int pilih ;
        System.out.println("====PROGRAM ALAT MUSIK====");
        System.out.println("1. Alat Musik Petik");
        System.out.println("2. Alat Musik Tiup");
        System.out.print("Masukkan Pilihan Anda : ");
        pilih = in.nextInt();
        switch (pilih){
            case 1 : System.out.println("=====ALAT MUSIK PETIK=====");
                System.out.println("1. Gitar");
                System.out.println("2. Sasando");
                System.out.print("Masukkan pilihan untuk info alat : ");
                pilih = in.nextInt();
                switch (pilih){
                    case 1 : Gitar gitar = new Gitar();
                        gitar.tampilkanNama();
                        gitar.caraBermain();
                        gitar.tampilkanBahan();
                        gitar.nadaDasar();break;
                    case 2 : Sasando sasando = new Sasando();
                        sasando.tampilkanNama();
                        sasando.caraBermain();
                        sasando.tampilkanBahan();
                        sasando.nadaDasar();break;
                }break;
            case 2 : System.out.println("====ALAT MUSIK TIUP====");
                System.out.println("1. Seruling");
                System.out.println("2. Harmonika");
                System.out.print("Masukkan pilihan untuk info alat : ");
                pilih = in.nextInt();
                switch(pilih){
                    case 1 : Seruling seruling = new Seruling();
                        seruling.tampilkanNama();
                        seruling.caraBermain();
                        seruling.tampilkanBahan();
                        seruling.nadaDasar();break;
                    case 2 : Harmonika harmonika = new Harmonika();
                        harmonika.tampilkanNama();
                        harmonika.caraBermain();
                        harmonika.tampilkanBahan();
                        harmonika.nadaDasar();break;
                }
        }              
    }
}

