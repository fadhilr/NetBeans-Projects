/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab7s2;

public abstract class Employee {

    private String name;
    private String noKTP;
    private String tanggal;
    private int barang;

    public Employee(String name, String noKTP,String tanggal,int barang) {
        this.name = name;
        this.noKTP = noKTP;
        this.tanggal=tanggal;
        this.barang=barang;
    }
    public int getBarang() {
        return barang;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }
    public String toString() {
        return String.format("  " + getName() + " \nNo.  KTP :" + getNoKTP()
        +"\nTanggal lahir: "+getTanggal());
    }
    public abstract double earnings();//pendapatan
}
