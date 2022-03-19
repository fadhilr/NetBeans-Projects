
import java.util.Scanner;


public class TesUTS {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan angka1\t:");
        int a= input.nextInt();
        System.out.print("Masukkan angka2\t:");
        int b= input.nextInt();
        System.out.print("Masukkan angka3\t:");
        int c= input.nextInt();
        
        if (a>b) {
            if (a>c) {
                if (b>c) {
                    System.out.printf("terima kasih, anda telah memasukkan angka %d %3d %3d\n",c,b,a);
                } else {
                    System.out.printf("terima kasih, anda telah memasukkan angka %d %3d %3d\n",b,c,a);
                }
                
            } else {
                System.out.printf("terima kasih, anda telah memasukkan angka %d %3d %3d\n",b,a,c);
            }
        } else {
            if (a>c) {
                System.out.printf("terima kasih, anda telah memasukkan angka %d %3d %3d\n",c,a,b);
            } else {
                if (b>c) {
                     System.out.printf("terima kasih, anda telah memasukkan angka %d %3d %3d\n",a,c,b);
                } else {
                     System.out.printf("terima kasih, anda telah memasukkan angka %d %3d %3d\n",a,b,c);
                }
            }
        }
        
    }
}
