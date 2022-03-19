/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;
class Node2 {
    int data;
    Node2 next;
    Node2(int object) {
        this(object, null);
    }
    Node2(int object, Node2 node) {
        data = object;
        next = node;
    }
    int getObject() {
        return data;
    }
    Node2 getNext() {
        return next;
    }
}

public class List2 {
    private Node2 nodeAwal, nodeAkhir;
    private int size;
    private String nama;
    public List2(String nama) {
        nodeAwal = nodeAkhir = null;
        size = 0;
        this.nama = nama;
    }
    public boolean kosong() {
        return nodeAwal == null;
    }
    public void sisipDiAkhir(int dt) {
        if (kosong()) {
            nodeAwal = nodeAkhir = new Node2(dt);
            nodeAkhir.next = nodeAwal;
        } else {
            nodeAkhir = nodeAkhir.next = new Node2(dt);
            nodeAkhir.next = nodeAwal;
        }
        size++;
    }
    public Object hapusDrDepan() {
        Object itemDihapus = null;
        int sisa;
        if (!kosong()) {
            itemDihapus = nodeAwal.data;
            sisa = nodeAwal.data - 1;
            if (nodeAwal == nodeAkhir) {
                nodeAwal = nodeAkhir = null;
            } else {
                nodeAwal = nodeAwal.next;
                nodeAkhir.next = nodeAwal;
            }
            if (sisa != 0) {
                sisipDiAkhir(sisa);
            }
            size--;
        }
        return itemDihapus;
    }
    public void cetak() {
        if (kosong()) {
            System.out.printf("%s Kosong \n", nama);
            return;
        }
        System.out.printf("Isi %s adalah : ", nama);
        Node2 kini = nodeAwal;
        int i = 0;
        while (i < size) {
            System.out.printf("%s ", kini.data);
            kini = kini.next;
            i++;
        }
        System.out.println("\n");
    }
}
