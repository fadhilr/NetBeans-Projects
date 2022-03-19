/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1s2;

import java.util.Scanner;

public class SIAM {
    String nama;
    String nim;
    double ip;
    String jurusan;
    String kode;
    String matkul;
    private String[][] mkpilihan = new String[7][4];
    private int totalSks;
    private String mk[][] = {{"kode MK     |", "SKS |", "Mata Kuliah         |"},
    {"IFK15002", "    | 5  |", "Pemograman Lanjut", "   |"},
    {"UBU0008", "     | 3  |", "Bahasa Inggris", "      |"},
    {"KOM15002", "    | 4  |", "Sistem Digital", "      |"},
    {"PTI15004", "    | 4  |", "Matematika Komputasi", "|"},
    {"UNG4008", "     | 3  |", "Bahasa Indonesia", "    |"},
    {"PTI15007", "    | 4  |", "Sistem Basis Data", "   |"}};

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setIP(double ip) {
        this.ip = ip;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void sks(double ip) {

        int sks = 0;
        if (ip > 4) {
            System.out.println("IP anda salah");
        }
        else if (ip >= 3) {
            sks = 24;
        } else if (ip >= 2.5) {
            sks = 21;
        } else if (ip >= 2) {
            sks = 18;
        } else if (ip >= 1.5) {
            sks = 15;
        } else {
            sks = 11;
        }
        totalSks = sks;
        System.out.println("SKS maksimal yang dapat diambil : " + sks);

    }

    public void mataKuliah() {
        Scanner in = new Scanner(System.in);
        int sks = totalSks;
        String pilih = "y";
        System.out.println("===========Pilihan Mata Kuliah===========");
        do {           System.out.println("=========================================");
            for (int i = 0; i < mk.length; i++) {
                for (int j = 0; j < mk[i].length; j++) {
                    if (mk[i][j] == null) {
                        continue;
                    }
                    System.out.print(mk[i][j]);
                }
                if (mk[i][0] == null) {
                    continue;
                }
                System.out.println();
            }           System.out.println("=========================================");
            System.out.print("Masukkan kode MK    : ");
            kode = in.nextLine();
            System.out.print("Masukkan nama MK    : ");
            matkul = in.nextLine();
            if (kode.equalsIgnoreCase(mk[1][0]) && matkul.equalsIgnoreCase(mk[1][2])) {
                sks = sks - 5;
                for (int i = 0; i <= mk[0].length; i++) {
                    mkpilihan[1][i] = mk[1][i];
                    mk[1][i] = null;
                }
            }
            if (kode.equalsIgnoreCase(mk[2][0]) && matkul.equalsIgnoreCase(mk[2][2])) {
                sks = sks - 3;
                for (int i = 0; i <= mk[0].length; i++) {
                    mkpilihan[2][i] = mk[2][i];
                    mk[2][i] = null;
                }
            }
            if (kode.equalsIgnoreCase(mk[3][0]) && matkul.equalsIgnoreCase(mk[3][2])) {
                sks = sks - 4;
                for (int i = 0; i <= mk[0].length; i++) {
                    mkpilihan[3][i] = mk[3][i];
                    mk[3][i] = null;
                }
            }
            if (kode.equalsIgnoreCase(mk[4][0]) && matkul.equalsIgnoreCase(mk[4][2])) {
                sks = sks - 4;
                for (int i = 0; i <= mk[0].length; i++) {
                    mkpilihan[4][i] = mk[4][i];
                    mk[4][i] = null;
                }
            }
            if (kode.equalsIgnoreCase(mk[5][0]) && matkul.equalsIgnoreCase(mk[5][2])) {
                sks = sks - 3;
                for (int i = 0; i <= mk[0].length; i++) {
                    mkpilihan[5][i] = mk[5][i];
                    mk[5][i] = null;
                }
            }
            if (kode.equalsIgnoreCase(mk[6][0]) && matkul.equalsIgnoreCase(mk[6][2])) {
                sks = sks - 4;
                for (int i = 0; i <= mk[0].length; i++) {
                    mkpilihan[6][i] = mk[6][i];
                    mk[6][i] = null;
                }
            }
            for (int i = 0; i < mk[0].length; i++) {
                mkpilihan[0][i] = mk[0][i];
            }
            if (sks >= 3) {
                System.out.println("Tersisa " + sks + " SKS");
                System.out.print("Apakah anda masih mau mengambil mata kuliah (Y/N)? ");
                pilih = in.nextLine();
            } else {
                pilih = "n";
            }
        } while (pilih.equalsIgnoreCase("y"));
        totalSks = totalSks - sks;

    }

    void tampilan() {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("IP      : " + ip);
        System.out.println("jurusan : " + jurusan);
        System.out.println("------Mata kuliah yang dipilih------");
        for (int i = 0; i < mkpilihan.length; i++) {
            for (int j = 0; j < mkpilihan[i].length; j++) {
                if (mkpilihan[i][j] == null) {
                    continue;
                }
                System.out.print(mkpilihan[i][j]);
            }
            if (mkpilihan[i][0] == null) {
                continue;
            }
            System.out.println();
        }
        System.out.println("SKS yang anda ambil " + totalSks + " SKS");
    }
}

