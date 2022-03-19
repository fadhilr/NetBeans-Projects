
package contohpengulangan;

/**
 *
 * @author guest-2wSHWF
 */
public class ContohPengulangan {

    public static void main(String[] args) {
        int a,jumlah = 0;
        for(a=20;a>=1;a--){
            if (a==1) 
                System.out.print(a+"=");
             else 
                System.out.print(a+"+");
         jumlah += a;
        }
         System.out.println(jumlah);
    }
}
