
package bab10;
import java.util.Stack;

class Node {
    int data;
    int tinggi; //tinggi node	
    Node pKiri;
    Node pKanan;
    Node pInduk;// pointer ke induk
    //constructor node
  public Node(int dt, int tg, Node pKi, Node pKa, Node pI) {
        this.data = dt;
        this.tinggi = tg;
        this.pKiri = pKi;
        this.pKanan = pKa;
        this.pInduk = pI;}
    @Override
    public String toString() {
 return data + " height " + tinggi + " parent " + (pInduk == null
                ? "NULL" : pInduk.data) + " | ";}
    void setLeftAnak(Node child) {
        if (child != null) {
            child.pInduk = this;
        }
        this.pKiri = child;
    }
    void setRightAnak(Node child) {
        if (child != null) {
            child.pInduk = this;}
        this.pKanan = child;
    }
}
public class AVLT {
    private Node root;
    public AVLT() {
        root = null;
    }
    //cari dt di tree, mengembalikan true jika ditemukan
    //dan false jika tidak
    public boolean cariDt(int dt) {
        Node temp = root;
        while (temp != null) {
            if (dt == temp.data) {
                return true;
            } //cariDt subtree pKiri 
            else if (dt < temp.data) {
                temp = temp.pKiri;
            } //cariDt subtree pKanan
            else {
                temp = temp.pKanan;
            }
        }
        //dt tidak ditemukan
        return false;
    }
    //sisip dt ke dalam tree, returns true if berhasil, 
    // false jika gagal
    //tree diseimbangkan menggunakan algoritma AVL 
    public boolean sisipDt(int dt) {
        if (root == null) {
            //sisip dt di root
            root = new Node(dt, 1, null, null, null);
            return true;
        } //tree tidak kosong
        else {
            //mulai dari  root			
            Node temp = root;
            Node prev = null;
            //cari lokasi penyisipan dt 
            while (temp != null) {
                if (dt == temp.data) {
                    return false;
                } //sisip dt di subtree pKiri
                else if (dt < temp.data) {
                    prev = temp;
                    temp = temp.pKiri;
                } //sisip dt di subtree pKanan
                else {
                    prev = temp;
                    temp = temp.pKanan;
                }
            }
            //buat node baru
            temp = new Node(dt, 1, null, null, prev);
            if (dt < prev.data) {
                prev.pKiri = temp;//sisip di pKiri	
            } else {
                prev.pKanan = temp; //sisipDt at pKanan
            }			
//mulai dari node yang disisipkan dan
            //bergerak menuju root
            while (temp != null) {
         //subtree pKiri dan pKanan memenuhi kondisi AVL
if(Math.abs(tinggi(temp.pKiri)- tinggi(temp.pKanan)) <= 1) {
                    temp.tinggi = Math.max(tinggi(temp.pKiri), tinggi(temp.pKanan)) + 1;
                } //kasus 1 algoritma AVL 
                else if (tinggi(temp.pKiri) - tinggi(temp.pKanan) >= 2 && tinggi(temp.pKiri.pKiri) >= tinggi(temp.pKiri.pKanan)) {
                    Node parent = temp.pInduk;
                    Node pKiri = temp.pKiri;
                    temp.pKiri = pKiri.pKanan;
                    if (temp.pKiri != null) {
                        temp.pKiri.pInduk = temp;
                    }
                    pKiri.pKanan = temp;
                    temp.pInduk = pKiri;
                    pKiri.pInduk = parent;
                    if (parent == null) {
                        root = pKiri;
                    } else if (parent.pKiri == temp) {
                        parent.pKiri = pKiri;
                    } else {
                        parent.pKanan = pKiri;
                    }
                    //hitung tinggi subtree pKanan
temp.tinggi = Math.max(tinggi(temp.pKiri), tinggi(temp.pKanan)) + 1;
                    temp = pKiri;
                    //hitung tinggi dari root
                    temp.tinggi = Math.max(tinggi(temp.pKiri), tinggi(temp.pKanan)) + 1;
                } //case 2 algoritma AVl 
                else if (tinggi(temp.pKanan) - tinggi(temp.pKiri) >= 2 && tinggi(temp.pKanan.pKanan) >= tinggi(temp.pKanan.pKiri)) {
                    Node parent = temp.pInduk;
                    Node pKanan = temp.pKanan;
                    temp.pKanan = pKanan.pKiri;
                    if (temp.pKanan != null) {
                        temp.pKanan.pInduk = temp;
                    }
                    pKanan.pKiri = temp;
                    temp.pInduk = pKanan;
                    pKanan.pInduk = parent;
                    if (parent == null) {
                        root = pKanan;
                    } else if (parent.pKanan == temp) {
                        parent.pKanan = pKanan;
                    } else {
                        parent.pKiri = pKanan;
                    }
                    //hitung tinggi subtree pKanan 
                    temp.tinggi = Math.max(tinggi(temp.pKiri), tinggi(temp.pKanan)) + 1;
                    temp = pKanan;
                    //hitung tinggi dari root
                    temp.tinggi = Math.max(tinggi(temp.pKiri), tinggi(temp.pKanan)) + 1;
                } //kasus 3 dari algoritma AVL 
                else if (tinggi(temp.pKiri) - tinggi(temp.pKanan) >= 2 && tinggi(temp.pKiri.pKanan) >= tinggi(temp.pKiri.pKiri)) {
                    Node parent = temp.pInduk;
                    Node pKiripKanan = temp.pKiri.pKanan;
                    temp.pKiri.pKanan = pKiripKanan.pKiri;
                    if (temp.pKiri.pKanan != null) {
        temp.pKiri.pKanan.pInduk = temp.pKiri;}
                    pKiripKanan.pKiri = temp.pKiri;
                    temp.pKiri.pInduk = pKiripKanan;
                    temp.pKiri = pKiripKanan.pKanan;
                    if (temp.pKiri != null) {
                        temp.pKiri.pInduk = temp;}
                    pKiripKanan.pKanan = temp;
                    temp.pInduk = pKiripKanan;
                    pKiripKanan.pInduk = parent;
                    if (parent == null) {
                        root = pKiripKanan;
                    } else if (parent.pKiri == temp) {
                        parent.pKiri = pKiripKanan;
                    } else {
                        parent.pKanan = pKiripKanan; }
                    //hitung tinggi subtree pKanan 
    temp.tinggi = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                    temp = pKiripKanan;
                    //hitung tinggi dari root
                    temp.tinggi = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                } //kasus 4 dari algoritma AVL 
                else if (tinggi(temp.pKanan) - tinggi(temp.pKiri) >= 2 && tinggi(temp.pKanan.pKiri) >= tinggi(temp.pKanan.pKanan)) {
                    Node parent = temp.pInduk;
                    Node pKananpKiri = temp.pKanan.pKiri;
                    temp.pKanan.pKiri = pKananpKiri.pKanan;
                    if (temp.pKanan.pKiri != null) {
                        temp.pKanan.pKiri.pInduk = temp.pKanan;}
                    pKananpKiri.pKanan = temp.pKanan;
                    temp.pKanan.pInduk = pKananpKiri;

                    temp.pKanan = pKananpKiri.pKiri;
                    if (temp.pKanan != null) {
                        temp.pKanan.pInduk = temp; }
                    pKananpKiri.pKiri = temp;
                    temp.pInduk = pKananpKiri;
                    pKananpKiri.pInduk = parent;
                    if (parent == null) {
                        root = pKananpKiri;
                    } else if (parent.pKanan == temp) {
                        parent.pKanan = pKananpKiri;
                    } else {
                        parent.pKiri = pKananpKiri;}
                    temp.tinggi = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;
                    temp = pKananpKiri;
                    temp.tinggi = Math.max(tinggi(temp.pKiri),
                            tinggi(temp.pKanan)) + 1;}
                temp = temp.pInduk;}
            //penyisipan berhasil
            return true;}}
    public int tinggi() {
        return root.tinggi;}
    private int tinggi(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.tinggi;}}
    //hitung node-node dari tree
    public int jumlahNode() {
        return jumlahNode(root);}
    public void inOrderTraversal() {
        inOrder(root);}
    private void inOrder(Node r) {
        if (r == null) {
            return;}
        inOrder(r.pKiri);
        System.out.printf("-%d", r.data);
        inOrder(r.pKanan);}
    //hitung node-node dari tree
    private int jumlahNode(Node node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + jumlahNode(node.pKiri)
                    + jumlahNode(node.pKanan);}}
    private void putarKanan(Node putar) {
        Node parent = putar.pInduk;
        Node leftChild = putar.pKiri;
        Node rightChildOfLeftChild = leftChild.pKanan;
        putar.setLeftAnak(rightChildOfLeftChild);
        leftChild.setRightAnak(putar);
        if (parent == null) {
            this.root = leftChild;
            leftChild.pInduk = null;
            return;}
        if (parent.pKiri == putar) {
            parent.setLeftAnak(leftChild);
        } else {
            parent.setRightAnak(leftChild);}
        reHeight(putar);
        reHeight(leftChild);}
    private void putarKiri(Node putar) {
        Node parent = putar.pInduk;
        Node rightChild = putar.pKanan;
        Node leftChildOfRightChild = rightChild.pKiri;
        putar.setRightAnak(leftChildOfRightChild);
        rightChild.setLeftAnak(putar);
        if (parent == null) {
            this.root = rightChild;
            rightChild.pInduk = null;
            return;}
        if (parent.pKiri == putar) {
            parent.setLeftAnak(rightChild);
        } else {
            parent.setRightAnak(rightChild);}
        reHeight(putar);
        reHeight(rightChild);}
    private int height(Node node) {
        return node == null ? -1 : node.tinggi;}
    private void reHeight(Node node) {
        node.tinggi = Math.max(height(node.pKiri), height(node.pKanan)) + 1;}
    private void putarKiriKanan(Node node) {
        putarKiri(node.pKiri);
        putarKanan(node);}
    private void putarKananKiri(Node node) {
        putarKanan(node.pKanan);
        putarKiri(node);}
    public boolean delete(int key) {
        Node target = search(key);
        if (target == null) {
            return false;}
        target = deleteNode(target);
        Seimbangkan(target.pInduk);
        return true;}
    private Node deleteNode(Node target) {
        if (isDaun(target)) {
            if (isAnakDaun(target)) {
                target.pInduk.pKiri = null;
            } else {
                target.pInduk.pKanan = null;}
        } else if (target.pKiri == null ^ target.pKanan == null) {//1 child
            Node nonNullChild = target.pKiri == null ? target.pKanan : target.pKiri;
            if (isAnakDaun(target)) {
                target.pInduk.setLeftAnak(nonNullChild);
            } else {
                target.pInduk.setRightAnak(nonNullChild);}
        } else {//2 children
            Node immediatePredInOrder = immediatePredInOrder(target);
            target.data = immediatePredInOrder.data;
            target = deleteNode(immediatePredInOrder);}
        reHeight(target.pInduk);
        return target;}
    private Node immediatePredInOrder(Node node) {
        Node current = node.pKiri;
        while (current.pKanan != null) {
            current = current.pKanan;}
        return current;}
    private boolean isAnakDaun(Node child) {
        return (child.pInduk.pKiri == child);}
    private boolean isDaun(Node node) {
        return node.pKiri == null && node.pKanan == null;}
    private int calDifference(Node node) {
        int rightHeight = height(node.pKanan);
        int leftHeight = height(node.pKiri);
        return rightHeight - leftHeight;}
    private void Seimbangkan(Node node) {
        int sama = calDifference(node);
        Node parent = node.pInduk;
        if (sama == -2) {
            if (height(node.pKiri.pKiri) >= height(node.pKiri.pKanan)) {
                putarKanan(node);
            } else {
                putarKiriKanan(node);}
        } else if (sama == 2) {
            if (height(node.pKanan.pKanan) >= height(node.pKanan.pKiri)) {
                putarKiri(node);
            } else {
                putarKananKiri(node);}}
        if (parent != null) {
            Seimbangkan(parent);}
        reHeight(node);}
    public Node search(int key) {
        return binarySearch(root, key);}
    private Node binarySearch(Node node, int key) {
        if (node == null) {
            return null;}
        if (key == node.data) {
            return node; }
        if (key < node.data && node.pKiri != null) {
            return binarySearch(node.pKiri, key);}
        if (key > node.data && node.pKanan != null) {
            return binarySearch(node.pKanan, key);}
        return null;    }
    public void traverseInOrder() {
        System.out.println("ROOT " + root.toString());
        inorder(root);
        System.out.println();}
    private void inorder(Node node) {
        if (node != null) {
            inorder(node.pKiri);
            System.out.print(node.toString());
            inorder(node.pKanan);}}
    public void displayTree() {
        Stack globalStack = new Stack();
        globalStack.push(root);
        int kosong = 32;
        int counter = 1;
        int temp1 = 0;
        boolean kolomkosong = false;
        boolean baris_pertama = true;
        while (kolomkosong == false) {
            Stack localStack = new Stack();
            kolomkosong = true;
            if (baris_pertama == false) {
                for (int i = 1; i <= counter / 2; i++) {
                  for (int j = 1; j < kosong * 2 + 1; j++) {
                        System.out.print(" ");}
                    System.out.print("|");
                    if (i != counter) {
                      for (int j = 1; j < kosong * 2; j++) {
                            System.out.print(" ");}}}
                System.out.println("");
                for (int i = 1; i <= counter * 2; i++) {
                    if (i % 4 == 2 || i % 4 == 3) {
                        for (int j = 1; j <= kosong; j++) {
                            System.out.print("-");         
}
                    } else {
                      for (int j = 1; j < kosong + 1; j++) {
                            System.out.print(" ");}}}
                System.out.println("");
                for (int i = 1; i <= counter; i++) {
                    for (int j = 1; j < kosong + 1; j++) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                    if (i != counter) {
                        for (int j = 1; j < kosong; j++) {
                            System.out.print(" ");}}}
                System.out.println("");            }
            for (int j = 0; j < kosong; j++) {
                System.out.print(" ");}
            while (globalStack.isEmpty() == false) {
                Node temp = (Node) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.data);
                    localStack.push(temp.pKiri);
                    localStack.push(temp.pKanan);
        if (temp.pKiri != null || temp.pKanan != null) {
                        kolomkosong = false;}
                    temp1++;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                    temp1++;}
                if (temp1 < counter) {
          for (int j = 0; j < kosong * 2 - 2; j++) {
                        System.out.print(" ");}}}
            temp1 = 0;
            counter = counter * 2;
            System.out.println();
            kosong /= 2;
            baris_pertama = false;
            while (localStack.isEmpty() == false) {
                globalStack.push(localStack.pop());}}}

    public static void main(String[] args) {
        AVLT t = new AVLT();
        t.sisipDt(3);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(4);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(6);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(5);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(15);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(10);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(20);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(17);
        t.inOrderTraversal();
        System.out.println();
        t.sisipDt(25);
        t.inOrderTraversal();
        System.out.println();
        t.displayTree();
        System.out.println();
        t.delete(3);
//        t.inOrderTraversal();
        System.out.println();
        t.displayTree();
        System.out.println();
        t.delete(5);
//        t.inOrderTraversal();
        System.out.println();
        t.displayTree();
        System.out.println();
        t.delete(10);
//        t.inOrderTraversal();
        System.out.println();
        t.displayTree();
    }
}
