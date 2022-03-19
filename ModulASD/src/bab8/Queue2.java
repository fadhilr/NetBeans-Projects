/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8;

public class Queue2 {
    private List2 listAntrian;
    public Queue2() {
        listAntrian = new List2("Round Robin");
    }
    public void enqueue(int object) {
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
        Queue2 r1 = new Queue2();
        r1.enqueue(2);
        r1.enqueue(4);
        r1.enqueue(5);
        r1.cetak();
        Object dtHapus = null;
        while (!r1.kosong()) {
            dtHapus = r1.dequeue();
            System.out.printf("%s dihapus \n", dtHapus);
            r1.cetak();
        }
    }
}

