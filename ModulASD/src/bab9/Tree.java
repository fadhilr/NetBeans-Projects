/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

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
public class Tree {
    private Node root;
    private int banyakNode = 0;
    public Tree() {
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
    public int banyakNode() {
        return banyakNode;
    }
    public int banyakDaun() {
        return daun(root);
    }
    private int daun(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.nodeKiri == null && node.nodeKanan == null) {
            return 1;
        } else {
            return daun(node.nodeKiri) + daun(node.nodeKanan);
        }
    }
    public int tinggiPohon() {
        return tinggiPohon(root);
    }
    private int tinggiPohon(Node node) {
        if (node == null) {
            return -1;
        }
        int kiri = tinggiPohon(node.nodeKiri);
        int kanan = tinggiPohon(node.nodeKanan);
        if (kiri > kanan) {
            return kiri + 1;
        }
        return kanan + 1;
    }
    public int level() {
        return tinggiPohon(root) + 1;
    }
    public static void main(String args[]) {
        Tree Tree = new Tree();
        int nilai;
        Random randomNumber = new Random();
        System.out.println("sisip nilai data berikut : ");
        // sisipDt 10 bilangan acak dari 0-99 ke dalam tree
        for (int i = 1; i <= 10; i++) {
            nilai = randomNumber.nextInt(100);
            System.out.print(nilai + " ");
            Tree.sisipDtNode(nilai);
        }
        System.out.println("\n\nPreorder traversal");
        Tree.preorderTraversal();
        System.out.println("\n\nInorder traversal");
        Tree.inorderTraversal();
        System.out.println("\n\nPostorder traversal");
        Tree.postorderTraversal();
        System.out.println();
        System.out.println("Banyak node : " + Tree.banyakNode());
        System.out.println("Banyak Daun : " + Tree.banyakDaun());
        System.out.println("Tinggi Pohon : " + Tree.tinggiPohon());
        System.out.println("Banyak Level : " + Tree.level());
    }
}

