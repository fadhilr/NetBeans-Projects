/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;


public class DeretGeometri {
    public static void main(String[] args) {
        int jumlah=0;
        for (int i = 1;i <= 100; i++) {
            if (i%2==1) {
                System.out.print("-"+i);
                jumlah=jumlah-i;
            }
            else if (i%2==0) {
                System.out.print("+"+i);
                jumlah=jumlah+i;
            }
            
            
        }
        System.out.println("="+jumlah);
    }
}
