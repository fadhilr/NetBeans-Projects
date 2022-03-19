/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package identifier;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class LaatihanFungsi {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nim= ");
        long nim=in.nextLong();
        System.out.print("Masukkan nama= ");
        String nama=in.next(); 
        System.out.println("Masukkan mata kuliah 1 = ");
        String matkul=in.nextLine();
        System.out.print("Masukkan jumlah sks= ");
        int sks=in.nextInt();
        System.out.print("Masukkan nilai (angka)= ");
        double nilai=in.nextInt();
        System.out.println("Masukkan mata kuliah 2= ");
        String matkul1=in.nextLine();
        System.out.print("Masukkan jumlah sks= ");
        int sks1=in.nextInt();
        System.out.print("Masukkan nilai (angka)= ");
        double nilai1=in.nextInt();
        System.out.println("Masukkan mata kuliah 3= ");
        String matkul2=in.nextLine();
        System.out.print("Masukkan jumlah sks= ");
        int sks2=in.nextInt();
        System.out.print("Masukkan nilai (angka)= ");
        double nilai2=in.nextInt();
        System.out.println("Masukkan mata kuliah 4= ");
        String matkul3=in.nextLine();
        System.out.print("Masukkan jumlah sks= ");
        int sks3=in.nextInt();
        System.out.print("Masukkan nilai (angka)= ");
        double nilai3=in.nextInt();
        
    }
    
    static void kondisi(double nilai){
        if (nilai>3.5&&nilai<=4) {
            System.out.println("A");
        } else if (nilai>3) {
            System.out.println("B+");
        } else if (nilai>2.5) {
            System.out.println("B");
        } else if (nilai>2) {
            System.out.println("C+");
        } else {
            System.out.println("C");
        }
        
    }
    static void rumus(String matkul, int sks){
        
    }
}
