/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanASD;

/**
 *
 * @author U53R
 */
public class Node2P {
    int data;
    Node2P next;
    Node2P previous;
    Node2P(){
        
    }
    Node2P (int theData){
        this.data=theData;
    }
    Node2P(int theData, Node2P next, Node2P previous){
        this.data=theData;
        this.next=next;
        this.previous=previous;
    }
}
