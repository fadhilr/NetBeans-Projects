/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

import java.util.Scanner;


public class LatihanArrayMedian {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan banyak elemen : ");
        int n=input.nextInt();
        int data[]=new int[n];
        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+" = ");
            data[i]=input.nextInt();
        }
        System.out.println("");
        int bil1 = 0;
        int bil2 = 0;
        while (bil1 < data.length) {
            bil2 = bil1;
            while (bil2 < data.length) {
                if (data[bil1] > data[bil2]) {
                    int temp = data[bil1];
                    data[bil1] = data[bil2];
                    data[bil2] = temp;
                }
                bil2++;
            }
            bil1++;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  ");
        }
        System.out.println("");
        System.out.println("Nilai median : "+median(data));
        
    }
    static double median(int []n){
        int m;
        if (n.length%2==1) {
            m=n.length/2;
            return n[m];
        } else {
            m=(n.length/2);
            return (n[m]+n[m-1])/2.0;
        }
        
        
    }
}
