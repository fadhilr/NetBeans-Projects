/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_ppp;
class Member implements JatimParkVisitor {

    public void visit(KomediPutar br) {
        System.out.println("1.Fasilitas yang Anda Dapatkan Yaitu" + br.getKomediPutar() + " dengan diskon ");
    }

    public void visit(Gokart lb) {
        System.out.println("2.Fasilitas yang Anda Dapatkan Yaitu" + lb.getGokart() + " dengan diskon ");
    }

    public void visit(KolamRenang kc) {
        System.out.println("3.Fasilitas yang Anda Dapatkan Yaitu" + kc.getKolamRenang() + " dengan diskon ");
    }
}
