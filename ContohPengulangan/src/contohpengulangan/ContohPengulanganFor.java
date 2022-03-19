package contohpengulangan;

/**
 *
 * @author U53R
 */
public class ContohPengulanganFor {

    public static void main(String[] args) {
//        int x,y;
//        for(x=1;x<=5;x++){
//            for(y=1;y<=5;y++){
//                if(y%2==1)
//                System.out.print("*");
//                else
//                System.out.print("-");
//                
//            }
//            System.out.println("");
//            
//        }
        
        
//        int x,y;
//        for(x=1;x<=4;x++){
//            for(y=1;y<=x;y++){
//                System.out.print("*");
//                
//            }
//            System.out.println("");
//        }
        
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println("");
        }
        
//        
//        int x,y;
//        for ( x = 1; x < 5; x++) 
//            for(y=5; y>1; y--)
//                System.out.println("x:"+x+"\ty:"+y);
//            
        
//        
//        int i,jumlah=0;
//        for(i=1;i<=100;i++){
//            
//            if (i%2==1){
//                System.out.print(i+"-");
//                jumlah= jumlah+i;
//            }
//            else if (i%2==0){
//                System.out.print(i+"+");
//                jumlah=i-jumlah;
//            }
//        }
//        System.out.println(jumlah);
        
//        int i, jumlah=1;
//        for(i=2;i<17;i=i+2){
//            if (i==16)
//                System.out.print(i+"=");
//            
//            else
//                System.out.print(i+"*");
//                jumlah= jumlah*i;
//            
//        }
//        System.out.println(jumlah);
        int []aritmatika=new int [10];
        int a=1,b=3;
        for (int i = 0; i <aritmatika.length; i++) {
            aritmatika[i]=a+(b*i);
        }
        for (int i = 0; i <aritmatika.length; i++) {
            System.out.println(aritmatika[i]);
        }
        System.out.println("");
        
    }
}
