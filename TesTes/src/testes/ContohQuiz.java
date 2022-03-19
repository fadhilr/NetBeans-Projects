/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

public class ContohQuiz {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.print("Apakah punya kartu member\t:");
        String member=input.next();
        System.out.println("Program kasir:");
        System.out.print("Jumlah mie yang dibeli\t\t:");
        int jmie=input.nextInt();
        System.out.print("Jumlah pensil yang dibeli\t:");
        int jpensil=input.nextInt();
        System.out.print("Jumlah buku yang dibeli\t\t:");
        int jbuku=input.nextInt();
        System.out.print("Jumlah snack yang dibeli\t:");
        int jsnack=input.nextInt();
        System.out.print("Jumlah minum yang dibeli\t:");
        int jminum=input.nextInt();
        
        System.out.println("===============================================");
        System.out.println("\t\tProgram Kasir Sederhana");
        System.out.println("===============================================");
        System.out.printf("%s %15s %15s %15s \n","Nama item","Harga","jumlah item","total harga");
        int mie=2000,
                buku=3000,
                pensil=1500,
                minum =5000,
                snack=2500;
        int hmie=jmie*mie,
                hbuku=jbuku*buku,
                hpensil=jpensil*pensil,
                hminum=jminum*minum,
                hsnack=jsnack*snack;
        
        int total= hmie+hbuku+hpensil+hminum+hsnack;
        double diskon=0;
        System.out.printf("%s %14d %10d %13d \n","Mie instan",mie,jmie,hmie);
        System.out.printf("%s %20d %10d %13d \n","Buku",buku,jbuku,hbuku);
        System.out.printf("%s %18d %10d %13d \n","Pensil",pensil,jpensil,hpensil);
        System.out.printf("%s %10d %10d %13d \n","Minuman ringan",minum,jminum,hminum);
        System.out.printf("%s %19d %10d %13d \n","Snack",snack,jsnack,hsnack);
        System.out.println("-------------------------------------------");
        System.out.println("Harga jual\t\t\t"+total);
        if (member.equalsIgnoreCase("y")) {
            if (total<50000) {
            diskon= (total*0.15);
        } else if (total<=100000) {
            diskon=(total*0.2);
        } else {
            diskon= total*0.25;
            
        }
        }else {
        if (total<50000) {
            diskon= total;
        } else if (total<=100000) {
            diskon=(total*0.05);
        } else {
            diskon= (total*0.1);
        }
        }
        int total1=(int) (total-diskon);
        System.out.println("Diskon\t\t\t\t"+(int)diskon);
        System.out.println("--------------------------------------------");
        System.out.println("Total\t\t\t\t"+total1);
        System.out.print("Tunai\t\t\t\t");
        int tunai=input.nextInt();
        System.out.println("Kembali\t\t\t\t"+(int)(tunai-total1));
    }
}
