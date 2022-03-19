/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor2;

class Node {
    RekeningBank data;
    Node next;
}

public class SingleLinkedList {
    private Node head,tail;
    int size=0;

    public SingleLinkedList () {
        head = null;
    }

    public void buatNode(RekeningBank dt) {
        Node nodeBaru = new Node();
        nodeBaru.data = dt;
        nodeBaru.next = head;
        head = nodeBaru;
    }
    boolean isEmpty(){
        return (size==0);
    }
    public void addLast(Node in){
        if(isEmpty()){
            head=tail=in;
        } else {
            tail.next=in;
            tail=in;
        }
        size++;
    }
    public RekeningBank hapusDiDepan() {
        Node hapus = head;
        head = head.next;
        return hapus.data;
    }

    public void sisipDataDiAkhir(RekeningBank data) {
        Node pSblAkhir, pAkhir;
        pSblAkhir = null;
        pAkhir = head;
        Node baru = new Node();
        baru.data = data;
        baru.next = null;
        while (pAkhir != null) {
            pSblAkhir = pAkhir;
            pAkhir = pAkhir.next;
        }
        pSblAkhir.next = baru;
    }

    

    public void hapusData(RekeningBank dataHapus) {
        Node n = head;
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
        return head;
    }

    public void cetak(String kom) {
        System.out.println(kom);
        Node n = head;
        while (n != null) {
            System.out.println(n.data.getNo()+ " - " + n.data.getNama()+ " \t- " + n.data.getPassword() +" -\t\t "+n.data.getSaldo() +" -\t ");
            n = n.next;
        }     
    }
}
