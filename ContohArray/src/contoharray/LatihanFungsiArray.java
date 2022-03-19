/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoharray;

import java.util.Scanner;

public class LatihanFungsiArray {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Scanner input1=new Scanner(System.in);
        System.out.println("Masukkan NIM : ");
        String nim=input.nextLine();
        System.out.println("Masukkan Nama : ");
        String nama=input.nextLine();
        
        String matkul[]= new String [4];
        int sks[]=new int [4];
        int nangka[]=new int [4];
        for (int i = 0; i <4 ; i++) {
            System.out.print("Masukkan mata kuliah : "+sks[i]);
            matkul[i]=input.nextLine();
        }
    }
}
