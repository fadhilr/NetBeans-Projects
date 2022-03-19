
package latihankuis;

public class Hewan {
    private int berat;
    private int tinggi;
    static int banyak;
    private String makan;
    
    public Hewan(int b, int t){
        berat=b;
        tinggi=t;
        banyak++;
    }
    public void setMakan(String makan){
        this.makan=makan;
        System.out.println("Makanan : "+makan);
    }
    public void setBmi(){
        System.out.println("BMI : "+(Math.pow(berat/tinggi, 2)));
        System.out.println("");
    }
}
