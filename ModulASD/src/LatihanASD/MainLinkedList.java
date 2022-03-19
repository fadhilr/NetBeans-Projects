/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanASD;

public class MainLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("head : "+list.head);
        System.out.println("tail : "+list.tail);
        list.addFirst(new ContohNode ("B"));
        System.out.println("head : "+list.head);
        System.out.println("tail : "+list.tail);
        list.addFirst(new ContohNode ("A"));
        System.out.println("head : "+list.head);
        System.out.println("tail : "+list.tail);
        list.addLast(new ContohNode ("C"));
        System.out.println("head : "+list.head);
        System.out.println("tail : "+list.tail);
        list.addFirst(new ContohNode ("D"));
        System.out.println("head : "+list.head);
        System.out.println("tail : "+list.tail);
    }
}
