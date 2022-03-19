/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab4;

public class Stack {
    private int size;
    private int top;
    private int[] data;
    public Stack(int n) {
        top = -1;
        size = n;
        data = new int[size];
    }
    public boolean isPalindrome() {
        return true;
    }
    public boolean isFull() {
        return top == (size - 1) ? true : false;
    }
    public boolean isEmpty() {
        return top == -1 ? true : false;
    }
    public void push(int dt) {
        if (!isFull()) {
            data[++top] = dt;
        }
    }
    public int pop() {
        int hasil = -999;
        if (!isEmpty()) {
            hasil = data[top--];
        }
        return hasil;
    }
    public void convertBiner(int nilai){
        while (nilai != 0) {
            int sisa = nilai % 2;
            this.push(sisa);
            nilai = nilai / 2;
        }
        while (!this.isEmpty()) {
            System.out.print(this.pop());
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack(100);
        st.push(0);
        st.push(6);
        st.push(7);
        while (!st.isEmpty()) {
            System.out.println(st.pop());
        }
        System.out.println("");
        st.convertBiner(8);
    }
}
