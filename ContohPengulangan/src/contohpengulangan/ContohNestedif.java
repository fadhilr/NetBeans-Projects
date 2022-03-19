/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohpengulangan;

import java.util.Scanner;

/**
 *
 * @author guest-2wSHWF
 */
public class ContohNestedif {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Masukkan angka\t:");
        int a= input.nextInt();
        
        if(a>=10)
            if(a>=40)
                if(a>=70)
                    if(a>=80)
                        if(a>100)
                        {
                            System.out.println("Error");
                            System.out.println("");
                        }
                        else 
                            System.out.println("A");
                    else 
                        System.out.println("B");
                else 
                    System.out.println("C");
            else 
                System.out.println("D");
        else 
            System.out.println("E");
        
    }
}
