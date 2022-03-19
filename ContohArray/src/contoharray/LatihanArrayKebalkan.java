/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

import java.util.Scanner;


public class LatihanArrayKebalkan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan banyak elemen :");
        int n=input.nextInt();
        int data[]=new int[n];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai "+(i+1)+" = ");
            data[i]=input.nextInt();
        }
        data=urutArray(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
    }
    static int[] urutArray(int []n){
        int bil1 = 0;
        int bil2 = 0;
        while (bil1 < n.length) {
            bil2 = bil1;
            while (bil2 < n.length) {
                    int temp = n[bil1];
                    n[bil1] = n[bil2];
                    n[bil2] = temp;
                bil2++;
            }
            bil1++;
        }
        return n;
    }
}
