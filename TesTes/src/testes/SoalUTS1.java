/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;


public class SoalUTS1 {
    public static void main(String[] args) {
        int a1,a2,a3,a4,a5,a6,a7,a8,a9;
        int b1,b2,b3,b4,b5,b6,b7,b8,b9,x;
        Scanner input=new Scanner(System.in);
        System.out.println("OPERASI MATRIK");
        System.out.println("Matrik A :");
        a1=input.nextInt();
        a2=input.nextInt();
        a3=input.nextInt();
        a4=input.nextInt();
        a5=input.nextInt();
        a6=input.nextInt();
        a7=input.nextInt();
        a8=input.nextInt();
        a9=input.nextInt();
        
        System.out.println("Matrik B :");
        b1=input.nextInt();
        b2=input.nextInt();
        b3=input.nextInt();
        b4=input.nextInt();
        b5=input.nextInt();
        b6=input.nextInt();
        b7=input.nextInt();
        b8=input.nextInt();
        b9=input.nextInt();
        
        System.out.println("1. Penjumlahan matrik A+B");
        System.out.println("2. Pengurangan matrik A-B");
        System.out.println("3. Keluar");
        System.out.println("Masukkan pilihan anda :");
        x=input.nextInt();
        switch (x){
            case 1:
                System.out.println("C=A+B");
                System.out.printf("%d %3d %3d\n",a1+b1,a2+b2,a3+b3);
                System.out.printf("%d %3d %3d\n",a4+b4,a5+b5,a6+b6);
                System.out.printf("%d %3d %3d\n",a7+b7,a8+b8,a9+b9);
                break;
            case 2:
                System.out.println("C=A-B");
                System.out.printf("%d %3d %3d\n",a1-b1,a2-b2,a3-b3);
                System.out.printf("%d %3d %3d\n",a4-b4,a5-b5,a6-b6);
                System.out.printf("%d %3d %3d\n",a7-b7,a8-b8,a9-b9);
                break;
            case 3:
                System.out.println("Pilihan tidak ada, akan keluar dari program");
                break;
            default :
        }
    }
}
