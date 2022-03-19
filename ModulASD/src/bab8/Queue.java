/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;

public class Queue {
    private List listAntrian;
    public Queue() {
        listAntrian = new List("queue");
    }
    public void enqueue(Object object) {
        listAntrian.sisipDiAkhir(object);
    }
    public Object dequeue() {
        return listAntrian.hapusDrDepan();
    }
    public boolean kosong() {
        return listAntrian.kosong();
    }
    public void cetak() {
        listAntrian.cetak();
    }
    public static void main(String args[]) {
        Queue q = new Queue();
        q.enqueue(15);
        q.cetak();
        q.enqueue(35);
        q.cetak();
        q.enqueue(25);
        q.cetak();
        q.enqueue(20);
        q.cetak();
        Object dtHapus = null;
        while (!q.kosong()) {
            dtHapus = q.dequeue();
            System.out.printf("%s dihapus \n", dtHapus);
            q.cetak();
        }
    }
}

