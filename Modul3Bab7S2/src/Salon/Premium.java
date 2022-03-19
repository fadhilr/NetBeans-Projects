/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salon;

import java.util.Scanner;

public class Premium extends Salon{
    public double getDiskon(double a){
        double diskon=a*0.2;
        return diskon;
    }
    public void tampilan() {
        System.out.println("=============Premium============");
        super.tampilan(); 
    }
}
