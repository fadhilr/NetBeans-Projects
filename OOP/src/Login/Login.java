
package Login;

import Data_Anggota.DaftarAnggota;
import Data_Buku.DaftarBuku;
import SistemPerpus.DaftarPetugas;
import java.util.Scanner;

public class Login {
    private static String id;
    public Login(String a){
        id=a;
    }
    public static void login(){
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.print("masukkan Password\t=");
        String pass=input.nextLine();
        if (id.startsWith("p")) {
            String pil1="y";
            do{
            System.out.println("==========================");
            System.out.println("Menu bagi Petugas Perpus :");
            System.out.println("1. input data anggota");
            System.out.println("2. input data petugas");
            System.out.println("3. input data buku");
            System.out.println("4. transaksi pinjam buku");
            System.out.println("5. lihat daftar anggota");
            System.out.println("6. lihat daftar petugas");
            System.out.println("7. lihat daftar buku");
            System.out.println("8. lihat transaksi pinjam buku");
            System.out.println("===========================");
            System.out.print("Masukkan pilihan anda : ");
            int pil=input.nextInt();
            System.out.println("===========================");
            switch (pil) {
                case 1:
                    DaftarAnggota.inputAnggota();
                    break;
                case 2:
                    DaftarPetugas.inputPetugas();
                    break;
                case 3:
                    DaftarBuku.inputBuku();
                    break;
                case 4:
                    DaftarBuku.pinjamBuku();
                    break;
                case 5:
                    DaftarAnggota.lihatAnggota();
                    break;
                case 6:
                    DaftarPetugas.lihatPetugas();
                    break;
                case 7:
                    DaftarBuku.lihatBuku();
                    break;
                case 8:
                    DaftarBuku.lihatPinjamBuku();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
                System.out.print("apakah anda ingin melanjutkan?(y/n)");
                pil1=input1.nextLine();
            }while (pil1.equalsIgnoreCase("y"));
        } else {
            String pil2="y";
            do{
            System.out.println("==========================");
            System.out.println("1. lihat daftar buku");
            System.out.println("2. lihat status buku yang dipinjam");
            System.out.println("===========================");
            System.out.print("Masukkan pilihan anda : ");
            int pil=input.nextInt();
            System.out.println("===========================");
            switch (pil) {
                case 1:
                    DaftarBuku.lihatBuku();
                    break;
                case 2:
                    DaftarBuku.lihatStatusPinjam();
                    break;
                default:
                    System.out.println("Wrong Choice");
            }
                System.out.print("apakah anda ingin melanjutkan?(y/n)");
                pil2=input1.nextLine();
            }while (pil2.equalsIgnoreCase("y"));
        }
    }
}
