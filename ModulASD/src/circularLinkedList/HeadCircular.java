/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circularLinkedList;

public class HeadCircular {

    Node2P head;
    int size;

    boolean isEmpty() {
        return size == 0;
    }

    int size() {
        return size;
    }

    void addFirst(Node2P input) {
        if (isEmpty()) {
            head = input;
            input.next = input;
            input.previous = input;
        } else {
            head.previous.next = input;
            input.next = head;
            input.previous = head.previous;
            head.previous = input;
            head = input;
        }
        size++;
    }

    void addLast(Node2P input) {
        if (isEmpty()) {
            head = input;
            input.next = input;
            input.previous = input;
        } else {
            input.next = head;
            head.previous.next = input;
            input.previous = head.previous;
            head.previous = input;
        }
        size++;
    }

    void insertAfter(int key, Node2P input) {
        Node2P temp = head;
        do {
            if (temp.data == key && temp == head.previous) {
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
        } while (temp.previous != head.previous);
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
        } while (temp.previous != head.previous);
    }

    void removeFirst() {
        if (!isEmpty()) {
            if (head == head.previous) {
                head = null;
            } else {
                head.next.previous = head.previous;
                head.previous.next = head.next;
                head = head.next;
            }
            size--;
        } else {
            System.out.println("Data is empty!");
        }
    }

    void removeLast() {
        if (!isEmpty()) {
            if (head == head.previous) {
                head = null;
            } else {
                head.previous.previous.next = head;
                head.previous = head.previous.previous;
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
                    } else if (temp == head.previous) {
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
            } while (temp.previous != head.previous);
        } else {
            System.out.println("Data is empty!");
        }
    }

    public void print() {
        Node2P p = head;
        do {
            System.out.println(p.data);
            p = p.next;
        } while (p.previous != head.previous);
    }
}
