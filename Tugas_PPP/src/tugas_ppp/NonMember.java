/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_ppp;


class NonMember implements JatimParkVisitor {

    public void visit(KomediPutar b) {
        System.out.println("1.Fasilitas Yang Anda Dapatkan Yaitu" + b.getKomediPutar() + " tanpa diskon ");
    }

    public void visit(Gokart l) {
        System.out.println("2.Fasilitas Yang Anda Dapatkan Yaitu" + l.getGokart() + " tanpa diskon ");
    }

    public void visit(KolamRenang k) {
        System.out.println("3.Fasilitas Yang Anda Dapatkan Yaitu" + k.getKolamRenang() + " tanpa diskon ");
    }
}