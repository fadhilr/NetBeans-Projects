/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1s2;

public class Buku {
    public static void main(String[] args) {
        BukuHarian diary = new BukuHarian ();
        diary.lembar(50);
        diary.halaman(1);
        diary.hari(4);
        diary.menghitungBanyakHari();
        diary.display();
    }}
