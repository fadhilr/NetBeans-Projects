/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testSingleLinkedList;

public class Program2 {
    
    private Node top;

    public Program2 () {
        top = null;
    }
    
    class Node {
        public int data;
        public Node next;
        public Node(int x) {
            data = x;
            next = null;
        }
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void push(int x) {
        Node tmp = new Node(x);
        tmp.next = top;
        top = tmp;
    }
    
    public int pop() {
        int x = top.data;
        top = top.next;
        return x;
    }

    public int peek() {
        int x = top.data;
        return x;
    }
    
    public static void main(String[] args) {
        Program2 stack = new Program2();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println("\nIsi LinkedList : ");
        while (!stack.isEmpty()) { 
            System.out.println(stack.pop() + " ");
            if (stack.isEmpty()) {
                System.out.println("NULL");
            }
        }
        System.out.println();
    }
}
