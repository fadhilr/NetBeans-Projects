/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanASD;

public class LinkedList {
    ContohNode head,tail;
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
       public void addFirst(ContohNode in){
       if(isEmpty()){
           head=in;
           tail=in;
       } else {
           in.pointer=head;
           head=in;
       }
       size++;
    }
    
    public void addLast(ContohNode in){
        if(isEmpty()){
            head=tail=in;
        } else {
            tail.pointer=in;
            tail=in;
        }
        size++;
    }
    public void insertAfter(Object key, ContohNode in){
        ContohNode temp=head;
        do {
            if (temp.data==key) {
                in.pointer=temp.pointer;
                temp.pointer=in;
                size++;
                System.out.println("Insert data succes");
                break;
            }
            temp=temp.pointer;
        } while (temp!=null);
    }
    void insertBefore(Object key,ContohNode input){
        ContohNode temp = head;
        while (temp != null){
            if ((temp.data == key)&&(temp == head))
            {
                this.addFirst(input);
                System.out.println("Insert data is succeed.");
                break;
            }
            else if (temp.pointer.data == key)
                { input.pointer = temp.pointer;
                temp.pointer = input;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.pointer;
        }
    }
}

