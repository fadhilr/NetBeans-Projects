
package siam;

import java.util.Scanner;

public class SIAM {

    public static void main(String[] args) {
        Scanner input  = new Scanner (System.in);
        
        System.out.println("SELAMAT DATANG DALAM PROGRAM SISTEM INFORMASI AKADEMIK MAHASISWA");
        System.out.println("\t FAKULTAS ILMU KOMPUTER UNIVERSITAS BRAWIJAYA\n");
        System.out.println("**sebelum mengisi KRS anda, silahkan membaca ketentuan dibawah** ");
        
        System.out.println("\nINDEKS PRESTASI SEMESTER SEBELUMNYA");
        System.out.println("ip >= 3,00\t\t24 sks");
        System.out.println("2,50 <= ip < 3,00\t21 sks");
        System.out.println("2,00 <= ip < 2,50\t18 sks");
        System.out.println("1,50 <= ip < 2,00\t15 sks");
        System.out.println("ip < 1,50\t\t12 sks");
        System.out.println();

        System.out.println("KODE MATA KULIAH        MATA KULIAH                          JUMLAH SKS");
        System.out.println("UNG4001                 Agama Islam                          \t3");
        System.out.println("KOM15003                Arsitektur dan Organisasi Komputer   \t3");
        System.out.println("UBU00008                Bahasa Inggris                       \t3");
        System.out.println("IFK15202                Desain dan Analisis Algoritma        \t3");
        System.out.println("IFK15001                Matematika Komputasi Lanjut          \t4");
        System.out.println("PTI15006                Probabilitas dan Statistika          \t4");
        System.out.println("IFK15002                Pemrograman Lanjut                   \t5");
        System.out.println("PTI15010                Pemrograman web                      \t4");
        System.out.println("PTI15008                Sistem Operasi                       \t4");
        System.out.println("IFK15012                Game Production                      \t3");
        System.out.println("IFK15101                Pemodelan berorientasi Objek         \t3");
              
        System.out.println("\n**Data Untuk 3 Mahasiswa**");
        System.out.println("**Silahkan Mengambil Jumlah SKS dari Jumlah IP Semester lalu Berdasarkan Ketentuan diatas**");
        
        sistemAkademik mhs1 = new sistemAkademik ();
        mhs1.Data();
        mhs1.ceksks();
        System.out.println("********************************************");
        System.out.println("\tisi KRS anda");
        mhs1.ulangmk();
        System.out.println("============================================");
        
        sistemAkademik mhs2 = new sistemAkademik ();
        mhs2.Data();
        mhs2.ceksks();
        System.out.println("********************************************");
        System.out.println("\tisi KRS anda");
        mhs2.ulangmk();
        System.out.println("============================================");
        
        sistemAkademik mhs3 = new sistemAkademik ();
        mhs3.Data();
        mhs3.ceksks();
        System.out.println("********************************************");
        System.out.println("\tisi KRS anda");
        mhs3.ulangmk();
        System.out.println("============================================");

        mhs1.display();
        mhs2.display();
        mhs3.display();             
}
}
