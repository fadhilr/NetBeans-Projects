/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

import java.util.Scanner;

public class LatihanArraySelectionMin {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Masukkan banyak data : ");
        int n= input.nextInt();
        int data[]=new int [n]; 
        data=inputArray(data);
        System.out.println("Data yang berurutan :");
        data=urutArray(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println("Index  ke  " + (i + 1) + "  :  "+ data[i]);
        }
    }
    static int[] inputArray(int[]n){
        Scanner input= new Scanner(System.in);
        int a=1;
        for (int i = 0; i < n.length; i++) {
            System.out.print("Masukkan data "+a+" = ");
            n[i]=input.nextInt();
            a++;
        }
        return n;
    }
    static int[] urutArray(int []n){
        
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                if (n[i]<n[j]) {
                    double temp = n[i];
                    n[i]=n[j];
                    n[j]=(int) temp;
                }
            }
        }
        return n;
    }
}
