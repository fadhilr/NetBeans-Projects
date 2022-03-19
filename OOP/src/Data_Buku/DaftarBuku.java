/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Buku;

import java.util.Scanner;

public class DaftarBuku {
    
    private static String idPeminjam[]=new String[10];
    private static String tanggalPinjam[]=new String[10];
    private static String tanggalKembali[]=new String[10];
    private static String idBuku[]=new String[10]; 
    private static String namaBuku[]=new String[10]; 
    private static String status[]=new String[10]; 
    private static int denda[]=new int[10]; 
    static int x=2;
    public DaftarBuku(){
        idPeminjam[0]="P5002";
        tanggalPinjam[0]="20 maret 2001";
        tanggalKembali[0]="26 maret 2001";
        idBuku[0]="BUK551";
        namaBuku[0]="IPS";
        status[0]="Terpinjam";
        idPeminjam[1]="P5003";
        tanggalPinjam[1]="29 februari 2012";
        tanggalKembali[1]="08 maret 2012";
        idBuku[1]="BUK552";
        namaBuku[1]="Kemal";
        status[1]="Terpidana";   
    }
    public static void inputBuku(){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan ID buku\t=");
        idBuku[x]=input.nextLine();
        System.out.print("Masukkan nama buku\t=");
        namaBuku[x]=input.nextLine();
        System.out.print("Masukkan status buku\t=");
        status[x]=input.nextLine();
        x++;
    }
    public static void lihatBuku(){
        for (int i = 0; i < x; i++) {
            System.out.println("ID buku "+(i+1)+"\t="+idBuku[i]);
            System.out.println("nama buku "+(i+1)+"\t="+namaBuku[i]);
            System.out.println("status buku "+(i+1)+"\t="+status[i]);
            System.out.println("------------------------");
        }
    }
    public static void pinjamBuku(){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan ID peminjam\t=");
        idPeminjam[x]=input.nextLine();
        System.out.print("Masukkan ID buku\t=");
        idBuku[x]=input.nextLine();
        System.out.print("Tanggal pinjam\t=");
        tanggalPinjam[x]=input.nextLine();
        System.out.print("Tanggal kembali\t=");
        tanggalKembali[x]=input.nextLine();
        x++;
    }
    public static void lihatPinjamBuku(){
        for (int i = 0; i < x; i++) {
            int denda[]=dendaBuku(i);
            System.out.println("ID peminjam "+(i+1)+"\t\t="+idPeminjam[i]);
            System.out.println("ID buku "+(i+1)+"\t\t="+idBuku[i]);
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
            denda[i]=(30-(tglAwal-tglAkhir))*1000;
        } else if ((tglAkhir-tglAwal)>7) {
            denda[i]=1000*((tglAkhir-tglAwal)-7);
        } else {
            denda[i]=0;
        } 
    return denda;
    }
    public static void lihatStatusPinjam(){
        for (int i = 0; i < x; i++) {
            int denda[]=dendaBuku(i);
            System.out.println("ID buku "+(i+1)+"\t\t="+idBuku[i]);
            System.out.println("Judul buku "+(i+1)+"\t\t="+namaBuku[i]);
            System.out.println("Tanggal pinjam "+(i+1)+"\t="+tanggalPinjam[i]);
            System.out.println("Tanggal kembali "+(i+1)+"\t="+tanggalKembali[i]);
            System.out.println("Denda "+(i+1)+"\t\t\t="+denda[i]);
            System.out.println("------------------------");
        }
    }
}
