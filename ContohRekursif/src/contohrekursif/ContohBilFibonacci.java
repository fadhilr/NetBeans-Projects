package contohrekursif;

import java.util.Scanner;

public class ContohBilFibonacci {

    static int nG = 3;
    static boolean fibo;

    public static void main(String[] args) {

        fib(2 * nG);
        System.out.println("hasil=" + (fibo));
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai:");
        int n = input.nextInt();
        System.out.println(fib(n));
//        int fibo=fib(n);
//        if (n==fibo) {
//            System.out.println("yes");
//        } else {
//            System.out.println("no");
//        }
    }

    static int fib(int n) {
        int f;
        if (n == 0) {
            f = 0;
            if (f == nG) {
                fibo = true;
            }
            return 0;
        } else if (n == 1) {
            f = 1;
            if (f == nG) {
                fibo = true;
            }
            return 1;
        } else {
            f = fib(n - 2) + fib(n - 1);
            if (f == nG) {
                fibo = true;
            }
            return f;
        }
    }
}
