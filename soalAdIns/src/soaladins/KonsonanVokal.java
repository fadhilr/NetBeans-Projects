/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soaladins;

/**
 *
 * @author fadil
 */
public class KonsonanVokal {
    public static void main(String[] args) {
        int vokal = 0;
        int konsonan = 0;
        String k = "sayamakannasigoreng";
        char[] x = k.toCharArray();

        for (int i = 0; i < x.length; i++) {
            if (x[i] == 'a' || x[i] == 'i' || x[i] == 'u' || x[i] == 'e' || x[i] == 'o') {
                vokal += 1;
            } else {
                konsonan += 1;
            }
        }

        System.out.println("Vokal :" + vokal);
        System.out.println("Konsonan :" + konsonan);
    }
}
