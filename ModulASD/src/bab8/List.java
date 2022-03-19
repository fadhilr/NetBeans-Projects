/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;

class Node {
    Object data;
    Node next;
    Node(Object object) {
        this(object, null);
    }
    Node(Object object, Node node) {
        data = object;
        next = node;
    }
    Object getObject() {
        return data;
    }
    Node getNext() {
        return next;
    }
}

public class List {
    private Node nodeAwal;
    private Node nodeAkhir;
    private String nama;
    public List() {
        this("list");
    }
    public List(String namaList) {
        nama = namaList;
        nodeAwal = nodeAkhir = null;
    }
    public void sisipDiAwal(Object dt) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(dt);
        } else {
            nodeAwal = new Node(dt, nodeAwal);
        }
        nodeAkhir.next = nodeAwal;
    }
    public void sisipDiAkhir(Object dt) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node(dt);
        } else {
            nodeAkhir = nodeAkhir.next = new Node(dt);
        }
        nodeAkhir.next = nodeAwal;
    }
    public Object hapusDrDepan() {
        Object itemDihapus = null;
        if (!kosong()) {
            itemDihapus = nodeAwal.data;
            if (nodeAwal == nodeAkhir) {
                nodeAwal = nodeAkhir = null;
            } else {
                nodeAwal = nodeAwal.next;
                nodeAkhir.next = nodeAwal;
            }
        }
        return itemDihapus;
    }
    public boolean kosong() {
        return nodeAwal == null;
    }
    public void cetak() {
        if (kosong()) {
            System.out.printf("Kosong %s\n", nama);
            return;
        }
        System.out.printf("Isi %s adalah : ", nama);
        Node kini = nodeAwal;
        do {
            System.out.printf("%s ", kini.data);
            kini = kini.next;
        }while (kini != nodeAkhir.next);
        System.out.println("\n");
    }
}

