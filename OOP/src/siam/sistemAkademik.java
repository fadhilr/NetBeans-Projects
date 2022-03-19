package siam;

import java.util.Scanner;

public class sistemAkademik {
    Scanner input = new Scanner (System.in);
    public String nama;
    public String nim;
    public String jur;
    public String mk;
    public String kode;
    public String totalmk;
    public double ip;
    public int jum;
    public int sks;
    public int ambilsks;
    public int totalsks ;
    
    
    void Data() {
        System.out.print("\nMasukkan Nama Mahasiswa\t: ");
        nama = input.nextLine();
        System.out.print("Masukkan NIM Mahasiswa\t: ");
        nim = input.next();
        System.out.print("Masukkan Jurusan\t: ");
        jur = input.next();    
    }
    void ulangmk(){
        System.out.print("masukkan jumlah mata kuliah pilihan: ");
        jum = input.nextInt();
        for (int i=1; i<=jum;i++){
            System.out.print("mata kuliah pilihan "+i+" \t\t: ");
            mk = input.next(); 
            mk = input.nextLine();
            System.out.print("masukkan kode mata kuliah\t: ");
            kode = input.next();
            System.out.print("jumlah sks\t\t\t: ");
            sks = input.nextInt();
            
            totalsks = totalsks+sks;
            totalmk = mk+"\n"+totalmk;
            
        }
    }
    void ceksks() {
        System.out.print("masukkan jumlah ip semester lalu: ");
        ip = input.nextDouble();
        if (ip >= 3.00 && ip <= 4) {
            System.out.println("*anda bisa mengambil maksimal 24 sks" );

        } else if (ip < 3.00 && ip >= 2.50) {
            System.out.println("*anda bisa mengambil maksimal 21 sks");

        } else if (ip < 2.50 && ip >= 2.00) {
            System.out.println("*anda bisa mengambil maksimal 18 sks");

        } else if (ip < 2.00 && ip >= 1.50) {
            System.out.println("*anda bisa mengambil maksimal 15 sks");

        } else if (ip < 1.50 && ip > 0) {
            System.out.println("*anda bisa mengambil maksimal 12 sks");
        } else {
            System.out.println("*IP yang anda inputkan tidak sesuai");
        }
    }   
    void display (){
        System.out.println("nama mahasiswa\t: "+nama);
        System.out.println("NIM mahasiswa\t: "+nim);
        System.out.println("IP mahasiswa\t: "+ip);
        System.out.println("jurusan\t:"+ jur);
        System.out.println("jumlah sks yang diambil: "+totalsks);
    
    }}
         
              