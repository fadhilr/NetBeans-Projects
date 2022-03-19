/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salon;

import java.util.Scanner;
public class MainSalon {
    public static void main(String[] args) {
        Premium a=new Premium();
        Gold b=new Gold();
        Silver c=new Silver();
        Regular d=new Regular();
        Salon[]objek=new Salon[4];
        objek[0]=a;
        objek[1]=b;
        objek[2]=c;
        objek[3]=d;
        for (Salon pelanggan:objek) {
            pelanggan.tampilan();
            System.out.println("");
        }
    }
}
