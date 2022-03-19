/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesStack;
public class StackObject {

    private int size, top;
    private Object[] data;

    public StackObject(int n) {
        top = -1;
        size = n;
        data = new Object[size];
    }

    public boolean isFull() {
        return top == (size - 1) ? true : false;
    }

    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    public void push(Object dt) {
        if (!isFull()) {
            data[++top] = dt;
        }
    }

    public Object pop() {
        Object hasil = -999;
        if (!isEmpty()) {
            hasil = data[top--];
        }
        return hasil;
    }
}
