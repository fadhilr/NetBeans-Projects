/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul1bab3;

import java.util.Scanner;


public class Tugas2Bab3 {
    public static void main(String[] args) {
        
        
        for (int i = 1; i <=8; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i==1&&j>=1||i==4&&j>=1 ||i>=2&&i<=7&&j==1) {
                    System.out.print("F");
                } else {
                    System.out.print(" ");
                }   
            }
            System.out.println("");
        }
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i==1&&j==6||i==2&&(j==5||j==7) ||i==3&&(j==4||j==8)||i==4&&j>=3&&j<=9) {
                    System.out.print("A");
                } else if (i==5&&(j==2||j==10) ||i==6&&(j==1||j==11)) {
                    System.out.print("A");
                } else {
                    System.out.print(" ");
                }
            }
                
            System.out.println("");
        }
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i==1&&j>=1&&j<=8||i==2&&j==9 ||i==3&&j==10||i==4&j==11||i==5&&j==10||i<=7&&j==1) {
                    System.out.print("D");
                } else if (i==6&&j==9 ||i==7&&j>=1&&j<=8) {
                    System.out.print("D");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i<=7&&(j==1||j==11) ||i==4&&j>=1) {
                    System.out.print("H");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i==1&&j>=4&&j<=8 ||i==7&&j>=4&&j<=8||i<=7&&j==6) {
                    System.out.print("I");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for (int i = 1; i <= 8; i++) {
            for (int j = 1; j <= 11; j++) {
                if (i==7&&j>=1||i<=7&&j==1) {
                    System.out.print("L");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }    
}
