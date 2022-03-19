/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contohprojectn;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class ContohIF {
    public static void main(String[] args) {
//        int a= 8;
//        if (a>5){
//            System.out.println("Angka lebih besar dari lima");
//            System.out.println("Angka integer");
//        }else
//        {  System.out.println("Angka lebih kecil dari 5");}
//        Scanner input= new Scanner(System.in);
//        int a;
//        System.out.print("Masukkan angka\t:");
//        a= input.nextInt();
//        
//        if (a%5==0){System.out.println("Angka adalah kelipatan 5");
//        }else
//        {
//            System.out.println("Angka bukan kelipatan 5");
//        }
        Scanner input=new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan nilai mahasiswa\t:");
        nilai= input.nextInt();
        if (nilai>=60) {System.out.println("Mahasiswa Lulus");
        }
        else{System.out.println("Mahasiswa Gagal");
        }
    }
}
