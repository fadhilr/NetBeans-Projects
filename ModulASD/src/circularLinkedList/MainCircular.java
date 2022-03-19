/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularLinkedList;

public class MainCircular {
    public static void main(String[] args) {
        HeadAndTailCircular list = new HeadAndTailCircular();
        list.addFirst(new Node2P(400));
        list.addFirst(new Node2P(300));
        list.addFirst(new Node2P(200));
        list.addFirst(new Node2P(100));
        list.print();
        System.out.println("head : "+list.head.data);
        System.out.println("tail : "+list.tail.data);
        System.out.println("-------");
        list.addLast(new Node2P(500));
        list.addFirst(new Node2P(50));
        list.insertAfter(100, new Node2P(250));
        list.insertBefore(100, new Node2P(1));
        System.out.println("-------");
        list.print();
        System.out.println("-------");
        list.removeFirst();
        list.removeLast();
        list.remove(400);
        list.print();
        System.out.println("head : "+list.head.data);
        System.out.println("tail : "+list.tail.data);
        System.out.println("size : " + list.size());
    }
}
