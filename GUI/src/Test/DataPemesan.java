package projectakhirpl;

public class DataPemesan {

    private String nama, noID, jk, maskapai;

    public DataPemesan() {
    }

    public DataPemesan(String nama, String noID, String jk, String maskapai) {
        this.nama = nama;
        this.noID = noID;
        this.jk = jk;
        this.maskapai = maskapai;
    }

    public String getNama() {
        return nama;
    }

    public String getID() {
        return noID;
    }

    public String getJK() {
        return jk;
    }

    public String getMaskapai() {
        return maskapai;
    }

    public void Display() {
        System.out.println();
        System.out.println("Berikut adalah data pemesanan anda");
        System.out.println("Nama\t\t\t:" + getNama());
        System.out.println("No.Identitas\t\t:" + getID());
        System.out.println("Jenis Kelamin\t\t:" + getJK());
        System.out.println("Maskapai\t\t:" + getMaskapai());
    }
}
