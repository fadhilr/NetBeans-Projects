/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSingleLinkedList;


class Node2P {
    int data;
    Node2P next;
    Node2P previous;
    Node2P() {
    }
    Node2P(int theData) {
        data = theData;
    }
    Node2P(int theData, Node2P thePrevious, Node2P theNext) {
        data = theData;
        previous = thePrevious;
        next = theNext;
    }
}
public class Enkripsi {
    Node2P head, tail, next, previous;
    int size=0;
    void inisialisasi(){
        head=tail=null;
    }
    boolean isEmpty(){
        return (size==0);
    }
    int size(){
        return size;
    }
       public void addFirst(Node2P in){
       if(isEmpty()){
           head=in;
           tail=in;
       } else {
           in.next=head;
           head.previous=in;
           in.previous=null;
           head=in;
       }
       size++;
    }
    public void addLast(Node2P in){
        if(isEmpty()){
            head=tail=in;
        } else {
            tail.next=in;
            in.previous=tail;
            in.next=null;
            tail=in;
        }
        size++;
    }
    public void insertAfter(int key, Node2P in){
        Node2P temp=head;
        do {
            if (temp.data==key) {
                in.next=temp.next;
                temp.next.previous=in;
                in.previous=temp;
                temp.next=in;
                size++;
                System.out.println("Insert data succes");
                break;
            }
            temp=temp.next;
        } while (temp!=null);
    }
}
