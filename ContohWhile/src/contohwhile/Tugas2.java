/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;

import java.util.Scanner;


public class Tugas2 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan nilai n\t=");
        int n=input.nextInt();
        int x,j=1;
        if (n%2==1) {
            for (int i = 1; i <= n; i++) {
                if (i==(n/2)+1) {
                    for ( j = 1; j <= n; j++) {
                        System.out.print(j+" ");
                        
                    }
                }else {
                   
                    for ( j = 1; j <= n-1; j++) {
                        if (j<=9) {
                            System.out.print(" ");
                        } else {
                            System.out.print("  ");
                        }
                        
                    }
                   
                    System.out.print(i);
                }
                
                System.out.println();
            }
        }else {
            for (int i = 1; i <= n; i++) {
                if (i==(n/2)+1) {
                    
                    for ( j = 1; j <= n; j++) {
                        System.out.print(j+" ");
                        
                    }
                }else {
                    
                    for ( j = 1; j <= n; j++) {
                        System.out.print(" ");
                    }
                    System.out.print(i);
                }
                
                System.out.println();
            }
        } 
        
    }
    
}
