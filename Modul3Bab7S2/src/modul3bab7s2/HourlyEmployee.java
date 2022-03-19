/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab7s2;

public class HourlyEmployee extends Employee {

    private double wage; //upah per jam
    private double hours; //jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP,
            double hourlyWage, double hoursWorked, String tanggal,int barang) {
        super(name, noKTP,tanggal,barang);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        if (getTanggal().substring(3, 7).equals("mei")) {
            if (getHours() <= 40) {
            return getWage() * getHours()+10;
        } else {
            return 40 * getWage() + (getHours() - 40)
                    * getWage() * 1.5+10;
        }
        } else {
            if (getHours() <= 40) {
            return getWage() * getHours();
        } else {
            return 40 * getWage() + (getHours() - 40)
                    * getWage() * 1.5;
        }
        }
    }

    public String toString() {
        return String.format("Hourly  employee: " + super.toString()
                + "\nhourly  wage" + getWage() + "\nhours  worked: " + getHours());
    }
}
