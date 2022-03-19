/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihankuis;

import java.util.Scanner;


public class MainKebun {
    public static void main(String[] args) {
        Hewan zebra=new Hewan(59,120);
        Hewan singa=new Hewan(65,90);
        Hewan kuda=new Hewan(61,110);
        Tumbuhan apel= new Tumbuhan(2,"buah");
        Tumbuhan mangga= new Tumbuhan(1,"buah");
        Tumbuhan tomat= new Tumbuhan(1,"sayur");
        System.out.println("===============Hewan============");
        System.out.println("1. Zebra : ");
        zebra.setMakan("Tumbuhan");
        zebra.setBmi();
        System.out.println("2. Singa : ");
        singa.setMakan("Daging");
        singa.setBmi();
        System.out.println("3. Zebra : ");
        kuda.setMakan("Tumbuhan");
        kuda.setBmi();
        
        System.out.println("==========Tumbuhan==========");
        System.out.println("1. Apel");
        apel.setPanen();
        System.out.println("2. Mangga");
        mangga.setPanen();
        System.out.println("3. Tomat");
        tomat.setPanen();
        
        System.out.println("Jumlah hewan = "+Hewan.banyak);
        System.out.println("Jumlah tumbuhan = "+Tumbuhan.banyak);
    }
}
