/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soalBosnet;

import java.util.Scanner;

/**
 *
 * @author fadil
 */
public class Tes1 {
    static String input= "3\n" +
                            "E"+"E"+"N\n"+
                             "N"+"N"+"N\n"+
                             "E"+"N"+"N\n";
    public static void main(String[] args) {
        
        Scanner in = new Scanner(input);
        int t= in.nextInt();
        String a[][]=new String[t][t];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=in.nextLine();
            }
        }
        
    }
}
