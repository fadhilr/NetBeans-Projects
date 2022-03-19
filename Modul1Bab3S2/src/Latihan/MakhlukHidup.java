/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

public class MakhlukHidup {

    private static String data[] = {"terbang", "berlari", "berenang"};
    public static void bergerak1(double a){
        System.out.println(bergerak((int)(a-0.5))+" dan "+bergerak((int)(a+0.5)));
    }
    public static String bergerak(int a) {
        String hasil = "";
        if (a == 1) {
            hasil=data[0];
        } else if (a == 2) {
            hasil=data[1];
        } else if (a == 3) {
            hasil=data[2];
        } 
        return hasil;
    }
}
