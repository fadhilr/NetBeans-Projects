/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

class NodeCDLL {
    Mahasiswa2 data;
    NodeCDLL prev, next;
}

public class CircularDoubleLinkedList {

    private NodeCDLL pAwal, pAkhir;
    private int counter;

    public CircularDoubleLinkedList() {
        pAwal = null; pAkhir = null; counter = -1;
    }

    public void SisipDataDiAwal(Mahasiswa2 data) {
        NodeCDLL pBaru = new NodeCDLL();
        pBaru.data = data;
        pBaru.next = null;
        if (pAwal == null) {
            pAwal = pBaru; pAkhir = pBaru;
            pAkhir.next = pAwal; pAwal.prev = pAkhir;
            counter = 0;
        } else {
            pBaru.next = pAwal; pBaru.prev = pAkhir;
            pAwal.prev = pBaru; pAkhir.next = pBaru;
            pAwal = pBaru;
            counter++;
        }
    }

    public void hapusData(Mahasiswa2 dtHapus) {
        NodeCDLL pSblmHapus, pHapus;
        pSblmHapus = null; pHapus = pAwal;
        do {
            pSblmHapus = pHapus;
            pHapus = pHapus.next;
   } while (pHapus != pAkhir.next && pHapus.data != dtHapus);
        if (pHapus != null) {
            if (pHapus == pAwal) {
                pAwal = pAwal.next;
                pAwal.prev = pAkhir;
                counter--;
            } else if (pHapus == pAkhir) {
                hapusSatuDataDiAkhir();
            } else {
                pSblmHapus.next = pHapus.next;
                (pHapus.next).prev = pSblmHapus;
                counter--;
            }
        } else {
            System.out.println("Data tidak ada ");
        }
    }

    public Object hapusSatuDataDiAkhir() {
        int i = 0;
        NodeCDLL temp = pAwal;
        while ((i < counter) && (i != -1)) {
            temp = temp.next;
            i++;
        }
            NodeCDLL hapus = pAkhir;
            Object tmp = hapus.data;
            temp.next = pAwal;
            pAwal.prev = temp;
            this.counter--;
        return tmp;
    }

    public void cetak(String Komentar) {
        System.out.println(Komentar);
        NodeCDLL pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < counter)) {
       System.out.println(pCetak.data.getNama() + " - " + pCetak.data.getNIM() + " - " + pCetak.data.getIPK() + " ->");
            pCetak = pCetak.next;
            i++;
        }
        System.out.println("\n");
    }

    public void cetakIPK3(String Komentar) {
        System.out.println(Komentar);
        NodeCDLL pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < counter)) {
            if (pCetak.data.getIPK() > 3) {
          System.out.println(pCetak.data.getNama() + " - " + pCetak.data.getNIM() + " - " + pCetak.data.getIPK() + " ->");
            }
            pCetak = pCetak.next;
            i++;
        }
        System.out.println("\n");
    }
}

class Mahasiswa2 {

    private String nama, NIM;
    private double IPK;

    public Mahasiswa2(String nama, String NIM, double IPK) {
        this.nama = nama; this.NIM = NIM;  this.IPK = IPK;
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
        
        CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
        
        Mahasiswa2 mhs1 = new Mahasiswa2("145150200111111", "Fadhil", 3.2);
        Mahasiswa2 mhs2 = new Mahasiswa2("145150207111679", "Rizqullah", 2.2);
        Mahasiswa2 mhs3 = new Mahasiswa2("145150201111029", "Saniputra", 3.6);
        Mahasiswa2 mhs4 = new Mahasiswa2("145150207111109", "Nanda", 3.5);
        
        cdll.SisipDataDiAwal(mhs1);
        cdll.SisipDataDiAwal(mhs2);
        cdll.SisipDataDiAwal(mhs3);
        cdll.SisipDataDiAwal(mhs4);
        cdll.cetak("Isi CDLL awal");
        
        cdll.cetakIPK3("Isi CDLL awal dengan IPK > 3");
        
        cdll.hapusData(mhs3);
        cdll.cetak("Isi CDLL setelah data Revin dihapus");
        
        cdll.hapusSatuDataDiAkhir();
   cdll.cetak("Isi CDLL setelah satu data di akhir dihapus");
    }
}

