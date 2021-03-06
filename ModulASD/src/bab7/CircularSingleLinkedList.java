/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab7;

class NodeCSLL {
    Object data;
    NodeCSLL next;
}

public class CircularSingleLinkedList {

    private NodeCSLL pAwal, pAkhir;
    private int counter;

    public CircularSingleLinkedList() {
        pAwal = null; pAkhir = null;
        counter = -1;
    }

    public void SisipDataDiAwal(Object data) {
        NodeCSLL pBaru = new NodeCSLL();
        pBaru.data = data;
        pBaru.next = null;
        if (pAwal == null) {
            pAwal = pBaru; pAkhir = pBaru;
            pBaru.next = pAwal;
            counter = 0;
        } else {
            pBaru.next = pAwal;
            pAwal = pBaru;
            pAkhir.next = pAwal;
            counter++;
        }
    }

    public void hapusData(Object dtHapus) {
        if (pAwal != null) {
            NodeCSLL pSbl, pKini, pHapus;
            pSbl = null; pKini = pAwal;
            boolean ketemu = false;
            int i = -1;
            if (pAwal != null) {
                i = 0;
            }
            while (!ketemu && (i <= counter) && (i != -1)) {
                if (pKini.data.equals(dtHapus)) {
                    ketemu = true;
                } else {
                    pSbl = pKini;
                    pKini = pKini.next;
                }
                i++;
            }
            if (ketemu) {
                if (pSbl == null) {
                    pHapus = pAwal;
                    pHapus = null;
                } else {
                    pSbl.next = pKini.next;
                    pHapus = pKini;
                    pHapus = null;
                }
                this.counter--;
            }
        }
    }

    public Object hapusSatuDataDiAkhir() {
        int i = 0;
        NodeCSLL pKini = pAwal;
        while ((i < counter - 1) && (i != -1)) {
            pKini = pKini.next;
            i++;
        }
        NodeCSLL pHapus = pAkhir;
        Object tmp = pHapus.data;
        pKini.next = pAwal;
        this.counter--;
        return tmp;
    }

    public void cetak(String Komentar) {
        System.out.println(Komentar);
        NodeCSLL pCetak;
        pCetak = pAwal;
        int i = -1;
        while ((i < counter)) {
            System.out.print(pCetak.data + "->");
            pCetak = pCetak.next;
            i++;
        }
        System.out.println();
    }

public static void main(String[] args) {

        CircularSingleLinkedList csll = new CircularSingleLinkedList();
        csll.SisipDataDiAwal(new Integer(50));
        csll.SisipDataDiAwal(new Integer(60));
        csll.SisipDataDiAwal(new Integer(70));
        csll.SisipDataDiAwal(new Integer(8));
        csll.SisipDataDiAwal(new Integer(9));
        csll.SisipDataDiAwal(new Integer(90));
        csll.SisipDataDiAwal(new Integer(19));
        csll.cetak("csll Asal");
        csll.hapusData(8);
        csll.cetak("csll stl 8 di hapus");
        csll.hapusData(90);
        csll.cetak("csll stl 90 di hapus");
        csll.hapusSatuDataDiAkhir();
        csll.cetak("csll stl satu data di akhir dihapus");
    }
}
