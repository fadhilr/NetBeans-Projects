/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3bab4;

public class Array1 {

    public static void main(String args[]) {
        int bil[] = new int[10];
        int i;
        for (i = 0; i <= 9; i++) {
            bil[i] =1+(int) ((Math.random() * 100));
        }
        for (i = 0; i <= 10; i++) {
            System.out.println(bil[i]);
        }
    }
}
