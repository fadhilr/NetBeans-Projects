/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSingleLinkedList;

public class Mahasiswa {
    private String nama, NIM;
    private double IPK;

    public Mahasiswa(String nama, String NIM, double IPK) {
        this.nama = nama;
        this.NIM = NIM;
        this.IPK = IPK;
    }

    String getNama() {
        return nama;
    }

    String getNIM() {
        return NIM;
    }

    double getIPK() {
        return IPK;
    }

    public static void main(String[] args) {      
        SingleLinkedList l = new SingleLinkedList();
        Mahasiswa mhs1 = new Mahasiswa("145150200111111", "Fadhil", 3.4);  
        Mahasiswa mhs2 = new Mahasiswa("145150207111679", "Budi", 2.5);   
     Mahasiswa mhs3 = new Mahasiswa("145150201111029", "Rizqullah", 3.7);   
        l.buatNode(mhs1);
        l.buatNode(mhs2);
        l.buatNode(mhs3);
        l.cetak("LL Mahasiswa asal : ");
        System.out.println();
  
        Mahasiswa mhs4 = new Mahasiswa("145150207111109", "Indah", 3.5);
        Mahasiswa mhs5 = new Mahasiswa("145150201111239", "Ana", 3.43);
        l.sisipDataUrut(mhs4);
        l.sisipDataUrut(mhs5); 
        l.cetak("LL sisip data urut mahasiswa ke 4 & 5 : Indah & Ana"); 
        System.out.println();
        
        l.hapusDiDepan();
        l.cetak("LL mahasiswa dihapus di depan ");
        System.out.println();
        
        l.hapusData(mhs5);
        l.cetak("LL setelah mahasiswa Ana dihapus");
        System.out.println();
        
        Mahasiswa mhs6 = new Mahasiswa("145150207111469", "Evi", 2.3);
        l.sisipDataDiAkhir(mhs6);
        l.cetak("LL mahasiswa sisip data di akhir");

       System.out.println();
        
        Mahasiswa mhs7 = new Mahasiswa("145150207111219", "Evina", 3.1);
        Mahasiswa mhs8 = new Mahasiswa("145150207111349", "Ria", 2.5);
        SingleLinkedList l2 = new SingleLinkedList();        
        l2.buatNode(mhs7);
        l2.buatNode(mhs8);
        l2.cetak("Linked list kedua ");
        
        System.out.println();
        
        SingleLinkedList L3 = SingleLinkedList.gabung(l, l2);
        L3.cetak("LL gabungan L1 dan L2");      
    }
}
