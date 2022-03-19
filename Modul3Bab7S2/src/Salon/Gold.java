/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salon;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class Gold extends Salon{
    public double getDiskon(double a){
        double diskon=a*0.15;
        return diskon;
    }
    public void tampilan() {
        System.out.println("=============Gold============");
        super.tampilan(); 
    }
}
