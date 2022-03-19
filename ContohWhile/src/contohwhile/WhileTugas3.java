/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohwhile;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class WhileTugas3 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan nilai n\t:");
        int n=input.nextInt();
        
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
        int i=1;
        while (i<=n) {
            int j=1;
            while (j<=i) {
                
                    System.out.print("*");
                
                j++;
            }
            System.out.println("");
            i++;
            
        }
        
    }
}
