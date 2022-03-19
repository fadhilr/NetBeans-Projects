package projectakhirpl;

public abstract class Maskapai {
    protected String pulau, kota;
    protected int tgl, bln;
    protected double biayatgl, biayabln, biayadestinasi, biaya, biayatotal;
    protected double pajak, pajakmaskapai;

    public Maskapai(String pulau, String kota, int tgl, int bln) {
        this.pulau = pulau;
        this.kota = kota;
        this.tgl = tgl;
        this.bln = bln;
        biayaTgl();
        biayaBln();
    }

    public String getPulau() {
        return pulau;
    }

    public String getKota() {
        return kota;
    }
    public void biayaTgl() {
        if (tgl >= 1 && tgl <= 20) {
            biayatgl = 100000;
        } else if (tgl > 20 && tgl <= 31) {
            biayatgl = 150000;
        }
    }

    public double getbiayaTgl() {
        return biayatgl;
    }

    public void biayaBln() {
        if (bln >= 1 && bln <= 6) {
            biayabln = 50000;
        } else if (bln >= 7 && bln <= 12) {
            biayabln = 100000;
        }
    }

    public double getbiayaBln() {
        return biayabln;
    }

    public abstract double biayaPulau();

    public void totalbiaya(double pajakmaskapai) {
        biaya = getbiayaTgl() + getbiayaBln() + biayaPulau();
        pajak = biaya * pajakmaskapai;
        biayatotal = biaya + pajak;
    }

    public double getTotalBiaya() {
        return biayatotal;
    }

    public void display() {
        System.out.println("Destinasi\t: " + getPulau() + " -- " + getKota());
        System.out.println("Tanggal\t\t: " + tgl + " - " + bln);
        System.out.println("Biaya\t\t: " +getTotalBiaya());
    }
}
