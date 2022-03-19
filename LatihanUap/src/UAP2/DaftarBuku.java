/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAP2;

import java.util.Scanner;

public class DaftarBuku {
    
    private static String tanggalPinjam[]=new String[10];
    private static String tanggalKembali[]=new String[10];
    private static String namaBuku[]=new String[10]; 
    private static int denda[]=new int[10]; 
    static int x=0;
    public DaftarBuku(){
        
    }
    public static void inputBuku(){
        int x=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama buku\t=");
        namaBuku[x]=input.nextLine();
        x++;
    }
    public static void lihatBuku(){
        for (int i = 0; i < x; i++) {
            System.out.println("nama buku "+(i+1)+"\t="+namaBuku[i]);
            System.out.println("------------------------");
        }
    }
    public static void pinjamBuku(){
        
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nama buku\t=");
        namaBuku[x]=input.nextLine();
        System.out.print("Tanggal pinjam\t=");
        tanggalPinjam[x]=input.nextLine();
        System.out.print("Tanggal kembali\t=");
        tanggalKembali[x]=input.nextLine();
        x++;
    }
    public static void lihatPinjamBuku(){
        for (int i = 0; i < x; i++) {
            int denda[]=dendaBuku(i);
            System.out.println("Tanggal pinjam "+(i+1)+"\t="+tanggalPinjam[i]);
            System.out.println("Tanggal kembali "+(i+1)+"\t="+tanggalKembali[i]);
            System.out.println("Denda "+(i+1)+"\t\t\t="+denda[i]);
            System.out.println("------------------------");
        }
    }
    public static int []dendaBuku(int i){
        int tglAwal=Integer.parseInt(tanggalPinjam[i].substring(0,2)); 
        int tglAkhir=Integer.parseInt(tanggalKembali[i].substring(0,2)); 
        if (tglAwal>tglAkhir && (tglAwal-tglAkhir)>7) {
            denda[i]=(30-(tglAwal-tglAkhir))*500;
        } else if ((tglAkhir-tglAwal)>7) {
            denda[i]=500*((tglAkhir-tglAwal)-7);
        } else {
            denda[i]=0;
        } 
    return denda;
    }
    public static void lihatStatusPinjam(){
        for (int i = 0; i < x; i++) {
            int denda[]=dendaBuku(i);
            System.out.println("Judul buku "+(i+1)+"\t\t="+namaBuku[i]);
            System.out.println("Tanggal pinjam "+(i+1)+"\t="+tanggalPinjam[i]);
            System.out.println("Tanggal kembali "+(i+1)+"\t="+tanggalKembali[i]);
            System.out.println("Denda "+(i+1)+"\t\t\t="+denda[i]);
            System.out.println("------------------------");
        }
    }
}
