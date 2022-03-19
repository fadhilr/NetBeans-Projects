package contoh.hp;

import java.util.Scanner;


public class ContohHp {

     public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        long samsung, xiaomi, lg, sony;
        int sa, xi, l, so;
        samsung= 3000000;
        xiaomi= 2000000;
        lg=2500000;
        sony=1500000;
        
         System.out.print("Masukkan banyak samsung\t:");
         sa= input.nextInt();
         System.out.print("Masukkan banyak xiaomi\t:");
         xi= input.nextInt();
         System.out.print("Masukkan banyak LG\t:");
         l= input.nextInt();
         System.out.print("Masukkan banyak Sony\t:");
         so= input.nextInt();
         double discon1= sa*samsung*0.2,
                discon2= xi*xiaomi*0.15,
                discon3= l*lg*0.1,
                discon4= so*sony*0.05,
                harga1=0,
                harga2=0,
                harga3=0,
                harga4=0,
                nodisc1=0,
                nodisc2=0,
                nodisc3=0,
                nodisc4=0;
         
         System.out.println("\n============================COUNTER HP============================");
         if (sa>2) { harga1= samsung*sa - discon1;
             System.out.println("Anda mendapat diskon,harga samsung yang dibayar\t:Rp."+(int)harga1);
         } else {nodisc1= samsung*sa;
             System.out.println("Harga samsung tanpa diskon\t\t\t:Rp."+(int)nodisc1);
         }
         if (xi>2) {harga2= xiaomi*xi - discon2;
             System.out.println("Anda mendapat diskon,harga samsung yang dibayar\t:Rp."+(int)harga2);
         } else {nodisc2= xiaomi*xi;
             System.out.println("Harga xiaomi tanpa diskon\t\t\t:Rp."+(int)nodisc2);
         }
         if (l>2) { harga3= lg*l - discon3;
             System.out.println("Anda mendapat diskon,harga samsung yang dibayar\t:Rp."+(int)harga3);
             
         } else { nodisc3= lg*l;
             System.out.println("Harga LG tanpa diskon\t\t\t\t:Rp."+(int)nodisc3);
         }
         if (so>2) { harga4= sony*so - discon4;
             System.out.println("Anda mendapat diskon,harga samsung yang dibayar\t:Rp."+(int)harga4);
             
         } else { nodisc4= sony*so;
             System.out.println("Harga tanpa diskon\t\t\t\t:Rp."+(int)nodisc4);
         }
         System.out.println("Harga total dengan diskon\t\t\t:Rp."+ ((int)(harga1+harga2+harga3+harga4)));
         System.out.println("Harga total tanpa diskon\t\t\t:Rp."+ ((int)(nodisc1+nodisc2+nodisc3+nodisc4)));
         System.out.println("Harga total semuanya\t\t\t\t:Rp."+ 
                 ((int)(harga1+harga2+harga3+harga4+nodisc1+nodisc2+nodisc3+nodisc4)));
         System.out.println("==================================================================");
            }
    
}
