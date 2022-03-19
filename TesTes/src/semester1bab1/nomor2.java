/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester1bab1;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class nomor2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        Scanner input1= new Scanner(System.in);
        
        System.out.print("Masukkan nama =\t");
        String nama=input.nextLine();
        System.out.print("Kelurahan =\t");
        String kelurahan=input.nextLine();
        System.out.print("Masukkan posisi awal KwH meter =\t");
        int kwhawal=input.nextInt();
        System.out.print("Masukkan posisi akhir KwH meter =\t");
        int kwhakhir=input.nextInt();
        System.out.print("Masukkan biaya beban saat ini =\t");
        int biaya=input.nextInt();
        System.out.print("Masukkan PPJ(dalam persen) =\t");
        int ppj=input.nextInt();
        int tarif=biaya*(kwhakhir-kwhawal);
        int ppjreal=(int) (tarif*(ppj/100.0));
        System.out.println(ppjreal);
        System.out.println("================PLN JAVA==============");
        System.out.println("Nama :\t"+nama);
        System.out.println("Kelurahan :\t"+kelurahan);
        System.out.println("Pemakaian bulan ini :\t"+(kwhakhir-kwhawal));
        System.out.println("Tarif listrik :\t"+tarif);
        System.out.println("PPJ 10% :\t"+ppjreal);
        System.out.println("Total bayar :\t"+(tarif+ppjreal));
        
        
    }
}
