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
public class QueueDoubleLinkedList {

    Node2P head, tail, front, rear;
    int size = 0;

    void inisialisasi() {
        head = tail = front = rear = null;
    }

    boolean isFull() {
        return (size == 10);
    }

    boolean isEmpty() {
        return (size == 0);
    }

    void removeFirst() {
        Node2P temp = head;
        if (head == tail) {
            head = tail = null;
        } else {
            temp = temp.next;
            temp.previous = null;
            head = temp;
            temp = null;
        }
        size--;
    }

    void addLast(Node2P baru) {
        if (isEmpty()) {
            head = baru;
            tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
    }

    public void addFirst(Node2P in) {
        if (isEmpty()) {
            head = in;
            tail = in;
        } else {
            in.next = head;
            head.previous = in;
            head = in;
        }
        size++;
    }

    void insertBefore(int key, Node2P input) {
        Node2P temp = head;
        while (temp != null) {
            if ((temp.priority == key) && (temp == head)) {
                this.addFirst(input);
                System.out.println("Insert data is succeed.");
                break;
            } else if (temp.priority == key) {
                input.next = temp;
                temp.previous.next = input;
                input.previous = temp.previous;
                temp.previous = input;
                System.out.println("Insert data is succeed.");
                break;
            }
            temp = temp.next;
        }
        size++;
    }

    void enqueue(Node2P baru) {
        Node2P temp = head;
        if (isEmpty()) {
            addLast(baru);
        } else {
            while (temp != null) {
                if (baru.priority < temp.priority) {
                        if ((temp.priority == temp.priority) && (temp == head)) {
                            this.addFirst(baru);
                            System.out.println("Insert data is succeed.");
                            break;
                        } else if (temp.priority == temp.priority) {
                            baru.next = temp;
                            temp.previous.next = baru;
                            baru.previous = temp.previous;
                            temp.previous = baru;
                            System.out.println("Insert data is succeed.");
                            break;
                        }
                    size++;
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                addLast(baru);
            }
        }
        rear = tail;
        front = head;
    }

    String dequeue() {
        if (!isEmpty()) {
            String hasil = front.data;
            removeFirst();
            front = head;
            rear = tail;
            return hasil;
        } else {
            System.out.println("Queue kosong");
            return null;
        }
    }

    void cetak() {
        Node2P p = head;
        while (p != null) {
            System.out.print(p.data + "<--");
            p = p.next;
        }
    }
}
