/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Scanner;

public class ContohQuis2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Nama karyawan\t:");
        String nama=input.nextLine();
        System.out.print("Jam kerja\t:");
        int jjam=input.nextInt();
        System.out.print("Input istri\t:");
        int jistri=input.nextInt();
        System.out.print("Jumlah anak\t:");
        int janak=input.nextInt();
        System.out.print("Arisan (y/n)\t:");
        String arisan=input.next();
        System.out.print("BPJS (y/n\t:");
        String bpjs=input.next();
        
        System.out.println("\tSlip Gasji Karyawan");
        System.out.println("==============================");
        int pendapatan=10000*jjam;
        double bonus=0,
                potongan=0;
        if (jistri>0 && janak==0) {
            bonus= 4000000*0.05;
        } else if (jistri>0 && janak<=2) {
            bonus=4000000*0.1;
        } else if (jistri>0 && janak>2) {
            bonus=4000000*0.15;
        } else {
            bonus= 4000000 *(janak*0.01);
        }
        if (bpjs.equalsIgnoreCase("y")&&arisan.equalsIgnoreCase("y")) {
            potongan= 3000000*0.15;
        } else if (bpjs.equalsIgnoreCase("y")||arisan.equalsIgnoreCase("y")) {
            potongan=3000000*0.1;
        } else {
            potongan=3000000;
        }
        System.out.println("Nama\t\t:"+nama);
        System.out.println("Jumlah jam kerja:"+jjam);
        System.out.println("Pendapatan\t:"+(int)pendapatan);
        System.out.println("Bonus\t\t:"+(int)bonus);
        System.out.println("Potongan\t:"+(int)potongan);
        System.out.println("---------------------------");
        System.out.println("Diterima\t:"+(int)(pendapatan+bonus-potongan));

//        if (jistri>0) {
//            if (janak==0) {
//                bonus=  pendapatan*0.05;
//                if (janak<=2) {
//                    bonus=pendapatan*0.1;
//                } else {
//                    bonus=pendapatan*0.15;
//                }
//            }
//        } else {
//        }
    }
}
