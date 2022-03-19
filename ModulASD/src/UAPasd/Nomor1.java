/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAPasd;

public class Nomor1 {

    private class Node {

        private int data;
        private Node next;

        public Node(int dt, Node n) {
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
    private int jNode;
    private static int a[], b[], c[][], x[], matriks[][], matriks1[][];
    
    public Nomor1(int n) {
        jNode = n;
        node = new Nomor1.Node[jNode];
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
        Nomor1.Node n = new Nomor1.Node(adj, node[head]);
        node[head] = n;
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
        Nomor1 g = new Nomor1(5);
        g.addAdj(0, 3);
        g.addAdj(0, 1);
        g.addAdj(1, 4);
        g.addAdj(1, 2);
        g.addAdj(2, 4);
        g.addAdj(2, 1);
        g.addAdj(4, 3);
        g.cetak();
    }
}
