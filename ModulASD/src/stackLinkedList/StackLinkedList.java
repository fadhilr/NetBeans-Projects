/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackLinkedList;


public class StackLinkedList {
    Node head, tail, top;
    int size=0;
    void inisialisasi(){
        head=tail=top=null;
    }
    boolean isEmpty(){
        return (size==0);
    }
    void removeLast(){
        Node temp = head;
            if (head == tail)
                head = tail = null;
            else{
            while(temp.next!=tail){
                temp = temp.next;
            }temp.next=null;
            tail=temp;
            } size--;
    }
    void addLast(Node input){
        if (isEmpty()) {
            head=tail=input;
        } else {
            tail.next=input;
            tail=input; 
        }size++;
    }
    void push(Node input){
        addLast(input);
        top=tail;
    }
    int pop(){
        int temp= tail.data;
        removeLast();
        top=tail;
        return temp;
    }
}
