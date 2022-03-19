/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4bab5;

public class Prak_rekursif {

    public static void main(String[] args) {
        int hasil;
        int bilangan = 5;
        hasil = faktorial(bilangan);
        System.out.println("Nilai dari " + bilangan + "! adalah "
                + hasil);
    }

    private static int faktorial(int bil) {
        if (bil == 1) {
            return 1;
        } else {
            return (bil * faktorial(bil - 1));
        }
    }
}
