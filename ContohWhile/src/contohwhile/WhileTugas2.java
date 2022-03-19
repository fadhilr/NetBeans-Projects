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
public class WhileTugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai n\t:");
        int n = input.nextInt();
        int x = 1;
        for (int i = 1; i <= n; i++) {
            if (x == 8) {
                x =1 ;
                System.out.print(x);
                
            }else{
            System.out.print(x);
        }
            x++;
        }
    }
}
