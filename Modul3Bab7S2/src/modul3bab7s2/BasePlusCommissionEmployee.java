/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab7s2;

public class BasePlusCommissionEmployee extends
        CommissionEmployee {

    private double baseSalary;//gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, double sales, double rate, double salary,
            int barang,String tanggal) {
        super(name, noKTP, sales, rate,tanggal,barang);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        if (getTanggal().substring(3, 6).equals("mei")) {
            return getBaseSalary() + super.earnings()+10;
        } else {
            return getBaseSalary() + super.earnings();
        }
    }

    public String toString() {
        return String.format("Base -Salaried  "
                + super.toString() + "\nbase salary " + getBaseSalary());
    }
}
