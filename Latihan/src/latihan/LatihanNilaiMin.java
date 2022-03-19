/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;


public class LatihanNilaiMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan nilai 1=");
        int a=input.nextInt();
        System.out.print("Masukkan nilai 2=");
        int b =input.nextInt();
        System.out.print("Masukkan nilai 3=");
        int c=input.nextInt();
        minimum(a,b,c);
        
    }
    static int minimum(int a,int b, int c){
        int y= a>b ? (a>c? (b>c?c:b):b): (a>c?c: (b>c?a:b));
        System.out.println("y="+y);
        return y;
    }
}
