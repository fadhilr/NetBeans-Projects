/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bukuAlamat;

import java.util.ArrayList;
public class BukuAlamat {
    static ArrayList <String> nama,alamat,alamatE ;
    static ArrayList <Long> notelpon;
    public BukuAlamat(){
        nama=new ArrayList<String>();
        alamat=new ArrayList<String>();
        notelpon=new ArrayList<Long>();
        alamatE=new ArrayList<String>();
    }
    public void setDataBuku(String n, String al,long not,String ala){
        nama.add(n);
        alamat.add(al);
        notelpon.add(not);
        alamatE.add(ala);
    }
    public ArrayList<String> getNama(){
        return nama;
    }
    public ArrayList<String> getAlamat(){
        return alamat;
    }
    public ArrayList<Long> getNotelp(){
        return notelpon;
    }
    public ArrayList<String> getEmail(){
        return alamatE;
    }
}
