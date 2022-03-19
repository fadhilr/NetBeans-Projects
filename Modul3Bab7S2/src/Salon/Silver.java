/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salon;

public class Silver extends Salon{
    public double getDiskon(double a){
        double diskon=a*0.1;
        return diskon;
    }
    public void tampilan() {
        System.out.println("=============Silver============");
        super.tampilan(); 
    }
}
