/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

public class Jaket {
    private static final int jaketa=100000;
    private static final int jaketb=125000;
    private static final int jaketc=175000;
    private static int harga;
    public static void jaketA(int a){
        if (a>100) {
            harga=(jaketa-5000)*a;
        } else {
            harga=jaketa*a;
        }
        System.out.println("Banyak jaket yang dibeli\t= "+a);
        System.out.println("Harga total jaket yang dibeli\t= "+harga);
    }
    public static void jaketB(int a){
        if (a>100) {
            harga=(jaketb-5000)*a;
        } else {
            harga=jaketb*a;
        }
        System.out.println("Banyak jaket yang dibeli\t= "+a);
        System.out.println("Harga total jaket yang dibeli\t= "+harga);
    }
    public static void jaketC(int a){
        if (a>100) {
            harga=(jaketc-15000)*a;
        } else {
            harga=jaketc*a;
        }
        System.out.println("Banyak jaket yang dibeli\t= "+a);
        System.out.println("Harga total jaket yang dibeli\t= "+harga);
    }
}
