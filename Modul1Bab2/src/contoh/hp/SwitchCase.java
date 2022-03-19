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
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String hari;
        System.out.println(">>>>>>>>>>>>>-kalender kehidupan-<<<<<<<<<<<<<<");
        System.out.print("Masukkan hari\t:");
        hari= input.nextLine();
        
        switch (hari){
            case "senin":
                System.out.println("belajar");
                break;
            case "selasa":
                System.out.println("istirahat");
                break;
            case "rabu":
                System.out.println("bermain");
                break;
            case "kamis":
                System.out.println("tidur");
                break;
            case "jumat":
                System.out.println("makan");
                break;
            case "sabtu":
                System.out.println("berenang");
                break;
            case "minggu":
                System.out.println("gaming");
                break;
            default :
                System.out.println("menghayal");
        }
        System.out.println("");
    }
}
