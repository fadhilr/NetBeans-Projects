/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab4;

public class Array3 {

    public static void main(String args[]) {
        int a[] = {2, 7, 6, 8, 1};
        int b[] = {3, 4, 2, 8, 9, 7, 2, 7, 5};
        int pjg;
        pjg = Math.max(a.length, b.length);
        int c[] = new int[pjg];
        for (int i = 0; i < pjg; i++) {
            if (a.length < i + 1) {
                c[i] = b[i];
            } else if (b.length < i + 1) {
                c[i] = a[i];
            } else {
                c[i] = a[i] + b[i];
            }
            System.out.print(c[i] + " \n");
        }int a1=0,a2=0,b2=0,b1=0,c2=0,c1=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0) {
                a1+=a[i];
            } else {
                a2+=a[i];
            }
        }System.out.println("Jumlah genap array a[] = "+a1);
        System.out.println("Jumlah ganjil array a[] = "+a2);
        for (int i = 0; i<b.length; i++) {
            if (b[i]%2==0) {
                b1+=b[i];
            } else {
                b2+=b[i];
            }
        }System.out.println("Jumlah genap array a[] = "+b1);
        System.out.println("Jumlah ganjil array a[] = "+b2);
        for (int i = 0; i<c.length; i++) {
            if (c[i]%2==0) {
                c1+=c[i];
            } else {
                c2+=c[i];
            }
        }System.out.println("Jumlah genap array a[] = "+c1);
        System.out.println("Jumlah ganjil array a[] = "+c2);
    }
}
