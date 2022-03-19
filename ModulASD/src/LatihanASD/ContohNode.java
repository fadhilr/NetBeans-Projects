/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanASD;

public class ContohNode {
    Object data;
    ContohNode pointer;
    ContohNode(Object data){
        this.data=data;
    }
    ContohNode(Object data, ContohNode pointer){
        this.data=data;
        this.pointer=pointer;
    }
}
