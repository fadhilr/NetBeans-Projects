/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication19;

/**
 *
 * @author U53R
 */
public class JavaApplication19 {

    /**
     * @param args the command line arguments
     */
    static int c = 10;

    public static void fungsi1(int i, int j, int k) {
        i = 5;
        j = j + i;
        c = 12;
        System.out.print(i + ",");
        System.out.print(j + ",");
        System.out.print(k + ",");
        System.out.println(c);
        k = 100;
    }

    public static void main(String[] args) {

        int i = 0, j = 0;
        do {
            for (j = 1; j <=3; j++);
            i += j;
        } while (i++ < 10);
        System.out.println(i);
        System.out.print(j);

    }

}
