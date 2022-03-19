/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BSTtree;

/**
 *
 * @author U53R
 */
public class NodeTree {
    int data;
    NodeTree right;
    NodeTree left;
    NodeTree(){
        
    }
    NodeTree (int theData){
        this.data=theData;
    }
    NodeTree(int theData, NodeTree next, NodeTree previous){
        this.data=theData;
        this.right=right;
        this.left=left;
    }
}
