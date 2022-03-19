/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;


public class Employee {
    private String nama,idKerja,jabatan,istri;
    private double bonus,tunjangan,tistri,tanak;
    private int tahunmasuk,anak;
    private int gaji=2000000;
    public Employee(String nama, String idKerja, String jabatan, String istri, int tahunmasuk, int anak) {
        this.nama = nama;
        this.idKerja = idKerja;
        this.jabatan = jabatan;
        this.istri = istri;
        this.tahunmasuk = 2016-tahunmasuk;
        this.anak = anak;
    }
    public double gaji(){
        if (tahunmasuk<6) {
            bonus=0;
            tunjangan=0;
        } else if (tahunmasuk<=10) {
            bonus=0.05*gaji*tahunmasuk;
            tunjangan=0;
        } else {
            bonus=0.1*gaji*tahunmasuk;
            tunjangan=0.1*gaji*tahunmasuk;
        }
        if (istri.equalsIgnoreCase("y")) {
           tistri=0.1*(gaji+bonus+tunjangan);
        } else {
            tistri=0;
        }
        if (anak ==0) {
            tanak=0;
        } else if (anak<=3) {
            tanak=anak*(0.15*(gaji+bonus+tunjangan));
        } else {
            tanak=3*(0.15*(gaji+bonus+tunjangan));
        }
        return (int)gaji+bonus+tunjangan+tanak+tistri;
    }
    public void display(){
        System.out.println("============Note Gaji===========");
        System.out.println("Nama = "+nama);
        System.out.println("ID pegawai = "+idKerja);
        System.out.println("Jabatan = "+jabatan);
    }
    public int getGaji() {
        return gaji;
    }
}
