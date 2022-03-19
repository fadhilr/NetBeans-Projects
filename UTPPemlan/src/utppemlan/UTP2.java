/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utppemlan;

/**
 *
 * @author U53R
 */
public class UTP2 {
    private int saldo,nomorrek, transfer;
    private String nama, password,bank;
    public UTP2 (String n, String p, int s){
        nama=n;
        password=p;
        saldo=s;
    }
    public void infoSaldo(){
        System.out.println("Sisa saldo anda adalah : "+saldo);
    }
    public void cekPassword(){
        System.out.println("Password anda adalah : "+password);
    }
    public int penarikan(int u){
        if (saldo>u) {
            saldo-=u;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
        return saldo;
    }
    public void transfer(int nr, int u){
        nomorrek=nr;
        transfer=u;
        if (saldo>u) {
            saldo-=u;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
        
    }
    public void transfer(int nr, int u,String b){
        nomorrek=nr;
        transfer=u;
        if (saldo>u) {
            saldo-=u;
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
        bank=b;
    }
    public void display(){
        System.out.println("Anda telah melakukan transfer uang sebesar "+transfer
        +" ke bank "+bank+" dan nomor rekening "+nomorrek+" yang dimaksud");
    }
}
