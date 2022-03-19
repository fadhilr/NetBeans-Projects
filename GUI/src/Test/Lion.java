package projectakhirpl;

public class Lion extends Maskapai{
        public Lion(String pulau, String kota, int tgl, int bln) {
        super(pulau, kota, tgl, bln);
        this.pulau = pulau;
        this.pajakmaskapai = 0.2;
        biayaPulau();
        super.totalbiaya(pajakmaskapai);
    }

    @Override
    public double biayaPulau() {
        if (getPulau() == "Jawa") {
            return 250000;
        } else if (pulau == "Kalimantan") {
            return 350000;
        } else {
            return 450000;
        }
    }

    @Override
    public void display() {
        System.out.println("Lion Air");
        super.display();
    }
}
