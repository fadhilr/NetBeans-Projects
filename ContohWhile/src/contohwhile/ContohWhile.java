/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;

public class ContohWhile {

    public static void main(String[] args) {
            int i=2, jumlah=1;
            do {
                if (i==16) {
                    System.out.print(i+" = ");
                } else {
                    System.out.print(i+"*");
                }
                jumlah*=i;
                i+=2;
                
            }while(i<=16);
            System.out.println(jumlah);
    }
    
}
