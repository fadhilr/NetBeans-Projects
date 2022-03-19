/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication17;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class JavaApplication17 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner input1 = new Scanner (System.in);
        String [] barang = new String [20];
        int [][] hargaJumlah = new int [20][20];
        String lagi = "n";
        System.out.println("punya kartu member ? (y/n)");
            String member = input1.nextLine();
                int i = 1;
        do{
        
            
            System.out.println("masukkan barang");
            barang[i] = input1.nextLine();
            System.out.println("harga barang");
            hargaJumlah[0][i]=input.nextInt();
            System.out.println("jumlah barang");
            hargaJumlah[i][0]=input.nextInt();
            System.out.println("pesan lagi ? (y/n)");
            lagi = input1.nextLine();
            i++;
        }while (lagi.equalsIgnoreCase("y"));
        System.out.println("jumlah  barang     harga");
        for (i = 1; i < hargaJumlah.length; i++) {
            if (barang[i]!= null)
            System.out.println(hargaJumlah[i][0]+"\t"+barang[i]+"\t"+hargaJumlah[0][i]);
            else
                continue;
        }
        
    }
    
}
