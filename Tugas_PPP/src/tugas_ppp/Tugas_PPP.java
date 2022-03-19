/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_ppp;

interface HotelVisitor {

    void visit(BedRoom br);

    void visit(Lobby lb);

    void visit(Kitchen kc);
}

interface hotel {

    void accept(HotelVisitor hv);
}

class BedRoom implements hotel {

    public void accept(HotelVisitor hv) {
        hv.visit(this);
    }

    public String getBedRoom() {
        return " BedRoom";
    }
}

class Lobby implements hotel {

    public void accept(HotelVisitor v) {
        v.visit(this);
    }

    public String getLobby() {
        return " Lobby";
    }
}

class Kitchen implements hotel {

    public void accept(HotelVisitor v) {
        v.visit(this);
    }

    public String getKitchen() {
        return " Kitchen";
    }
}

class VIPGuest implements HotelVisitor {

    public void visit(BedRoom br) {
        System.out.println("1.Fasilitas yang Anda Dapatkan Yaitu" + br.getBedRoom() + " VIP ");
    }

    public void visit(Lobby lb) {
        System.out.println("2.Fasilitas yang Anda Dapatkan Yaitu" + lb.getLobby() + " VIP ");
    }

    public void visit(Kitchen kc) {
        System.out.println("3.Fasilitas yang Anda Dapatkan Yaitu" + kc.getKitchen() + " VIP ");
    }
}

class RegularGuest implements HotelVisitor {

    public void visit(BedRoom b) {
        System.out.println("1.Fasilitas Yang Anda Dapatkan Yaitu" + b.getBedRoom() + " Reguler ");
    }

    public void visit(Lobby l) {
        System.out.println("2.Fasilitas Yang Anda Dapatkan Yaitu" + l.getLobby() + " Reguler ");
    }

    public void visit(Kitchen k) {
        System.out.println("3.Fasilitas Yang Anda Dapatkan Yaitu" + k.getKitchen() + " Reguler ");
    }
}

public class Tugas_PPP {

    public static void main(String[] args) {
        hotel[] list = {new BedRoom(), new Lobby(), new Kitchen()};
        VIPGuest vip = new VIPGuest();
        RegularGuest reg = new RegularGuest();

        System.out.println("FASILITAS PEMESANAN HOTEL PADA VIP GUEST");
        for (hotel hotel : list) {
            hotel.accept(vip);
        }

        System.out.println("");
        System.out.println("FASILITAS PEMESANAN HOTEL PADA REGULAR GUEST");
        for (hotel hotel : list) {
            hotel.accept(reg);
        }

    }
}

