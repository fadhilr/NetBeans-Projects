/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

/**
 *
 * @author U53R
 */
public class MainQueue {
    public static void main(String[] args) {
        QueueDoubleLinkedList list= new QueueDoubleLinkedList();
        list.enqueue(new Node2P(3, "Bobo"));
        list.enqueue(new Node2P(2,"Rando"));
        list.enqueue(new Node2P(0,"Fulanah"));
        list.enqueue(new Node2P(1,"Mr.x"));
        list.enqueue(new Node2P(3,"Mr.y"));
        list.enqueue(new Node2P(3,"Bos"));
        list.enqueue(new Node2P(0,"Mans"));
        list.enqueue(new Node2P(1,"James"));
        list.enqueue(new Node2P(2,"Norman"));
        list.enqueue(new Node2P(0,"Donald"));
        list.cetak();
        System.out.println("");
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.dequeue();
//        list.cetak();
//        System.out.println("");
    }
}
    

