/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rasional;

public class Rasional {

    private int pembilang, penyebut;
    private int pembilang1, penyebut1;
    private int pembilang2, penyebut2;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
        pembilang1 = pbl;
        penyebut1 = pyb;
        pembilang2 = pbl;
        penyebut2 = pyb;
    }
//mengecek suatu bilangan adalah rasional atau bukan

    public boolean isRasional() {
        return (penyebut != 0);
    }
//menyederhanakan bilangan rasional

    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        for (B=pembilang; B != 0;) {
            temp = A % B;
            A = B;
            B = temp;
        }
        pembilang /= A;
        penyebut /= A;
    }

    public double Cast() {
        return (penyebut == 0.0) ? 0.0 : (double) pembilang
                / (double) penyebut;

    }
//oprator >

    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }
//operator Unary- ---> A = -A

    public void negasi() {
        pembilang = -pembilang;
        pembilang1 = -pembilang1;
        pembilang2 = -pembilang2;
    }
//operator unary += \

//    public void unaryPlus(Rasional A) {
//        pembilang = pembilang * A.penyebut + penyebut
//                * A.pembilang;
//        penyebut *= A.penyebut;
//    }
    public void unaryMinus(Rasional A) {
        pembilang = pembilang * A.penyebut - penyebut
                * A.pembilang;
        penyebut *= A.penyebut;
    }
    public void unaryKali(Rasional A){
        pembilang1 *=A.pembilang1;
        penyebut1*=A.penyebut1;
    }
    public void unaryBagi(Rasional A){
        pembilang2 *=A.penyebut2;
        penyebut2*=A.pembilang2;
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);        
    }
    public void cetak1() {
        System.out.println(pembilang1 + "/" + penyebut1);        
    }
    public void cetak2() {
        System.out.println(pembilang2 + "/" + penyebut2);        
    }
    public boolean lessThan(Rasional A){
        return (pembilang*A.penyebut<penyebut*A.pembilang);
    }
    public boolean lessThanEqual(Rasional A){
        return (pembilang*A.penyebut<=penyebut*A.pembilang);
    }
    public boolean moreThanEqual(Rasional A){
        return (pembilang*A.penyebut>=penyebut*A.pembilang);
    }
}
