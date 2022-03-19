/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab7s2;

public class SalariedEmployee extends Employee {

    private double upahperMinggu; //gaji/minggu
    public SalariedEmployee(String name, String noKTP, double salary,String tanggal, int barang, double upahminggu) {
        super(name, noKTP,tanggal,barang);
        setWeeklySalary(upahminggu);
    }

    public void setWeeklySalary(double salary) {
        upahperMinggu = salary;
    }

    public double getWeeklySalary() {
        return upahperMinggu;
    }

    public double earnings() {
        if (getTanggal().substring(3,6).equals("mei")) {
            return (getWeeklySalary()*getBarang())+10;
        } else {
            return getWeeklySalary()*getBarang();
        }
    }

    public String toString() {
        return String.format("Salaried  employee:  "
                + super.toString()
                + "\nweekly salary: " + getWeeklySalary())
                +"\nPendapatan    : "+ earnings();
    }
}
