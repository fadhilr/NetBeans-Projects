package projectakhirpl;

public class Sriwijaya extends Maskapai{
        public Sriwijaya(String pulau, String kota, int tgl, int bln) {
        super(pulau, kota, tgl, bln);
        this.pulau = pulau;
        this.pajakmaskapai = 0.15;
        biayaPulau();
        super.totalbiaya(pajakmaskapai);
    }

    @Override
    public double biayaPulau() {
        if (pulau == "Jawa") {
            return 150000;
        } else if (pulau == "Kalimantan") {
            return 300000;
        } else {
            return 350000;
        }
    }

    @Override
    public void display() {
        System.out.println("Sriwijaya Air");
        super.display();
    }
}
