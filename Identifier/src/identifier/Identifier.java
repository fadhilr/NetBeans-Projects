/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifier;


public class Identifier {

 static int c=0;                     //variabel global
    public static void main(String[] args) {
        System.out.println("c1="+c);
        penjumlahan(1,7);
        penjumlahan2(8,4);

    }
    
    static void penjumlahan(int a,int b){
        System.out.println("c2="+c);
        int c=a+b;
        System.out.println(a+"+"+b+"="+c);
    }
    static int penjumlahan2 (int a, int b){
        System.out.println("c3"+c);
        int c=a+b;
        System.out.println(a+"+"+b+"="+c);
     return c;
    }
    
    
    
}
