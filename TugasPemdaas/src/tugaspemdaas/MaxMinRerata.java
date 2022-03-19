/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspemdaas;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class MaxMinRerata {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
//        int a,b,c;
//        System.out.println("Masukkan angka pertama\t:");
//        a= input.nextInt();
//        System.out.println("Masukkan angka kedua\t:");
//        b= input.nextInt();
//        System.out.println("Masukkan angka ketiga\t:");
//        c= input.nextInt();
//        
//        double max, min, rata;
//        rata= (a+b+c)/3;
//        max= a>=b? (a>=c? (b>=c ? a:a):c) : (a>=c?b:(b>=c?b :c));
//        min= a>=b? (a>=c? (b>=c? c:b):b) : (a>=c?a :(b>=c? a:a));
//        System.out.println("Maka nilai terbesar\t:"+max);
//        System.out.println("Maka nilai terkecil\t:"+min);
//        System.out.println("Maka nilai rata-rata\t:"+rata);
        int a,b,c;
        System.out.println("Masukkan angka pertama");
        a= input.nextInt();
        System.out.println("Masukkan angka kedua");
        b= input.nextInt();
        System.out.println("Masukkan angka ketiga");
        c= input.nextInt();
        
        if (a>b && b > c)
            System.out.println("max" + a + " min" + c);
         else if (b > c && c > a)
              System.out.println("max " + b + " min " + a);
          else if (c > a && a > b)
              System.out.println("max " + c + " min " + b);
        
        
                
          
    }
}
