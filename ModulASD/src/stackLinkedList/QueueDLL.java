/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackLinkedList;


public class QueueDLL {
    Node2P head,tail,front,rear;
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
        Node2P temp = head;
            if (head == tail)
                head = tail = null;
            else
            {
                temp = temp.next;
                temp.previous=null;
                head = temp;
                temp = null;
            } size--;
    }
    void addLast(Node2P baru){
        if (isEmpty()) {
            head= baru;
            tail=baru;
        } else {
            tail.next=baru;
            tail=baru;
        }size++;
    }
    void enqueue(Node2P baru){
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
        Node2P p = head;
        while (p != null){
            System.out.print(p.data+"<--");
            p = p.next;
        } 
    }
}
