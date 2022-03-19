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
public class Manager extends Employee{
    private double tmanager;
    public Manager(String nama, String idKerja, String jabatan, String istri, int tahunmasuk, int anak) {
        super(nama, idKerja, jabatan, istri, tahunmasuk, anak);
    }
    public double manager(){
        tmanager=0.1*gaji();
        return (int)tmanager+gaji();
    }
    public void display() {
        super.display();
        System.out.println("Total gaji = "+(int)manager());
    }
}
