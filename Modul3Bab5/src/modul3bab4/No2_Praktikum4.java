package modul3bab4;

import java.util.Scanner;

public class No2_Praktikum4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        double jumlah[] = new double[10];
        String jenis[] = new String[10];
        int batas = 0;
        String kereta[][] = {{"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
        {"Bisnis", "100000", "5", "Ada     ", "Tidak Ada"},
        {"Eksekutif", "200000", "7", "Ada     ", "Tidak Ada"},
        {"Pariwisata", "300000", "10", "Ada     ", "Ada     "}};
        int pilih = 1;
        do {
            System.out.print("1. Melihat Daftar Kereta Api"
                    + "\n2. Melihat Daftar Kereta Api yang ada AC"
                    + "\n3. Melihat Daftar Kereta Api yang ada Colokan"
                    + "\n4. Memesan Tiket Kereta Api"
                    + "\n5. Melihat Pesanan Tiket"
                    + "\nMasukkan nilai pilihan : ");
            pilih = input.nextInt();
            System.out.println("");
            switch (pilih) {
                case 1:
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("| Jenis\t\t|| Harga\t|| Diskon\t|| AC\t\t|| Colokan\t|");
                    System.out.println("---------------------------------------------------------------------------------");
                    for (int i = 0; i < kereta.length; i++) {
                        for (int j = 0; j < kereta[0].length; j++) {
                            if (j == 2) {
                                System.out.print("| " + kereta[i][j] + " %\t\t|");
                            } else if (j == 2 && i == 3) {
                                System.out.print("| " + kereta[i][j] + " %\t|");
                            } else {
                                System.out.print("| " + kereta[i][j] + "\t|");
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("| Jenis\t\t|| Harga\t|| Diskon\t|| AC\t\t|| Colokan\t|");
                    System.out.println("---------------------------------------------------------------------------------");
                    for (int i = 0; i < kereta.length; i++) {
                        for (int j = 0; j < kereta[0].length; j++) {
                            if (kereta[i][3] == "Ada     ") {
                                if (j == 4) {
                                    System.out.println("| " + kereta[i][j] + "\t|");
                                } else if (j == 2) {
                                    System.out.print("| " + kereta[i][j] + " %\t\t|");
                                } else if (j == 2 && i == 3) {
                                    System.out.print("| " + kereta[i][j] + " %\t|");
                                } else {
                                    System.out.print("| " + kereta[i][j] + "\t|");
                                }
                            }
                        }
                    }
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("| Jenis\t\t|| Harga\t|| Diskon\t|| AC\t\t|| Colokan\t|");
                    System.out.println("---------------------------------------------------------------------------------");
                    for (int i = 0; i < kereta.length; i++) {
                        for (int j = 0; j < kereta[0].length; j++) {
                            if (kereta[i][4] == "Ada     ") {
                                if (j == 4) {
                                    System.out.println("| " + kereta[i][j] + "\t|");
                                } else if (j == 2) {
                                    System.out.print("| " + kereta[i][j] + " %\t\t|");
                                } else if (j == 2 && i == 3) {
                                    System.out.print("| " + kereta[i][j] + " %\t|");
                                } else {
                                    System.out.print("| " + kereta[i][j] + "\t|");
                                }
                            }
                        }
                    }
                    System.out.println("---------------------------------------------------------------------------------");
                    System.out.println("");
                    break;
                case 4:
                    String ulang = "Y";
                    do {
                        System.out.print("Masukkan jenis tiket : ");
                        jenis[batas] = input1.nextLine();
                        System.out.print("Masukkan jumlah tiket yang dibeli : ");
                        jumlah[batas] = input.nextInt();
                        System.out.print("Apakah anda ingin memesan lagi ? (y/n) : ");
                        ulang = input1.nextLine();
                        batas++;
                        System.out.println("");
                    } while (ulang.equalsIgnoreCase("y"));
                    break;
                case 5:
                    double hasil;
                    int total;
                    for (int i = 0; i < batas; i++) {
                        if (jenis[i].equalsIgnoreCase("Ekonomi")) {
                            hasil = Double.valueOf(kereta[0][1])
                                    - (Double.valueOf(kereta[0][1]) * (Double.valueOf(kereta[0][2]) / 100));
                            total = (int) (jumlah[i] * hasil);
                            System.out.println("Total harga tiket Ekonomi adalah " + total);
                        } else if (jenis[i].equalsIgnoreCase("Bisnis")) {
                            hasil = Double.valueOf(kereta[1][1])
                                    - (Double.valueOf(kereta[1][1]) * (Double.valueOf(kereta[1][2]) / 100));
                            total = (int) (jumlah[i] * hasil);
                            System.out.println("Total harga tiket Bisnis adalah " + total);
                        } else if (jenis[i].equalsIgnoreCase("Eksekutif")) {
                            hasil = Double.valueOf(kereta[2][1])
                                    - (Double.valueOf(kereta[2][1]) * (Double.valueOf(kereta[2][2]) / 100));
                            total = (int) (jumlah[i] * hasil);
                            System.out.println("Total harga tiket Eksekutif adalah " + total);
                        } else if (jenis[i].equalsIgnoreCase("Pariwisata")) {
                            hasil = Double.valueOf(kereta[3][1])
                                    - (Double.valueOf(kereta[3][1]) * (Double.valueOf(kereta[3][2]) / 100));
                            total = (int) (jumlah[i] * hasil);
                            System.out.println("Total harga tiket Pariwisata adalah " + total);
                        }
                    }
                    System.out.println("");
                    break;
                default :
                    break;
            }
        } while (pilih <= 5);
    }
}
