/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalKalibr;

/**
 *
 * @author fadil
 */
import java.util.Scanner;

public class acakKarakter {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Berapa jumlah karakter acak yang anda inginkan: ");

        int jumlahKarakter = input.nextInt();

        System.out.print("Berapa jumlah karakter dalam setiap baris yang anda inginkan: ");

        int jumlahKarakterPerbaris = input.nextInt();

        System.out.println("Karakter acak digit angka adalah: ");

        for (int i = 0; i < jumlahKarakter; i++) {
            char karakter = acakKarakter.buatKarakterDigitAngkaAcak();
            if ((i + 1) % jumlahKarakterPerbaris == 0) {
                System.out.println(karakter);
            } else {
                System.out.print(karakter);
            }
        }

        System.out.println("Karakter acak huruf kecil adalah: ");
        for (int i = 0; i < jumlahKarakter; i++) {
            char karakter = acakKarakter.buatKarakterHurufKecilAcak();
            if ((i + 1) % jumlahKarakterPerbaris == 0) {
                System.out.println(karakter);
            } else {
                System.out.print(karakter);
            }
        }

        System.out.println("Karakter acak huruf besar adalah: ");
        for (int i = 0; i < jumlahKarakter; i++) {
            char karakter = acakKarakter.buatKarakterHurufBesarAcak();
            if ((i + 1) % jumlahKarakterPerbaris == 0) {
                System.out.println(karakter);
            } else {
                System.out.print(karakter);
            }
        }

        System.out.println();

        System.out.print("Berikut ini adalah contoh karakter acak antara 'a' dan 'c': \n");
        for (int i = 0; i < jumlahKarakter; i++) {
            char karakter = acakKarakter.buatKarakterAcakVariasi('a', 'c');
//            if ((i + 1) % jumlahKarakterPerbaris == 0) {
//                System.out.println(karakter);
//            } else {
//                System.out.print(karakter);
//            }
            System.out.print(karakter);
        }
    }

    public static char buatKarakterAcak(char karakter1, char karakter2) {
        return (char) (karakter1 + Math.random() * (karakter2 - karakter1 + 1));
    }

    public static char buatKarakterDigitAngkaAcak() {
        return buatKarakterAcak('0', '9');
    }

    public static char buatKarakterHurufKecilAcak() {
        return buatKarakterAcak('a', 'z');
    }

    public static char buatKarakterHurufBesarAcak() {
        return buatKarakterAcak('A', 'Z');
    }

    public static char buatKarakterAcakVariasi(char dariChar, char keChar) {
        int unicode = dariChar + (int) ((keChar - dariChar + 1) * Math.random());
        return (char) unicode;
    }

    public static char buatKarakterAcakVariasi() {
        return buatKarakterAcakVariasi('a', 'c');
    }

    static void cekSame(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void cekSame(char c, char c0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
