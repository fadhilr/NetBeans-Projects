/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohprojectn;

import java.util.Scanner;

public class ContohPengulanganBensin {
    public static void main(String[] args) {
        int jumlah=0;
        Scanner input=new Scanner(System.in);
        for (int i = 1; i < 5; i++) {
            
            System.out.print("Minggu ke "+i+". Rp.");
            int data= input.nextInt();
            
            jumlah+=data;
            
        }System.out.println("Maka total pengeleuaran perbulan\t= "+jumlah);
        int rata2= jumlah/4;
        System.out.println("Rerata\t\t\t\t\t= "+rata2);
    }
}
