/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab9;

import java.util.Random;
import java.util.Scanner;
public class TreeArray {
    // atribut data
    static int Akhir = 0;
    static int Data = 0;
    static Integer tree[];
    int tempLevel = 1;
    int a = 1;
    //Procedure In order
    public static void inOrderTraversal(Integer array[], int akhir) {
        tree = array;
        Akhir = akhir;
        if (!isEmpty()) {
            inOrder(1);
        } else {
            System.out.println("Kosong");
        }
    }
    public static void print(int data) {
        System.out.print(tree[data] + " ");
    }
    static void inOrder(int datain) {
        if (datain <= Akhir && tree[datain] != null) {
            inOrder(2 * datain);
            print(datain);
            inOrder(2 * datain + 1);
        }
    }
    static boolean isEmpty() {
        return (Data == 0);
    }
   //Procedure untuk menambahkan elemen data
    private void sisipData(int dtdata, int i) {
        a = i;
        if (tree[1] == null) {
            tree[1] = new Integer(dtdata);
        } else {
            if (dtdata < tree[a].intValue()) {
                if (tree[a * 2] == null) {
                    tree[a * 2] = new Integer(dtdata);
                    Data++;
                    if (a * 2 > Akhir) {
                        Akhir = a * 2;
                    }
                } else {
                    a = a * 2;
                    sisipData(dtdata, a);
                }
            } else if (dtdata > tree[a].intValue()) {
                if (tree[a * 2 + 1] == null) {
                    tree[a * 2 + 1] = new Integer(dtdata);
                    Data++;
                    if (a * 2 + 1 > Akhir) {
                        Akhir = a * 2 + 1;
                    }
                } else {
                    a = a * 2 + 1;
                    sisipData(dtdata, a);
                }
            }
        }
    }
    static void Node(int x, int isidata) {
        tree[x] = new Integer(isidata);
        Data++;
        Akhir = x;
    }
  //Procedure Pre order
    public static void preOrderTraversal(Integer array[], int nakhir) {
        tree = array;
        Akhir = nakhir;
        if (!isEmpty()) {
            preOrder(1);
        } else {
            System.out.println("Binary Tree Kosong");
        }
    }
    static void preOrder(int datapre) {
        if (datapre <= Akhir && tree[datapre] != null) {
            print(datapre);
            preOrder(2 * datapre);
            preOrder(2 * datapre + 1);
        }
    }
    //Procedure Post order
    static void postOrder(int datapos) {
        if (datapos <= Akhir && tree[datapos] != null) {
            postOrder(2 * datapos);
            postOrder(2 * datapos + 1);
            print(datapos);
        }
    }
    public static void postOrderTraversal(Integer array[], int akhir) {
        tree = array;
        Akhir = akhir;

        if (!isEmpty()) {
            postOrder(1);
        } else {
            System.out.println("Binary Tree Kosong");
        }
    }
    //main method
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        TreeArray Tree = new TreeArray();
        int nilai;
        tree = new Integer[100];
        Random randomNumber = new Random();
       System.out.println("*****************************");
        System.out.println("  PROGRAM TREE DENGAN ARRAY  ");
        System.out.println("=============================");
        System.out.println("sisip nilai data berikut : ");
        for (int i = 1; i <= 10; i++) {
            nilai = randomNumber.nextInt(100);
            System.out.print(nilai + " ");
            Tree.sisipData(nilai, 1);
        }
        System.out.println("\n\nPreorder traversal");
        TreeArray.preOrderTraversal(tree, Akhir);
        System.out.println("\n\nInorder traversal");
        TreeArray.inOrderTraversal(tree, Akhir);
        System.out.println("\n\nPostorder traversal");
        TreeArray.postOrderTraversal(tree, Akhir);
        System.out.println();
    }
}
