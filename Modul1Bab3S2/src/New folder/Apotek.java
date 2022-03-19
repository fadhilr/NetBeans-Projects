package Soal2;
import java.util.Scanner;
public class Apotek {
    private String nama;
    private String alamat;
    private String kode ;
    int i, harga,jumlah;
    String[] simpanNamaObat = new String [8];
    int[] simpanHargaObat = new int [8];
    int [] simpanJumlahObat = new int [8];
    private static int total;
    Scanner in = new Scanner (System.in);
    public Apotek() {
        nama = "";
        alamat = "";
    }
    public Apotek (String n, String a){
        nama = n;
        alamat = a;
    }
    public void setNama(String n){
        nama = n;
    }
    public void setAlamat(String a){
        alamat = a;
    }
    public void PilihanObat(){
        String pilih;
        System.out.println("");
        System.out.println("PILIHAN OBAT YANG TERSEDIA : ");
        System.out.println("-----------------------------------------------------");
        System.out.println("| KODE |           NAMA OBAT         |     HARGA    |");
        System.out.println("-----------------------------------------------------");
        System.out.println("| BTK1 | OBAT BATUK DEWASA           | Rp. 35.000   |");
        System.out.println("| BTK2 | OBAT BATUK ANAK ANAK        | Rp. 20.000   |");
        System.out.println("| PSG  | OBAT SAKIT KEPALA           | Rp.  5.000   |");
        System.out.println("| ATB  | OBAT ANTIBIOTIK             | Rp. 15.000   |");
        System.out.println("| MBK  | OBAT ANTI MABUK             | Rp. 25.000   |");
        System.out.println("| BTD  | OBAT LUKA (SALEB)           | Rp. 10.000   |");
        System.out.println("| PRB  | PERBAN                      | Rp. 10.000   |");
        System.out.println("-----------------------------------------------------");
        i=0;
        do{
            System.out.print("Masukan Kode : ");
            kode = in.next();
            if (kode.equalsIgnoreCase("btk1")){
                System.out.println("Obat Batuk Dewasa");
                simpanNamaObat[i]="OBAT BATUK DEWASA           ";
                System.out.print("Masukan jumlah barang : ");
                jumlah = in.nextInt();
                simpanJumlahObat[i]=jumlah;
                harga=jumlah*35000;
                simpanHargaObat[i]= harga;
                total+=harga;
                i++;
            }else if (kode.equalsIgnoreCase("btk2")){
                System.out.println("Obat Batuk Anak-anak");
                simpanNamaObat[i]="OBAT BATUK ANAK ANAK        ";
                System.out.print("Masukan jumlah barang : ");
                jumlah = in.nextInt();
                simpanJumlahObat[i]=jumlah;
                harga=jumlah*20000;
                simpanHargaObat[i]= harga;
                total+=harga;
                i++;
            }else if (kode.equalsIgnoreCase("psg")){
                System.out.println("Obat Sakit Kepala");
                simpanNamaObat[i]="OBAT SAKIT KEPALA           ";
                System.out.print("Masukan jumlah barang : ");
                jumlah = in.nextInt();
                simpanJumlahObat[i]=jumlah;
                harga=jumlah*5000;
                simpanHargaObat[i]= harga;
                total+=harga;
                i++;
            }else if (kode.equalsIgnoreCase("atb")){
                System.out.println("Obat Antiiotik");
                simpanNamaObat[i]="OBAT ANTIBIOTIK             ";
                System.out.print("Masukan jumlah barang : ");
                jumlah = in.nextInt();
                simpanJumlahObat[i]=jumlah;
                harga=jumlah*15000;
                simpanHargaObat[i]= harga;
                total+=harga;
                i++;
            }else if (kode.equalsIgnoreCase("mbk")){
                System.out.println("Obat Anti Mabuk");
                simpanNamaObat[i]="OBAT ANTI MABUK             ";
                System.out.print("Masukan jumlah barang : ");
                jumlah = in.nextInt();
                simpanJumlahObat[i]=jumlah;
                harga=jumlah*25000;
                simpanHargaObat[i]= harga;
                total+=harga;
                i++;
            }else if (kode.equalsIgnoreCase("btd")){
                System.out.println("Obat Luka (Saleb)");
                simpanNamaObat[i]="OBAT LUKA (SALEB)           ";
                System.out.print("Masukan jumlah barang : ");
                jumlah = in.nextInt();
                simpanJumlahObat[i]=jumlah;
                harga=jumlah*10000;
                simpanHargaObat[i]= harga;
                total+=harga;
                i++;
            }else if (kode.equalsIgnoreCase("prb")){
                System.out.println("Perban");
                simpanNamaObat[i]="PERBAN                      ";
                System.out.print("Masukan jumlah barang : ");
                jumlah = in.nextInt();
                simpanJumlahObat[i]=jumlah;
                harga=jumlah*10000;
                simpanHargaObat[i]= harga;
                total+=harga;
                i++;
            }else
                System.out.println("Kode yang dimasukan salah");
            
            System.out.print("Apakah anda ingin menambah barang (Y/N) : ");
            pilih = in.next();
        }while (pilih.equalsIgnoreCase("Y"));    
    }
    public void InfromasiTransaksi(){
        System.out.println("");
        System.out.println("=========== INFORMASI PENJUALAN APOTEK ===========");
        System.out.println("Nama   : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("Daftar Obat yang dibeli : ");
        for(int j=0; j<i;j++){
            System.out.println((j+1)+". "+simpanNamaObat[j]+" "+ simpanJumlahObat[i]+"          Rp."+simpanHargaObat[j]);
        }
            System.out.println("----------------------------------------------------");
            System.out.println("Total :                                Rp."+total);
    } 
}
