/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAPasd;

import java.util.Random;

class Node {

    int data;
    Node nodeKiri;
    Node nodeKanan;

    public Node(int dt) {
        data = dt;
        nodeKiri = nodeKanan = null;
    }

    public void sisipDt(int dtSisip) {
        if (dtSisip < data) {
            if (nodeKiri == null) {
                nodeKiri = new Node(dtSisip);
            } else {
                nodeKiri.sisipDt(dtSisip);
            }
        } else if (dtSisip > data) {
            if (nodeKanan == null) {
                nodeKanan = new Node(dtSisip);
            } else {
                nodeKanan.sisipDt(dtSisip);
            }
        }
    }
}

public class Nomor2 {

    private Node root;
    private int banyakNode = 0;
    public Nomor2() {
        root = null;
    }
    public void sisipDtNode(int dtSisip) {
        banyakNode++;
        if (root == null) {
            root = new Node(dtSisip);
        } else {
            root.sisipDt(dtSisip);
        }
    }

    public void preorderTraversal() {
        preorder(root);
    }

    private void preorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("%d ", node.data);
        preorder(node.nodeKiri);
        preorder(node.nodeKanan);
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) {
            return;
        }
        inorder(node.nodeKiri);
        System.out.printf("%d ", node.data);
        inorder(node.nodeKanan);
    }

    public void postorderTraversal() {
        postorder(root);
    }

    private void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.nodeKiri);
        postorder(node.nodeKanan);
        System.out.printf("%d ", node.data);
    }

    public int JumlahNodeRoot() {
        return JumlahNode(root);
    }

    private int JumlahNode(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + JumlahNode(node.nodeKiri)
                + JumlahNode(node.nodeKanan);
    }
//no2

    public int JumlahDaunRoot() {
        return JumlahDaun(root);
    }

    private int JumlahDaun(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.nodeKiri == null && node.nodeKanan == null) {
            return 1;
        } else {
            return JumlahDaun(node.nodeKiri) + JumlahDaun(node.nodeKanan);
        }
    }
//no3

    public int TinggiPohonRoot() {
        return TinggiPohon(root);
    }

    private int TinggiPohon(Node node) {
        if (node == null) {
            return -1;
        }
        int kiri = TinggiPohon(node.nodeKiri);
        int kanan = TinggiPohon(node.nodeKanan);
        if (kiri > kanan) {
            return kiri + 1;
        }
        return kanan + 1;
    }
    public int banyakNode() {
        return banyakNode;
    }
    public int level() {
        return TinggiPohon(root) + 1;
    }
    public static void main(String args[]) {
        Nomor2 Tree = new Nomor2();
        int nilai;
        Random randomNumber = new Random();
        System.out.println("sisip nilai data berikut : ");
        for (int i = 1; i <= 6; i++) {
            nilai = randomNumber.nextInt(100);
            System.out.print(nilai + " ");
            Tree.sisipDtNode(nilai);
        }
        System.out.println("\n\nPreorder traversal :");
        Tree.preorderTraversal();
        System.out.println("\n\nInorder traversal :");
        Tree.inorderTraversal();
        System.out.println("\n\nPostorder traversal :");
        Tree.postorderTraversal();
        System.out.println();
        System.out.println("Banyak node \t: " + Tree.banyakNode());
        System.out.println("Banyak Daun \t: " + Tree.JumlahDaunRoot());
        System.out.println("Tinggi Pohon \t: " + Tree.TinggiPohonRoot());
        System.out.println("Banyak Level \t: " + Tree.level());
    }
}
