package projectakhirpl;

import java.util.Scanner;

public class ProjectAkhirPL {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String maskapai = "", pul= "", kot = "", tanggal;
        int kota, pulau, tgl, bln;
        double biaya = 0;

        System.out.println("Dindannisa Nur Hakim Wardhana Travel");
        System.out.println("\n\t== Maskapai ==");
        System.out.println("1. Garuda Indonesia\n2. Sriwijaya Air\n3. Lion Air");
        System.out.print("Pilihan maskapai anda : ");
        int mask = in.nextInt();

        System.out.println("\n\t== Destinasi ==");
        System.out.println("1. Sulawesi");
        System.out.println("2. Kalimantan");
        System.out.println("3. Jawa");
        System.out.print("Masukkan pilihan anda : ");
        pulau = in.nextInt();
        if (pulau == 1) {
            pul = "Sulawesi";
            System.out.println("\t== Sulawesi ==");
            System.out.println("1. Makassar \n2. Kendari \n3. Mamasa \n4. Manado \n5. Gorontalo");
            System.out.print("Masukkan pilihan kota tujuan : ");
            kota = in.nextInt();
            if (kota == 1) {
                kot = "Makassar";
            } else if (kota == 2) {
                kot = "Kendari";
            } else if (kota == 3) {
                kot = "Mamasa";
            } else if (kota == 4) {
                kot = "Manado";
            } else if (kota == 5) {
                kot = "Gorontalo";
            }
        } else if (pulau == 2) {
            pul = "Kalimantan";
            System.out.println("\t== Kalimantan ==");
            System.out.println("1. Palangkaraya \n2. Balikpapan \n3. Samarinda \n4. Pontianak \n5.Banjarmasin");
            System.out.println("Masukkan pilihan kota tujuan : ");
            kota = in.nextInt();
            if (kota == 1) {
                kot = "Palangkaraya";
            } else if (kota == 2) {
                kot = "Balikpapan";
            } else if (kota == 3) {
                kot = "Samarinda";
            } else if (kota == 4) {
                kot = "Pontianak";
            } else if (kota == 5) {
                kot = "Banjarmasin";
            }
        } else if (pulau == 3) {
            pul = "Jawa";
            System.out.println("\t== Jawa ==");
            System.out.println("1. Bandung \n2. Surabaya \n3. Semarang \n4. Yogyakarta");
            System.out.print("Masukkan pilihan kota tujuan : ");
            kota = in.nextInt();
            if (kota == 1) {
                kot = "Bandung";
            } else if (kota == 2) {
                kot = "Surabaya";
            } else if (kota == 3) {
                kot = "Semarang";
            } else if (kota == 4) {
                kot = "Yogyakarta";
            }
        }

        System.out.println("\nTanggal keberangkatan (dd/mm): ");
        tanggal = in.next();
        tgl = Integer.parseInt(tanggal.substring(0, 2));
        bln = Integer.parseInt(tanggal.substring(3, 5));
        System.out.println(tgl + " " + bln);
        
        if(mask == 1){
            maskapai = "Garuda Indonesia";
            Garuda g = new Garuda(pul, kot, tgl, bln);
            g.display();
            biaya = g.getTotalBiaya();
        } else if(mask ==2) {
            maskapai = "Sriwijaya Air";
            Sriwijaya s = new Sriwijaya (pul, kot, tgl, bln);
            s.display();
            biaya = s.getTotalBiaya();
        } else if(mask == 3) {
            maskapai = "Lion Air";
            Lion l = new Lion (pul, kot, tgl, bln);
            l.display();
            biaya = l.getTotalBiaya();
        }

        System.out.println("\nBooking Seat? (ya  ||  tidak)");
        System.out.print("Jawaban: ");
        String jawab = in.next();
        if ("ya".equals(jawab)) {
            System.out.println("\nIsi data berikut");
            System.out.print("Nama\t\t:");
            String nama = in.next();
            System.out.print("No.Identitas\t:");
            String noID = in.next();
            System.out.print("Jenis Kelamin\t:");
            String jk = in.next();

            DataPemesan orang = new DataPemesan(nama, noID, jk, maskapai);
            System.out.println();
            orang.Display();
            System.out.println("Tujuan\t\t\t:" + pul + " -- " + kot);
            System.out.println("Biaya perjalan anda\t:" + biaya);
            System.out.println("\nSilahkan melakukan pembayaran pada loket yang tersedia.");
        } else if ("tidak".equals(jawab)) {
            System.out.println("Terimakasih");
        }
    }
}