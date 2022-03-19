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
public class Node {
    int data;
    Node next;
    Node (){}
    Node (int data){
        this.data=data;
    }
    Node (int data, Node pointer){
        this.data=data;
        this.next=pointer;
        
    }
}
