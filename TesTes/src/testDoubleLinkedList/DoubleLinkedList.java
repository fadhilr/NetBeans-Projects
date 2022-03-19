/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDoubleLinkedList;

class NodeDLL{
    NodeDLL next, prev;
    Mahasiswa data;

    public NodeDLL() {
        next = null;  prev = null;
    }
}

public class DoubleLinkedList {

    NodeDLL pKepala, pEkor;

    public void sisipDiAwal(Mahasiswa dt) {
        NodeDLL temp = new NodeDLL();
        temp.data = dt;
        if (pKepala == null) {
            temp.prev = pKepala; temp.next = pEkor;
            pKepala = temp;  pEkor = temp;
        } else {
            temp.next = pKepala;
            pKepala.prev = temp;
            pKepala = temp;
        }
    }

    public void sisipDiAkhir(Mahasiswa dt) {
        NodeDLL temp = new NodeDLL();
        temp.data = dt; temp.next = null;
        if (pEkor != null) {
            temp.prev = pEkor;
            pEkor.next = temp;
            pEkor = temp;
        } else {
            pEkor = temp; pKepala = temp;
        }
    }

    public void hapusData(String dt) {
        int i = 0;
        NodeDLL n = pKepala;
        NodeDLL pAkhir = pEkor;
        if (n == null) {
            System.out.println("Data mahasiswa kosong.");
            return;
        }
   if ((n == pAkhir) && (pKepala.data.getNIM().equals(dt))) {
            pKepala = null; pEkor = null;
            i++;
            return;
        } else if (n == pAkhir && !pKepala.data.getNIM().equals(dt)) {
      System.out.println("NIM " + dt + " tidak terdaftar.");
            return;
        }

  while ((n.next != null) && (n.data.getNIM().equals(dt))) {
            pKepala = n.next;
            n = pKepala;
            i++;
        }
        while (n.next.next != null) {
            if (n.next.data.getNIM().equals(dt)) {
                n.next = n.next.next;
                i++;
                continue;
            }
            n = n.next;
        }
    if (n.next.data.getNIM().equals(dt) && n.next != null) {
            n.next = null;
            pEkor = n;
            i++;
        }
        if (i == 0) {
     System.out.println("Data " + dt + " tidak ada di list");
        } else {
System.out.println("Isi DLL setelah NIM " + dt + " dihapus");
        }
    }

    public void sisipDataUrut(Mahasiswa dt) {
        NodeDLL n;
        NodeDLL baru = new NodeDLL();
        baru.data = dt;
        if (pKepala == null) {
            pKepala = baru; pEkor = baru;
            baru.next = null;
        } else if (pKepala != null) {
            baru.next = pKepala;
            pKepala.prev = baru;
            pKepala = baru;
        }
        n = pKepala;
        Mahasiswa temp;
        while (n.next != null) {
            if (n.data.getIPK() > n.next.data.getIPK()) {
                temp = n.next.data;
                n.next.data = n.data;
                n.data = temp;
                n.next.prev = n;
                n = n.next;
            } else {
                n = n.next;
            }
        }
    }

    public void cetak(String kom) {
        System.out.println(kom);
        NodeDLL n = pKepala;
   System.out.println("  NAMA           NIM            IPK");
        while (n != null) {
            System.out.println(n.data.getNama() + "       " + n.data.getNIM() + "     " + n.data.getIPK());
            n = n.next;
        }
    }
}
