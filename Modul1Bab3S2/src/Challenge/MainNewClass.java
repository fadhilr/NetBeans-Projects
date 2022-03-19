/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenge;

import java.util.Scanner;

public class MainNewClass {
    public static void main(String[] args) {
        
        boolean a=true;
        Scanner in = new Scanner (System.in);
        do{
            System.out.println("1. Tambah data");
            System.out.println("2. Keluar");
            System.out.print("pilihan : ");
            int pilihan = in.nextInt();
            switch(pilihan){
                case 1 : 
                    NewClass.tambahData();
                break;
                case 2 : 
                    a=false;
            }
        }while(a); 
    }
}

