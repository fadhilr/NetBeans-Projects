/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BCC;


import java.util.Scanner;


public class nomor1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int m=input.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        int selisih,temp=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    selisih=Math.abs(a[i]-b[j]);
                    if (selisih<temp) {
                        temp=selisih;
                    } 
                }
            }
            System.out.println(temp);
        }
    }

