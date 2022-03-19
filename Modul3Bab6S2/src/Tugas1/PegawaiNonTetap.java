/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author U53R
 */
public class PegawaiNonTetap extends Employee{
    private int jam;
    private double gajilembur;
    public PegawaiNonTetap(String nama, String idKerja, String jabatan, String istri, int tahunmasuk, int anak,int jam) {
        super(nama, idKerja, jabatan, istri, tahunmasuk, anak);
        this.jam=jam;
    }
    public double lembur(){
        if (jam>10) {
            gajilembur=(jam-10)*10000*30;
        } else {
            gajilembur=0;
        }
        return (int)gajilembur+getGaji();
    }
    public void display() {
        super.display();
        System.out.println("Total gaji = "+(int)lembur());
    }
}
