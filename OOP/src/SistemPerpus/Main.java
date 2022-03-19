
package SistemPerpus;

import Login.Login;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan ID\t\t=");
        String nama=input.nextLine();
        Login orang1=new Login(nama);
        orang1.login();
    }
}
