/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab11;
public class Graph {
    private class Node {
        private int data;
        private Node next;
        public Node(int dt, Node n) {
            data = dt;
            next = n;
        }
        public Node(int dt, Node n, int pjg) {
            data = dt;
            next = n;
        }
        public int getDt() {
            return data;
        }
        public Node getNext() {
            return next;
        }
    }
    private Node[] node;
    private static int jNode;
    private static int a[], b[], c[][], x[], matriks[][], matriks1[][];

    public Graph(int n) {
        jNode = n;
        node = new Node[jNode];
        a = new int[n];
        b = new int[n];
        c = new int[n][n + 1];
        matriks = new int[n][n];
        matriks1 = new int[n][n];
        for (int i = 0; i < jNode; i++) {
            node[i] = null;
        }
    }
    public void addAdj(int head, int adj) {
        Node n = new Node(adj, node[head]);
        node[head] = n;
    }
    public void addAdj(int head, int adj, int pjg) {
        Node n = new Node(adj, node[head], pjg);
        matriks1[head][adj] = pjg;
        node[head] = n;
    }
    public void bfs() {
        x = new int[jNode];
        boolean find = false;
        x[0] = 0;
        System.out.print(x[0]);
        int Checkpoint = 1;
        int i = 0;
        int p = 1;
        while (x[jNode - 1] == 0) {
            for (int j = 0; j < jNode; j++) {
                if (matriks[i][j] >= 1) {
                    for (int f = 0; f < x.length; f++) {
                        if (x[f] == j) {
                            find = true;
                        }
                    }
                    if (find != true) {
                        x[Checkpoint] = j;
                        Checkpoint++;
                    }
                }
                find = false;
            }
            i = x[p];
            p++;
        }
        for (int l = 1; l < jNode; l++) {
            System.out.print(" > " + x[l]);
        }
        System.out.println();
    }
    public int checkpoint = 1;
    public boolean find = false;

    public void hitung() {
        for (int i = 0; i < jNode; i++) {
            while (node[i] != null) {
                a[i]++;
                c[i][node[i].data] = node[i].data;
                matriks[i][node[i].data]++;
                switch (node[i].data) {
                    case 0:
                        b[0]++;
                        break;
                    case 1:
                        b[1]++;
                        break;
                    case 2:
                        b[2]++;
                        break;
                    case 3:
                        b[3]++;
                        break;
                    case 4:
                        b[4]++;
                        break;
                }
                node[i] = node[i].next;
            }
        }
    }
    public void edge() {
        System.out.println("");
        for (int i = 0; i < jNode; i++) {
            System.out.println("Jumlah edge yang keluar dari node " + "[" + i + "]" + " adalah " + a[i]);
        }
        System.out.println("");
        for (int i = 0; i < jNode; i++) {
            System.out.println("Jumlah edge yang masuk ke node " + "[" + i + "]" + " adalah " + b[i]);
        }
    }
    public void matriks() {
        System.out.print("   ");
        for (int i = 0; i < jNode; i++) {
            System.out.printf("[" + i + "]" + " ");
        }
        System.out.println("");
        for (int i = 0; i < jNode; i++) {
            System.out.print("[" + i + "]" + " ");
            for (int j = 0; j < jNode; j++) {
                System.out.printf("%-4s", matriks[i][j]);
            }
            System.out.println("");
        }
    }
    public void matriks1() {
        System.out.print("   ");
        for (int i = 0; i < jNode; i++) {
            System.out.printf("[" + i + "]" + " ");
        }
        System.out.println("");
        for (int i = 0; i < jNode; i++) {
            System.out.print("[" + i + "]" + " ");
            for (int j = 0; j < jNode; j++) {
                System.out.printf("%-4s", matriks1[i][j]);
            }
            System.out.println("");
        }
    }
    public void tetangga() {
        for (int i = 0; i < jNode; i++) {
            System.out.print("Tetangga dari [" + i + "]" + " adalah ");
            for (int j = 0; j < jNode; j++) {
                if (c[i][j] == 0) {
                    continue;
                } else {
                    System.out.print(c[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    public void cetak() {
        for (int i = 0; i < jNode; i++) {
            System.out.print("[" + i + "]");
            Node n = node[i];
            while (n != null) {
                System.out.print("->" + n.getDt());
                n = n.getNext();
            }
            System.out.println();
        }
    }
    public static void main(String s[]) {
        Graph g = new Graph(5);
        g.addAdj(0, 3);
        g.addAdj(0, 1);
        g.addAdj(1, 4);
        g.addAdj(1, 2);
        g.addAdj(2, 4);
        g.addAdj(2, 1);
        g.addAdj(4, 3);
        g.cetak();
        g.hitung();
        g.edge();
        System.out.println();
        System.out.println("Matrik Adjacency");
        g.matriks();
        System.out.println();
        System.out.println("Tetangga :");
        g.tetangga();
        System.out.println("-------------------------------");
        System.out.println("\nBFS dari Graph : ");
        g.bfs();
        System.out.println("-------------------------------");
        System.out.println();
        Graph f = new Graph(5);
        System.out.println("\nGraph dengan Bobot");
        f.addAdj(0, 2, 20);
        f.addAdj(0, 4, 12);
        f.addAdj(1, 3, 6);
        f.addAdj(1, 2, 30);
        f.addAdj(2, 0, 15);
        f.addAdj(2, 3, 8);
        f.addAdj(4, 1, 10);
        f.cetak();
        System.out.println();
        System.out.println("Matrik dengan bobot :");
        f.matriks1();
    }
}
