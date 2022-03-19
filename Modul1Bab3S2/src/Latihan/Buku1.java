package Latihan;

import java.util.*;

public class Buku1 {

    static ArrayList<String> judul = new ArrayList<String>();

    static ArrayList<Boolean> lokal         = new ArrayList<Boolean>(),
                              nasional      = new ArrayList<Boolean>(),
                              internasional = new ArrayList<Boolean>();

    static int nLokal = 0, nNasional = 0, nInternasional = 0;

    public static void tambah() {
        do {
            System.out.print("? Judul               : ");
            judul.add(new Scanner(System.in).nextLine());
            System.out.println("? Tingkat Penghargaan : ");
            System.out.println("  ? Isi dengan true/false ?");
            System.out.print("  Lokal         : ");
            lokal.add(new Scanner(System.in).nextBoolean());
            System.out.print("  Nasional      : ");
            nasional.add(new Scanner(System.in).nextBoolean());
            System.out.print("  Internasional : ");
            internasional.add(new Scanner(System.in).nextBoolean());

            System.out.print("Tambah (y/n)? ");
        } while (new Scanner(System.in).nextLine().equalsIgnoreCase("y"));
    }

    public static void tampil() {
        System.out.print("1. Best Seller Lokal\n"
                + "2. Best Seller Nasional\n"
                + "3. Best Seller Internasional\n"
                + "4. Received All Awards\n"
                + "5. No Awwards\n"
                + "Pilih : ");
        switch (new Scanner(System.in).nextByte()) {
            case 1:
                System.out.println("=========== LOKAL ============");
                System.out.println("Daftar Judul :");
                nLokal = tampil(lokal);
                System.out.println("??????????????????");
                System.out.println("Total Buku : " + nLokal);
                break;
            case 2:
                System.out.println("========== NASIONAL ==========");
                System.out.println("Daftar Judul :");
                nNasional = tampil(nasional);
                System.out.println("??????????????????");
                System.out.println("Total Buku : " + nNasional);
                break;
            case 3:
                System.out.println("======= INTERNASIONAL ========");
                System.out.println("Daftar Judul :");
                nInternasional = tampil(internasional);
                System.out.println("??????????????????");
                System.out.println("Total Buku : " + nInternasional);
                break;
            case 4:
                System.out.println("======== ALL AWARDS =========");
                System.out.println("Daftar Judul :");
                int n = 0;
                for (int l = 0; l < judul.size(); l++) {
                    if (lokal.get(l) && nasional.get(l) && internasional.get(l)) {
                        System.out.println("Masuk if index ke-"+l);
                        System.out.println("? " + judul.get(l));
                        n++;
                    }
                }
                System.out.println("??????????????????");
                System.out.println("Total Buku : " + n);
                break;
            case 5:
                System.out.println("========= NO AWARDS =========");
                System.out.println("Daftar Judul :");
                n = 0;
                for (int l = 0; l < judul.size(); l++) {
                    if (!lokal.get(l) && !nasional.get(l) && !internasional.get(l)) {
                        System.out.println("? " + judul.get(l));
                        n++;
                    }
                }
                System.out.println("??????????????????");
                System.out.println("Total Buku : " + n);
                break;
            default:
                break;
        }
    }

    public static int tampil(ArrayList<Boolean> a) {
        int n = 0;
        for (int l = 0; l < a.size(); l++) {
            if (a.get(l)) {
                System.out.println("? " + judul.get(l));
                n++;
            }
        }
        return n;
    }
}
