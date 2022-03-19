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
public class PegawaiTetap extends Employee{

    public PegawaiTetap(String nama, String idKerja, String jabatan, String istri, int tahunmasuk, int anak) {
        super(nama, idKerja, jabatan, istri, tahunmasuk, anak);
    }
    public void display() {
        super.display();
        System.out.println("Total gaji = "+(int)gaji());
    }
}
