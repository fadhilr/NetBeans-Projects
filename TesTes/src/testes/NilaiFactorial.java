/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

public class NilaiFactorial {
    public static void main(String[] args) {
        int jumlah1=1,jumlah2=1,jumlah;
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan bilangan 1\t:");
        int bil1= input.nextInt();
        System.out.print("Masukkan bilangan 2\t:");
        int bil2=input.nextInt();
        
        for (int i = 1; i <=bil1; i++) {
            jumlah1 = jumlah1*i;   
        }
        for (int j = 1; j <=bil2; j++) {
            jumlah2=jumlah2*j;
        }
        jumlah= jumlah1*jumlah2;
        System.out.println(bil1+"!*"+bil2+"!="+jumlah1+"*"+jumlah2+"="+jumlah);
        
    }
}
