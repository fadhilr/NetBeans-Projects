/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

public class ContohAscii {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("masukkan");
        int bil=input.nextInt();
        
        if (bil==2 || bil==3||bil==5) {
            System.out.println("Bilangan prima");
        }
    }
}
