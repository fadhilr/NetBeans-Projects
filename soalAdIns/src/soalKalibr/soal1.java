/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalKalibr;

import java.util.Scanner;

public class soal1 {
    static String input= "1\n" +
            "3\n"+
            "10\n"+
            "2\n";
     public static void main(String[] args) {
        int t=0;
        int a=0;
        int b=0;
        int k=0;
        Scanner in = new Scanner(input);
        t= in.nextInt();
         for (int i = 1; i <= t; i++) {
             a= in.nextInt();
             b= in.nextInt();
             k= in.nextInt();
             int hasil=0;
             for (int j = a; j <= b; j++) {
                 if (j%k==0) {
                     hasil++;
                 }
             }
             System.out.println("Case "+i+": "+hasil);
//             check(a,b,k,i);
         }
    }
}
