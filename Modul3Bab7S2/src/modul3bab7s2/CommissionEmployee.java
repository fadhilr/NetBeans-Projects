/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab7s2;

public class CommissionEmployee extends Employee {

    private double grossSales;//penjualan per minggu
    private double commissionRate;//komisi 

    public CommissionEmployee(String name, String noKTP, double sales, double rate,String tanggal,int barang) {
        super(name, noKTP,tanggal,barang);
        setGrossSales(sales);
        setCommissionRate(rate);
    }

    public void setGrossSales(double sales) {
        grossSales = sales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double rate) {
        commissionRate = rate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        if (getTanggal().substring(3,8).equals("mei")) {
            return getCommissionRate() * getGrossSales()+10;
        } else {
            return getCommissionRate() * getGrossSales();
        }
    }

    public String toString() {
        return String.format("Commision  employee: " + super.toString() + "\ngross  sales: "
                + getGrossSales() + "\ncommission rate" + getCommissionRate());
    }
}
