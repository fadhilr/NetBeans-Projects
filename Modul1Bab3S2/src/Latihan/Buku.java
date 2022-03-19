/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.*;

public class Buku {
    Scanner input=new Scanner (System.in);
    Scanner input1=new Scanner (System.in);
    private String buku,pilih;
    private static ArrayList<String> judul=new ArrayList<String>();
    private static ArrayList<String> lokal= new ArrayList<String>();
    private static ArrayList<String> nasional= new ArrayList<String>();
    private static ArrayList<String> internasional= new ArrayList<String>();
    private static String daftarPenghargaan[]={"Best seller lokal","Best seller nasional",
        "Best seller internasional"};
    public Buku(){
        
    }
    
    public void daftarPenghargaan(){
        int i=0;
        for (i=0; i < daftarPenghargaan.length; i++) {
            System.out.println((i+1)+". "+daftarPenghargaan[i]);
        }
        System.out.print("Masukkan pilihan penghargaan = ");
        int pil=input.nextInt();
        switch (pil) {
            case 1:
                System.out.println("Local");
                break;
            default:
        }
    }
    public void tambahBuku(int a){
        do{
            System.out.print("Masukkan judul buku : ");
            judul.add(buku=input.nextLine());
            System.out.println("=====================");
            System.out.print("Apakah best seller local?(y/n) =");
            lokal.add(new Scanner (System.in).nextLine());
            System.out.print("Apakah best seller nasional?(y/n) =");
            nasional.add(new Scanner (System.in).nextLine());
            System.out.print("Apakah best seller internasional?(y/n) =");
            internasional.add(new Scanner (System.in).nextLine());
            System.out.print("Ingin menambah lagi?(y/n)");
            pilih=input.nextLine();
        }while(pilih.equalsIgnoreCase("y"));
    }
    public void bestLocal(){
        
    }
}
