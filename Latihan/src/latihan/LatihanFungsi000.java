package Semester1_BuIndri;

import java.util.Scanner;

public class LatihanFungsi000 {
    public static void main(String[] args) {
        Scanner moco = new Scanner(System.in);
//===================================================//
        System.out.print("NIM           : ");
        String nim = moco.nextLine();
        System.out.print("Nama          : ");
        String nama = moco.nextLine();

        System.out.println("");

        System.out.print("Mata Kuliah 1 : ");
        String matkul1 = moco.nextLine();
        int pmatkul1    = matkul1.length();
        System.out.print("Jumlah SKS    : ");
        int sks1 = moco.nextInt();
        System.out.print("Nilai         : ");
        double nilai1 = moco.nextDouble();
        System.out.println("");

        System.out.print("Mata Kuliah 2 : ");
        String matkul2 = moco.next();
        int pmatkul2    = matkul2.length();
        System.out.print("Jumlah SKS    : ");
        int sks2 = moco.nextInt();
        System.out.print("Nilai         : ");
        double nilai2 = moco.nextDouble();

        System.out.println("");

        System.out.print("Mata Kuliah 3 : ");
        String matkul3 = moco.next();
        int pmatkul3    = matkul3.length();
        System.out.print("Jumlah SKS    : ");
        int sks3 = moco.nextInt();
        System.out.print("Nilai         : ");
        double nilai3 = moco.nextDouble();

        System.out.println("");

        System.out.print("Mata Kuliah 4 : ");
        String matkul4 = moco.next();
        int pmatkul4    = matkul4.length();
        System.out.print("Jumlah SKS    : ");
        int sks4 = moco.nextInt();
        System.out.print("Nilai         : ");
        double nilai4 = moco.nextDouble();
        System.out.println("");

//===================================================//
        System.out.println("Tabel         : ");
        System.out.println("╔═══════════════╦═══╦═════════╗");
        System.out.println("║       Mata Kuliah       ║ SKS ║  Nilai(Huruf) ║");
        System.out.println("╠═══════════════╬═══╬═════════╣");
        System.out.print  ("║ "+matkul1); for(int a=1;a<=(24-pmatkul1);a++){System.out.print(" ");}
        System.out.println("║  "+(int)sks1+"  ║       "+nilaiHuruf(nilai1)+"       ║");
        System.out.print  ("║ "+matkul2); for(int a=1;a<=(24-pmatkul2);a++){System.out.print(" ");}
        System.out.println("║  "+(int)sks2+"  ║       "+nilaiHuruf(nilai2)+"       ║");
        System.out.print  ("║ "+matkul3); for(int a=1;a<=(24-pmatkul3);a++){System.out.print(" ");}
        System.out.println("║  "+(int)sks3+"  ║       "+nilaiHuruf(nilai3)+"       ║");
        System.out.print  ("║ "+matkul4); for(int a=1;a<=(24-pmatkul4);a++){System.out.print(" ");}
        System.out.println("║  "+(int)sks4+"  ║       "+nilaiHuruf(nilai4)+"       ║");
        System.out.println("╠═══════════════╬═══╩═════════╣");
        System.out.println("║         IPK             ║          "+ipk(sks1, sks2, sks3, sks4)+"         ║");
        System.out.println("╚═══════════════╩═════════════╝");
    }

    static String nilaiHuruf(double x) {
        if (x >= 81 & x <= 100) {
            return "A";
        } else if (x >= 71 & x <= 80) {
            return "B";
        } else if (x >= 61 & x <= 70) {
            return "C";
        } else if (x >= 51 & x <= 60) {
            return "D";
        } else {
            return "E";
        }
    }

    static double nilaiAngka(String x) {
        if (x == "A") {
            return 4;
        } else if (x == "B") {
            return 3.5;
        } else if (x == "C") {
            return 3;
        } else if (x == "D") {
            return 2.5;
        } else {
            return 2;
        }
    }

    static double ipk(double w, double x, double y, double z) {
        double ipk = (4 * (w + x + y + z)) / (w + x + y + z);
        return ipk;
    }
}
