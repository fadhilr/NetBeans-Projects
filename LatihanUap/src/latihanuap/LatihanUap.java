/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuap;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class LatihanUap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        int hargajumlah[][]=new int[20][20];
        String namab[]=new String[20];
        String ulang="n";
        System.out.println("Punya member card? (Y/N) ");
        String member=input.nextLine();
        int i=0;
        do {
            System.out.print("Nama barang =");
            namab[i]=input.nextLine();
            System.out.print("Harga barang =");
            hargajumlah[i][i]=input1.nextInt();
            System.out.println("Jumlah barang =");
            hargajumlah[i][i]=input1.nextInt();
            System.out.println("Masukkan barang lagi?(Y/N)");
            ulang=input.nextLine();
        } while (ulang.equalsIgnoreCase("y"));        
        int total=0;
        for (int j = 0; j < hargajumlah.length; j++) {
            for (int k = 0; k < hargajumlah[0].length; k++) {
             total=hargajumlah[0][0];
            }
        }
        
    }
    
    
}
