/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackLinkedList;

/**
 *
 * @author U53R
 */
public class MainLinkedList {
    public static void main(String[] args) {
        QueueLinkedList list= new QueueLinkedList();
        list.enqueue(new Node(1));
        list.enqueue(new Node(2));
        list.enqueue(new Node(3));
        list.enqueue(new Node(4));
        list.enqueue(new Node(5));
        list.cetak();
        System.out.println("");
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.cetak();
        System.out.println("");
        System.out.println("keadaan isFull adalah = "+list.isFull());
        System.out.println("keadaan isEmpty adalah = "+list.isEmpty());
    }
}
