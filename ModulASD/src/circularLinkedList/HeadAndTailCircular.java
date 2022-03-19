/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularLinkedList;

public class HeadAndTailCircular {

    Node2P head, tail;
    int size;

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void addFirst(Node2P input) {
        if (isEmpty()) {
            head = tail = input;
            input.next = input;
            input.previous = input;
        } else {            tail.next = input;
            input.next = head;
            input.previous = tail;
            head.previous = input;
            head = input;
        }
        size++;
    }

    void addLast(Node2P input) {
        if (isEmpty()) {
            head = tail = input;
            input.next = input;
            input.previous = input;
        } else {
            input.next = head;
            tail.next = input;
            input.previous = tail;
            head.previous = input;
            tail = input;
        }
        size++;
    }

    void insertAfter(int key, Node2P input) {
        Node2P temp = head;
        do {
            if (temp.data == key && temp == tail) {
                this.addLast(input);
                System.out.println("Insert data is succeed.");
                break;
            } else if (temp.data == key) {
                temp.next.previous = input;
                input.previous = temp;
                input.next = temp.next;
                temp.next = input;
                size++;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.next;
        } while (temp.previous != tail);
    }

    void insertBefore(int key, Node2P input) {
        Node2P temp = head;
        do {
            if (temp.data == key && temp == head) {
                this.addFirst(input);
                System.out.println("Insert data is succeed.");
                break;
            } else if (temp.data == key) {
                input.previous = temp.previous;
                temp.previous.next = input;
                input.next = temp;
                temp.previous = input;
                size++;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.next;
        } while (temp.previous != tail);
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                head.next.previous = tail;
                tail.next = head.next;
                head = head.next;
            }
            size--;
        } else {
            System.out.println("Data is empty!");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == tail) {
                head = tail = null;
            } else {
                tail.previous.next = head;
                head.previous = tail.previous;
                tail = tail.previous;
            }
            size--;
        } else {
            System.out.println("Data is empty!");
        }
    }

    void remove(int key) {
        Node2P temp = head;
        if (!isEmpty()) {
            do {
                if (temp.data == key) {
                    if (temp == head) {
                        this.removeFirst();
                        break;
                    } else if (temp == tail) {
                        this.removeLast();
                        break;
                    } else {
                        temp.previous.next = temp.next;
                        temp.next.previous = temp.previous;
                        size--;
                        break;
                    }
                }
                temp = temp.next;
            } while (temp.previous != tail);
        } else {
            System.out.println("Data is empty!");
        }
    }

    public void print() {
        Node2P p = head;
        do {
            System.out.println(p.data);
            p = p.next;
        } while (p.previous != tail);
    }
}