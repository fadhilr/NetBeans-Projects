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
public class QueueLinkedList {
    Node head,tail,front,rear;
    int size=0;
    void inisialisasi(){
        head=tail=front=rear=null;
    }
    boolean isFull(){
        return (size==10);
    }
    boolean isEmpty(){
        return (size==0);
    }
    void removeFirst(){ 
        Node temp = head;
            if (head == tail)
                head = tail = null;
            else
            {
                temp = temp.next;
                head = temp;
                temp = null;
            } size--;
    }
    void addLast(Node baru){
        if (isEmpty()) {
            head= baru;
            tail=baru;
        } else {
            tail.next=baru;
            tail=baru;
        }size++;
    }
    void enqueue(Node baru){
        if (isFull()) {
            System.out.println("Data full!");
        } else {
            addLast(baru);
            rear=tail;
            front=head;
        }
        
    }
    int dequeue(){
        if(!isEmpty()){
            int hasil= front.data;
            removeFirst();
            front=head;
            rear=tail;
            return hasil;
        }else{
            System.out.println("Queue kosong");
            return -1;
        }
    }
    void cetak(){
        Node p = head;
        while (p != null){
            System.out.print(p.data+"<--");
            p = p.next;
        } 
    }
}
