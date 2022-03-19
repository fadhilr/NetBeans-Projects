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
public class nomor4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        System.out.println(fib(n));
    }
    static int fib(int n){
        int f;
        if (n==0) {
            f=0;
            return 0;
        } else if (n==1) {
            f=1;
            return 1;
        } else {
            f=fib(n-2)+fib(n-1);
            return f;
        }
        
    }
}
