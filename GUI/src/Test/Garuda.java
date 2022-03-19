package projectakhirpl;

public class Garuda extends Maskapai {
    public Garuda(String pulau, String kota, int tgl, int bln) {
        super(pulau, kota, tgl, bln);
        this.pulau = pulau;
        this.pajakmaskapai = 0.05;
        biayaPulau();
        super.totalbiaya(pajakmaskapai);
    }
    
    @Override
    public double biayaPulau() {
        if (pulau == "Jawa") {
            return 200000;
        } else if (pulau == "Kalimantan") {
            return 300000;
        } else {
            return 400000;
        }
    }

    @Override
    public void display() {
        System.out.println("Garuda Indonesia");        
        super.display();
    }
}
