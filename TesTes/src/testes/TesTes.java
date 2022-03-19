/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;
import java.util.Scanner;
public class TesTes {
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i==1&&(j==1||j==10)||i==2&&(j==2||j==9)||i==3&&(j==3||j==8)||i==4&&(j==4||j==7)) {
                    System.out.print("V");
                } else if (i==5&&j==5) {
                    System.out.println(" V");
                } else {
                }
{
                    System.out.print(" ");
                }
                
                
            }
            
            System.out.println();
            
        }
    }
}

