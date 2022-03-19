/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2bab5s2;

public class Aritmatika {

    public void hitungPenjumlahan(int a, int b) {
        int nilai = a + b;
        System.out.println("nilai  penjumlahan  adalah  : " + nilai);
    }

    public static void hitungPerkalian(int a, int b) {
        int nilai = a * b;
        System.out.println("nilai perkalian adalah : " + nilai);
    }

    public static void hitungPengurangan(int a, int b) {
        int nilai = a - b;
        System.out.println("nilai  pengurangan  adalah  : " + nilai);
    }
    public double hitungPembagian(String nil, String nil2){
        int nilai=Integer.parseInt(nil)/Integer.parseInt(nil2);
        return nilai;
    }
}
