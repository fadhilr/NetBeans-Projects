/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab8s2;

public class Manusia implements MakhlukHidup, Identitas {
    private String nama;
    private int umur;
    @Override
    public void makan() {
        System.out.println("Makan pakai sendok garpu");
    }
    @Override
    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");
    }
    @Override
    public void bersuara() {
        System.out.println("Suaranya merdu");
    }
    @Override
    public void tampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }
    @Override
    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }
}
