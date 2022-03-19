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
public class Node2P {
    String data;
    Node2P next;
    Node2P previous;
    int priority;
    Node2P(){
        
    }
    Node2P (int priority, String theData){
        this.priority=priority;
        this.data=theData;
    }
    Node2P(int priority,String theData, Node2P next, Node2P previous){
        this.priority=priority;
        this.data=theData;
        this.next=next;
        this.previous=previous;
    }
}
