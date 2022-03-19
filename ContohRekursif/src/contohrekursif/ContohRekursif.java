package contohrekursif;

import java.util.Scanner;

public class ContohRekursif {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan nilai=");
        long n = input.nextLong();
        System.out.println("hasil=" + faktorialRekursif(n));

    }

    static long faktorialRekursif(long n) {

        if (n == 0) {
//        System.out.println(n+"!=");
            return (1);
        } else {

            return (n * faktorialRekursif(n - 1));
        }
    }
}
