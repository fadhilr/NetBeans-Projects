/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSingleLinkedList;

class Node {
    Mahasiswa data;
    Node next;
}

public class SingleLinkedList {
    private Node pointer;

    public SingleLinkedList () {
        pointer = null;
    }

    public void buatNode(Mahasiswa dt) {
        Node nodeBaru = new Node();
        nodeBaru.data = dt;
        nodeBaru.next = pointer;
        pointer = nodeBaru;
    }
    public Mahasiswa hapusDiDepan() {
        Node hapus = pointer;
        pointer = pointer.next;
        return hapus.data;
    }

    public void sisipDataDiAkhir(Mahasiswa data) {
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = pointer;
        Node baru = new Node();
        baru.data = data;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }

    public void sisipDataUrut(Mahasiswa data) {
        this.buatNode(data);
        Node i = pointer;
        while (i != null) {
            Node j = i.next;
            while (j != null) {
                if (j.data.getIPK() > i.data.getIPK()) {
                    Mahasiswa ats = i.data;
                    i.data = j.data;
                    j.data = ats;
                }
                j = j.next;
            }
            i = i.next;
        }
    }

    public void hapusData(Mahasiswa dataHapus) {
        Node n = pointer;
        while ((n != null) && (n.next.data != dataHapus)) {
            n = n.next;
        }
        n.next = n.next.next;
    }
    
public static SingleLinkedList gabung(SingleLinkedList L1, SingleLinkedList L2) {
        Node a = L1.getPointer();
        while (a.next != null) {
            a = a.next;
        }
        a.next = L2.getPointer();
        return L1;
    }
    public Node getPointer() {
        return pointer;
    }

    public void cetak(String kom) {
        System.out.println(kom);
        Node n = pointer;
        while (n != null) {
            System.out.println(n.data.getNama()+ " - " + n.data.getNIM()+ " - " + n.data.getIPK() +" -> ");
            n = n.next;
        }
        System.out.println("NULL");   
    }
}
