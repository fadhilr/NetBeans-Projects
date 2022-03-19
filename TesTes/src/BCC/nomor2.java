/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BCC;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class nomor2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a[]=new int[6];
        
        for (int i = 1; i <= a.length; i++) {
            a[i]=input.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            a[i]=(a[i]+7)%10;
        }
        int temp;
        temp=a[1];
        a[1]=a[6];
        a[6]=temp;
        for (int i = 2; i <= 3; i++) {
            temp=a[i];
            a[i]=a[i+2];
            a[i+2]=a[i];
        }
        a=balikArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    static int[] balikArray(int []n){
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
