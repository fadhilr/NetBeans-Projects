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
public class ContohSwitchCase {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.print("Masukkan kata\t:");
        String jurusan = input.nextLine();
        
        if(jurusan.equals("TekNik Informatika"))
            System.out.println("IF 1");
        if(jurusan.equalsIgnoreCase("TEKNIK INFORMATIKA"))
            System.out.println("IF 2");
        if(jurusan.equalsIgnoreCase("TekNIk InFORmatika"))
            System.out.println("IF 3");
        if(jurusan.equals("TekNIk InFORmatika"))
            System.out.println("IF 4");
//        int a=10;
//        String nilai= "222";
        
//        switch (a){
//            case 10:
//                System.out.println("INI 10");
//                break;
//            case 20:
//                System.out.println("INI 20");
//                break;
//            case 30:
//                System.out.println("INI 30");
//                break;
//            default:
//                System.out.println("INI ANI");
//                break;
//        }
       
    }
}
