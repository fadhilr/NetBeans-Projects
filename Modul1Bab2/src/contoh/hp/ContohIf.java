/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh.hp;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class ContohIf {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
//        int x,x1,x2,x3;
//                       
//        System.out.print("Masukkan nilai x\t:");
//        x= input.nextInt();
//        
//        if (x<2) {x1= x*x+2*x+1;
//            System.out.println("Rumus f(x)= x*x+2*x+1");
//            System.out.println("f(x)="+x1);  
//       
//        }else
//        if (x>=2 && x<=10) {x2= x*x*x+1;
//            System.out.println("Rumus f(x)= x*x*x+1");
//            System.out.println("f(x)="+x2);
//            
//        }else 
//        {x3= x*x*x*x+5*x;
//            System.out.println("Rumus f(x)= x*x*x*x+5*x");
//            System.out.println("f(x)="+x3);
//        
//        }
        int angka1, angka2, pilihan;
        System.out.print("Masukkan angka 1\t= ");
        angka1= input.nextInt();
        System.out.print("Masukkan angka 2\t= ");
        angka2= input.nextInt();      
        
        System.out.print("\n\tMENU\t\n");
        System.out.println("1.Tambah\n2.Kurang\n3.Bagi\n4.Kali");
        System.out.print("Masukkan menu yang dipilih\t:");
        pilihan= input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Hasilnya\t:"+angka1+angka2);
                break;
            case 2:
                System.out.println("Hasilnya\t:"+(angka1-angka2));
                break;
            case 3:
                System.out.println("Hasilnya\t:"+angka1/angka2);
                break;
            case 4:
                System.out.println("Hasilnya\t:"+angka1*angka2);
                break;
            default :
                System.out.println("Menu pilihan tidak ada");
        
        }
        
        
        }
    }    
    
