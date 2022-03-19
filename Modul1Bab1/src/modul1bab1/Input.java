/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab1;

import java.util.Scanner;

/**
 *
 * @author U53R
 */
public class Input {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        int nilai1, nilai2, hasil;
        System.out.println("Masukkan nilai 1 : ");
        nilai1= input.nextInt();
        System.out.println("Masukkan nilai 2 : ");
        nilai2= input.nextInt();
        hasil=nilai1+nilai2;
        System.out.println("Maka hasil : "+hasil);
    }
}
