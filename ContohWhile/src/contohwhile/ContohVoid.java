/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;


public class ContohVoid {
    public static void main(String[] args) {
//        int a1=1,a2=7,a3=2,a4=3,a5=9,a6=5,a7=7,a8=9;
//        int hasil1=a1+a2, hasil2=a3+a4, hasil3=a5+a6, hasil4=a7+a8;
//        System.out.println(a1+" + "+a2+" = "+hasil1);
//        System.out.println(a3+" + "+a4+" = "+hasil2);
//        System.out.println(a5+" + "+a6+" = "+hasil3);
//        System.out.println(a7+" + "+a8+" = "+hasil4);
        penjumlahan(1,7);
        penjumlahan(2,3);
        penjumlahan(9,5);
        penjumlahan(7,9);
        int x=penjumlahan2(1,7);
        System.out.println("x="+x);
        double y= (double) (penjumlahan2(1,7)*penjumlahan2(2,3)-penjumlahan2(9,7))/penjumlahan2(5,9);
        System.out.println("y="+y);
        
        
    }
    static void penjumlahan(int a,int b){
        int c=a+b;
        System.out.println(a+"+"+b+"="+c);
                            
    }
    static int penjumlahan2(int a,int b){
        int c=a+b;
        return c;
        
    }
    
}
