/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tes;

import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class Tes {

    /**
     * @param args the command line arguments
     * 0 1 1 2 3 5 8 13
     */
    public static void main(String[] args) {
        int n = 70;
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if (n==0) {
            return 0;
        } 
        if (n==1) {
            return 1;
        }else{
            return fib(n-1)+fib(n-2);
        }
        
    }
    
}
