/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Salon;

import java.util.Scanner;
public abstract class Salon {
    private int rambut=25000, wajah=30000,banyak,tubuh=40000;
    private double harga;
    private int lulur=5000, cream=10000,handbody=15000,vitamin=9000;
    public int getWajah() {
        return wajah;
    }
    public int getTubuh() {
        return tubuh;
    }
    public int getHandbody() {
        return handbody;
    }
    public int getVitamin() {
        return vitamin;
    }
    public void setBanyak(int banyak) {
        this.banyak = banyak;
    }
    public int getBanyak() {
        return banyak;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }
    public int getRambut() {
        return rambut;
    }
    public int getLulur() {
        return lulur;
    }
    public int getCream() {
        return cream;
    }
    public void tampilan(){
        Scanner input=new Scanner (System.in);
        Scanner input1=new Scanner (System.in);
        String pil;
        do {
        System.out.println("1. Layanan salon");
        System.out.println("2. Produk salon");
        System.out.print("Masukkan pilihan anda: ");
        int pilih=input.nextInt();
        switch (pilih) {
            case 1:
                System.out.println("---------------Layanan salon----------");
                System.out.println("1. Perawatan wajah");
                System.out.println("2. Perawatan rambut");
                System.out.println("3. Perawatan tubuh");
                System.out.print("Masukkan pilihan anda: ");
                int pilih1=input.nextInt();
                switch (pilih1) {
                    case 1:
                        System.out.println("Anda memesan perawatan wajah");
                        setHarga(getTubuh()-getDiskon(getWajah()));
                        System.out.println("Maka biaya yang anda bayar= "+getHarga());
                        break;
                    case 2:
                        System.out.println("Anda memesan perawatan rambut");
                        setHarga(getTubuh()-getDiskon(getRambut()));
                        System.out.println("Maka biaya yang anda bayar= "+getHarga());
                        break;
                    case 3:
                        System.out.println("Anda memesan perawatan tubuh");
                        setHarga(getTubuh()-getDiskon(getTubuh()));
                        System.out.println("Maka biaya yang anda bayar= "+getHarga());
                        break;
                    default:
                        throw new AssertionError();
                }
                break;
            case 2:
                System.out.println("=================Produk Salon=============");
                System.out.println("1. Lulur");
                System.out.println("2. Cream");
                System.out.println("3. Handbody");
                System.out.println("4. Vitamin");
                System.out.print("Masukkan pilihan anda: ");
                int pilih2=input.nextInt();
                switch (pilih2) {
                    case 1:
                        System.out.print("Jumlah pesanan lulur= ");
                        int banyak=input.nextInt();
                        setBanyak(banyak);
                        setHarga(getLulur()-getDiskon(getLulur()));
                        System.out.println("Maka biaya yang anda bayar= "+getHarga()*getBanyak());
                        break;
                    case 2:
                        System.out.print("Jumlah pesanan cream= ");
                        int banyak1=input.nextInt();
                        setBanyak(banyak1);
                        setHarga(getCream()-getDiskon(getCream()));
                        System.out.println("Maka biaya yang anda bayar= "+getHarga()*getBanyak());
                        break;
                    case 3:
                        System.out.print("Jumlah pesanan Handbody= ");
                        int banyak2=input.nextInt();
                        setBanyak(banyak2);
                        setHarga(getHandbody()-getDiskon(getHandbody()));
                        System.out.println("Maka biaya yang anda bayar= "+getHarga()*getBanyak());
                        break;
                    case 4:
                        System.out.print("Jumlah pesanan Vitamin= ");
                        int banyak3=input.nextInt();
                        setBanyak(banyak3);
                        setHarga(getVitamin()-getDiskon(getVitamin()));
                        System.out.println("Maka biaya yang anda bayar= "+getHarga()*getBanyak());
                        break;
                    default:
                        throw new AssertionError();
                }
            break;
            default:
                throw new AssertionError();
        }
            System.out.print("Apakah anda ingin melanjutkan? (y/n): ");
            pil=input1.nextLine();
        } while (pil.equalsIgnoreCase("y"));
    }
    public abstract double getDiskon(double a);
}
