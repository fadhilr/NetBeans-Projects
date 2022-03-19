/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BST;
import java.util.Scanner;

class NodeBST {

    int data;
    NodeBST nodeKiri, nodeKanan;

    public NodeBST(int data) {
        this.data = data;
        nodeKiri = nodeKanan = null;
    }

    public void insert(int dt) {
        if (dt < data) {
            if (nodeKiri == null) {
                nodeKiri = new NodeBST(dt);
            } else {
                nodeKiri.insert(dt);
            }
        } else if (dt > data) {
            if (nodeKanan == null) {
                nodeKanan = new NodeBST(dt);
            } else {
                nodeKanan.insert(dt);
            }
        }
    }
}
public class BSTtree {

    NodeBST root;

    public BSTtree() {
        root = null;
    }
    public void sisip(int dt) {
        if (root == null) {
            root = new NodeBST(dt);
        } else {
            root.insert(dt);
        }
    }

    private void cari(int dt, NodeBST node) {
        NodeBST point = node;
        if (point.data == dt) {
            System.out.println(point.data + " ");
        } else if (point.nodeKiri != null || point.nodeKanan != null) {
            if (dt < point.data) {
                System.out.print(point.data + " -> ");
                point = point.nodeKiri;
            } else {
                System.out.print(point.data + " -> ");
                point = point.nodeKanan;
            }
            cari(dt, point);
        } else {
            System.out.println("Error : Data Not found");
        }
    }

    private int min(NodeBST node) {
        NodeBST point = node;
        while (point.nodeKiri != null) {
            point = point.nodeKiri;
        }
        return point.data;
    }

    private int max(NodeBST node) {
        NodeBST point = node;
        while (point.nodeKanan != null) {
            point = point.nodeKanan;
        }
        return point.data;
    }

    private void hapus(int dt, NodeBST node) {
        NodeBST point, help;
        int temp;
        point = node;
        help = null;
        while (point.data != dt) {
            help = point;
            if (dt < point.data) {
                point = point.nodeKiri;
            } else {
                point = point.nodeKanan;
            }
        }
        if (point.nodeKiri == null && point.nodeKanan == null) {
            if (help.nodeKiri == point) {
                help.nodeKiri = null;
            } else {
                help.nodeKanan = null;
            }
        } else if (point.nodeKanan != null) {
            if(point.nodeKanan.nodeKiri==null){
            temp = min(point.nodeKanan);
                if(point.nodeKanan.data<help.data){
                    help.nodeKiri = point.nodeKanan;
                }
                else{
                    if(point.nodeKiri==null){
                        help.nodeKanan=point.nodeKanan;
                    }else{
                        point.nodeKanan.nodeKiri=point.nodeKiri;
                        help.nodeKanan=point.nodeKanan;
                    }
                }
            }
            else{
                help = point.nodeKanan;
                temp = min(help);
                point.data = temp;
            while (help.nodeKiri.data != point.data) {
                help = help.nodeKiri;
            }
            help.nodeKiri = null;}
        } else {
            help = point.nodeKiri;
            temp = max(help);
            point.data = temp;
            while (help.nodeKanan.data != point.data) {
                help = help.nodeKanan;
            }
            help.nodeKanan = null;
        }
    }

    public void cetak() {
        cetak(root);
        System.out.println("");
    }

    private void cetak(NodeBST node) {
        if (node == null) {
            return;
        }
        cetak(node.nodeKiri);
        System.out.printf("%d ", node.data);
        cetak(node.nodeKanan);
    }
    public void cari(int dt) {
        cari(dt, root);
    }
    public int min() {
        return min(root);
    }
    public int max() {
        return max(root);
    }
    public void hapus(int dt) {
        hapus(dt, root);
    }
    public static void main(String[] args) {
        int arr[] = {18, 45, 10, 15, 22, 25, 57, 2, 9, 35, 40, 11, 16};
        int pilih;
        BSTtree binary = new BSTtree();
        for (int i = 0; i < arr.length; i++) {
            binary.sisip(arr[i]);
        }
        Scanner in = new Scanner(System.in);
        Scanner input= new Scanner(System.in);
        do{
        System.out.println("============Menu BST=============");
        System.out.println("1. Tambah data ");
        System.out.println("2. Hapus data ");
        System.out.println("3. Cari nilai ");
        System.out.println("4. Cari nilai min ");
        System.out.println("5. Cari nilai max ");
        System.out.println("6. Keluar");
        System.out.print("Masukkan pilihan anda : ");
        pilih= input.nextInt();
        int angka;
            switch(pilih){
                case 1 : System.out.print("Masukkan angka yang ingin ditambah: ");
                    angka = input.nextInt();
                    binary.sisip(angka);
                    break;
                case 2 : System.out.print("Masukkan angka yang ingin dihapus: ");
                    angka = input.nextInt();
                    binary.hapus(angka);break;
                case 3: System.out.print("Masukkan angka yang ingin didicari: ");
                    angka=input.nextInt();
                    binary.cari(angka);break;
                case 4: System.out.println("Nilai MIN nya adalah : \t"+binary.min());
                    break;
                case 5: System.out.println("Nilai MAX nya adalah : \t"+binary.max());
                    break;
            }binary.cetak();
        }while (pilih < 6);   
    }
}

